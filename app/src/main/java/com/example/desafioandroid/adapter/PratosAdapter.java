package com.example.desafioandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafioandroid.R;
import com.example.desafioandroid.interfaces.PratosListener;
import com.example.desafioandroid.models.Prato;

import java.util.List;

public class PratosAdapter extends RecyclerView.Adapter<PratosAdapter.ViewHolder> implements PratosListener {

    private List<Prato> listaPratos;
    private PratosListener pratosListener;

    public PratosAdapter(List<Prato> listaPratos, PratosListener pratosListener) {
        this.listaPratos = listaPratos;
        this.pratosListener = pratosListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_pratos, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Prato prato = listaPratos.get(position);
        holder.imagemPratoImageView.setImageResource(listaPratos.get(position).getImagemPrato());
        holder.descricaoPratoTextView.setText(listaPratos.get(position).getDescricaoPrato());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pratosListener.onPratoClicado(listaPratos.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaPratos.size();
    }

    @Override
    public void onPratoClicado(Prato prato) {

    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagemPratoImageView;
        private TextView descricaoPratoTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemPratoImageView = itemView.findViewById(R.id.imagem_prato_image_view);
            descricaoPratoTextView = itemView.findViewById(R.id.descricao_prato_text_view);
        }

    }

}
