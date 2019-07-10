package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.desafioandroid.adapter.RestaurantesAdapter;
import com.example.desafioandroid.interfaces.RestaurantesListener;
import com.example.desafioandroid.models.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestaurantesActivity extends AppCompatActivity implements RestaurantesListener {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        List<Restaurante> listaRestaurantes = new ArrayList<>();

        Restaurante restaurante = new Restaurante();
        restaurante.setNomeRestaurante("Mc Donald's");
        restaurante.setEnderecoRestaurante("Rua shinzaburo mizutani");
        restaurante.setHorarioRestaurante("08:00 as 18:00");
        restaurante.setImagemRestaurante(R.drawable.tonyromas);
        listaRestaurantes.add(restaurante);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNomeRestaurante("Mc Donald's");
        restaurante1.setEnderecoRestaurante("Rua shinzaburo mizutani");
        restaurante1.setHorarioRestaurante("08:00 as 18:00");
        restaurante1.setImagemRestaurante(R.drawable.tonyromas);
        listaRestaurantes.add(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNomeRestaurante("Mc Donald's");
        restaurante2.setEnderecoRestaurante("Rua shinzaburo mizutani");
        restaurante2.setHorarioRestaurante("08:00 as 18:00");
        restaurante2.setImagemRestaurante(R.drawable.tonyromas);
        listaRestaurantes.add(restaurante2);

        RestaurantesAdapter restaurantesAdapter = new RestaurantesAdapter(listaRestaurantes, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.restaurante_recycler_view);
        recyclerView.setAdapter(restaurantesAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onRestauranteClicado(Restaurante restaurante) {
        Intent intent = new Intent(this, PratosActivity.class);

        startActivity(intent);
    }
}
