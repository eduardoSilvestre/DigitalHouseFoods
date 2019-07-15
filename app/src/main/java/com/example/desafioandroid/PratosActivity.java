package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.desafioandroid.adapter.PratosAdapter;
import com.example.desafioandroid.adapter.RestaurantesAdapter;
import com.example.desafioandroid.interfaces.PratosListener;
import com.example.desafioandroid.models.Prato;
import com.example.desafioandroid.models.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class PratosActivity extends AppCompatActivity implements PratosListener {

    private ImageView imagemRestaurante;
    private TextView nomeRestaurante;
    private List<Prato> listaPratos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratos);

        imagemRestaurante = findViewById(R.id.restaurante_pratos_image_view);
        nomeRestaurante = findViewById(R.id.descricao_prato_text_view);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Restaurante restaurante = (Restaurante) bundle.getSerializable("RESTAURANTE");

        nomeRestaurante.setText(restaurante.getNomeRestaurante());
        imagemRestaurante.setImageResource(restaurante.getImagemRestaurante());

        listaPratos = restaurante.getListaDePratos();

        PratosAdapter pratosAdapter = new PratosAdapter(listaPratos, this);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        RecyclerView recyclerView = findViewById(R.id.pratos_recycler_view);
        recyclerView.setAdapter(pratosAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onPratoClicado(Prato prato) {
        Intent intent = new Intent(this, DetalhePrato.class);

        startActivity(intent);
    }
}
