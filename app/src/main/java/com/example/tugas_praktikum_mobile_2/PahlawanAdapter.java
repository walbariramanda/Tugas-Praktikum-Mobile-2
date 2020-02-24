package com.example.tugas_praktikum_mobile_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PahlawanAdapter extends PahlawanModel.Adapter<PahlawanAdapter.ViewHolder> {

    @NonNull


    private Context context;
    private ArrayList<PahlawanModel> pahlawanModels;

    public PahlawanAdapter(@NonNull Context context) {
        this.context = context;
    }

    public ArrayList<PahlawanModel> getPahlawanModels() {
        return pahlawanModels;
    }

    public void setPahlawanModels(ArrayList<PahlawanModel> pahlawanModels) {
        this.pahlawanModels = pahlawanModels;
    }


    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_pahlawan_baru,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    //    @Override
    public void onBindViewHolder(@NonNull  PahlawanModel.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getPahlawanModels().get(i).getFotoPahlawan()).into(viewHolder.ivHeroPicture);
        viewHolder.tvHeroName.setText(getPahlawanModels().get(i).getNamaPahlawan());
        viewHolder.tvHeroDetail.setText(getPahlawanModels().get(i).getBiografiPahlawan());

    }

    //    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivHeroPicture;
        private TextView tvHeroName;
        private TextView tvHeroDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHeroPicture          =   itemView.findViewById(R.id.ivHeroPicture);
            tvHeroName          =   itemView.findViewById(R.id.tvHeroName);
            tvHeroDetail        =   itemView.findViewById(R.id.tvHeroDetail);
        }
    }

}