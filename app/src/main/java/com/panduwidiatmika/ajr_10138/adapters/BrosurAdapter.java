package com.panduwidiatmika.ajr_10138.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.panduwidiatmika.ajr_10138.R;
import com.panduwidiatmika.ajr_10138.model.Brosur;

import java.util.ArrayList;
import java.util.List;

public class BrosurAdapter extends RecyclerView.Adapter<BrosurAdapter.ViewHolder> implements Filterable {
    private List<Brosur> brosurList, filteredBrosurList;

    private Context context;

    public BrosurAdapter(List<Brosur> brosurList, Context context){
        this.brosurList=brosurList;
        filteredBrosurList=new ArrayList<>(brosurList);
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_brosur, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Brosur brosur = filteredBrosurList.get(position);
        holder.tvNamaMobil.setText(brosur.getNAMA_MOBIL());
        holder.tvJenisTransmisi.setText(brosur.getJENIS_TRANSMISI_MOBIL());
        holder.tvFasilitas.setText(brosur.getFASILITAS_MOBIL());
        holder.tvHarga.setText(String.valueOf(brosur.getHARGA_SEWA()));
    }
    @Override
    public int getItemCount() {
        return filteredBrosurList.size();
    }
    public void setBrosurList(List<Brosur> brosurList) {
        this.brosurList = brosurList;
        filteredBrosurList = new ArrayList<>(brosurList);
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charSequenceString = charSequence.toString();
                List<Brosur> filtered = new ArrayList<>();
                if (charSequenceString.isEmpty()) {
                    filtered.addAll(brosurList);
                } else {
                    for (Brosur brosur : brosurList) {
                        if (brosur.getNAMA_MOBIL().toLowerCase()
                                .contains(charSequenceString.toLowerCase()))
                            filtered.add(brosur);
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filtered;
                return filterResults;
            }
            @Override
            protected void publishResults(CharSequence charSequence, FilterResults
                    filterResults) {
                filteredBrosurList.clear();
                filteredBrosurList.addAll((List<Brosur>) filterResults.values);
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaMobil, tvJenisTransmisi, tvFasilitas, tvHarga;
        //        ImageButton btnDelete;
        CardView cvBrosur;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaMobil = itemView.findViewById(R.id.tv_namaMobil);
            tvJenisTransmisi = itemView.findViewById(R.id.tv_jenisTransmisi);
            tvFasilitas = itemView.findViewById(R.id.tv_fasilitas);
            tvHarga = itemView.findViewById(R.id.tv_harga);
            cvBrosur = itemView.findViewById(R.id.cv_brosur);
        }
    }
}
