package com.example.desafioandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafioandroid.R;
import com.example.desafioandroid.models.Prato;

import java.util.List;

public class PratosAdapter extends RecyclerView.Adapter<PratosAdapter.ViewHolder> {

    List<Prato> listaPratos;

    public PratosAdapter(List<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_pratos, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Prato prato = listaPratos.get(position);
        holder.imagemPratoImageView.setImageResource(listaPratos.get(position).getImagemPrato());
        holder.setupPrato(prato);

    }

    @Override
    public int getItemCount() {
        return listaPratos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagemPratoImageView;
        private TextView descricaoPratoImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemPratoImageView = itemView.findViewById(R.id.imagem_prato_image_view);
            descricaoPratoImageView = itemView.findViewById(R.id.descricao_prato_text_view);
        }
        public void setupPrato(Prato prato){
            descricaoPratoImageView.setText(prato.getDescricaoPrato());
        }
    }

}
