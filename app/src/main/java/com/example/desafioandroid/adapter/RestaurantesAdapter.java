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
import com.squareup.picasso.Picasso;

import java.util.List;

public class RestaurantesAdapter extends RecyclerView.Adapter<RestaurantesAdapter.ViewHolder> implements RestaurantesListener{

    private List<Restaurante> listaRestaurantes;
    private RestaurantesListener restaurantesListener;

    public RestaurantesAdapter(List<Restaurante> listaRestaurantes, RestaurantesListener restaurantesListener) {
        this.listaRestaurantes = listaRestaurantes;
        this.restaurantesListener = restaurantesListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_restaurante, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Restaurante restaurante = listaRestaurantes.get(position);
        holder.restauranteImageView.setImageResource(listaRestaurantes.get(position).getImagemRestaurante());
            holder.setupRestaurante(restaurante);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    restaurantesListener.onRestauranteClicado(restaurante);
                }
            });

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    @Override
    public void onRestauranteClicado(Restaurante restaurante) {

    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView restauranteImageView;
        private TextView nomeRestauranteTextVIew;
        private TextView enderecoRestauranteTextView;
        private TextView horarioRestauranteTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            restauranteImageView = itemView.findViewById(R.id.foto_restaurante_image_view);
            nomeRestauranteTextVIew= itemView.findViewById(R.id.nome_restaurante_text_view);
            enderecoRestauranteTextView= itemView.findViewById(R.id.endereco_restaurante_text_view);
            horarioRestauranteTextView= itemView.findViewById(R.id.horario_restaurante_text_view);
        }
        public void setupRestaurante(Restaurante restaurante){


            nomeRestauranteTextVIew.setText(restaurante.getNomeRestaurante());
            horarioRestauranteTextView.setText(restaurante.getHorarioRestaurante());
            enderecoRestauranteTextView.setText(restaurante.getEnderecoRestaurante());

        }
    }
}
