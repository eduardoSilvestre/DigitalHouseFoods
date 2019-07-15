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

        List<Prato> listaPratos = new ArrayList<>();

        Prato prato = new Prato();
        prato.setDescricaoPrato("Mc lanche");
        prato.setImagemPrato(R.drawable.logomc);
        listaPratos.add(prato);

        Prato prato1 = new Prato();
        prato1.setDescricaoPrato("Mc lanche");
        prato1.setImagemPrato(R.drawable.logomc);
        listaPratos.add(prato1);

        Prato prato2 = new Prato();
        prato2.setDescricaoPrato("Mc lanche");
        prato2.setImagemPrato(R.drawable.logomc);
        listaPratos.add(prato2);

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
