package com.panduwidiatmika.ajr_10138.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.panduwidiatmika.ajr_10138.MainActivity;
import com.panduwidiatmika.ajr_10138.R;
import com.panduwidiatmika.ajr_10138.model.Promo;

import java.util.ArrayList;
import java.util.List;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.ViewHolder> implements Filterable{
    private List<Promo> promoList, filteredPromoList;

    private Context context;

    public PromoAdapter(List<Promo> promoList, Context context){
        this.promoList=promoList;
        filteredPromoList=new ArrayList<>(promoList);
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_promo, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Promo promo = filteredPromoList.get(position);
        holder.tvKodePromo.setText(promo.getKODE_PROMO());
        holder.tvJenisPromo.setText(promo.getJENIS_PROMO());
        holder.tvKeteranganPromo.setText(promo.getKETERANGAN_PROMO());
        holder.tvIdPromo.setText(String.valueOf(promo.getID_PROMO()));
        holder.tvStatusPromo.setText(promo.getSTATUS_PROMO());
        holder.tvDiskonPromo.setText(String.valueOf(promo.getDISKON_PROMO()));
    }
    @Override
    public int getItemCount() {
        return filteredPromoList.size();
    }
    public void setPromoList(List<Promo> promoList) {
        this.promoList = promoList;
        filteredPromoList = new ArrayList<>(promoList);
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charSequenceString = charSequence.toString();
                List<Promo> filtered = new ArrayList<>();
                if (charSequenceString.isEmpty()) {
                    filtered.addAll(promoList);
                } else {
                    for (Promo promo : promoList) {
                        if (promo.getKODE_PROMO().toLowerCase()
                                .contains(charSequenceString.toLowerCase()))
                            filtered.add(promo);
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filtered;
                return filterResults;
            }
            @Override
            protected void publishResults(CharSequence charSequence, FilterResults
                    filterResults) {
                filteredPromoList.clear();
                filteredPromoList.addAll((List<Promo>) filterResults.values);
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvKodePromo, tvJenisPromo, tvKeteranganPromo, tvIdPromo, tvStatusPromo, tvDiskonPromo;
//        ImageButton btnDelete;
        CardView cvPromo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvKodePromo = itemView.findViewById(R.id.tv_kodePromo);
            tvJenisPromo = itemView.findViewById(R.id.tv_jenisPromo);
            tvKeteranganPromo = itemView.findViewById(R.id.tv_keteranganPromo);
            tvIdPromo = itemView.findViewById(R.id.tv_idPromo);
            tvStatusPromo = itemView.findViewById(R.id.tv_statusPromo);
            tvDiskonPromo = itemView.findViewById(R.id.tv_diskonPromo);
            cvPromo = itemView.findViewById(R.id.cv_promo);
        }
    }
}
