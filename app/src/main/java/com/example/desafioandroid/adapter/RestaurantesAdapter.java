package com.example.desafioandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafioandroid.R;
import com.example.desafioandroid.interfaces.RestaurantesListener;
import com.example.desafioandroid.models.Restaurante;

import java.util.List;

public class RestaurantesAdapter extends RecyclerView.Adapter<RestaurantesAdapter.ViewHolderRestaurantes>{

    private List<Restaurante> listaRestaurantes;
    private RestaurantesListener restaurantesListener;

    public RestaurantesAdapter(List<Restaurante> listaRestaurantes, RestaurantesListener restaurantesListener) {
        this.listaRestaurantes = listaRestaurantes;
        this.restaurantesListener = restaurantesListener;
    }

    @NonNull
    @Override
    public ViewHolderRestaurantes onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_restaurante, viewGroup, false);

        return new ViewHolderRestaurantes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRestaurantes holder, final int position) {
        holder.nomeRestauranteTextVIew.setText(listaRestaurantes.get(position).getNomeRestaurante());
        holder.horarioRestauranteTextView.setText(listaRestaurantes.get(position).getHorarioRestaurante());
        holder.enderecoRestauranteTextView.setText(listaRestaurantes.get(position).getEnderecoRestaurante());
        holder.restauranteImageView.setImageResource(listaRestaurantes.get(position).getImagemRestaurante());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    restaurantesListener.onRestauranteClicado(listaRestaurantes.get(position));
                }
            });

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }


    class ViewHolderRestaurantes extends RecyclerView.ViewHolder{

        private ImageView restauranteImageView;
        private TextView nomeRestauranteTextVIew;
        private TextView enderecoRestauranteTextView;
        private TextView horarioRestauranteTextView;

        public ViewHolderRestaurantes(@NonNull View itemView) {
            super(itemView);

            restauranteImageView = itemView.findViewById(R.id.foto_restaurante_image_view);
            nomeRestauranteTextVIew= itemView.findViewById(R.id.nome_restaurante_text_view);
            enderecoRestauranteTextView= itemView.findViewById(R.id.endereco_restaurante_text_view);
            horarioRestauranteTextView= itemView.findViewById(R.id.horario_restaurante_text_view);
        }
    }
}
