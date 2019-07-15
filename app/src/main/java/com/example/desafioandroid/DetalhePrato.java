package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.desafioandroid.adapter.PratosAdapter;
import com.example.desafioandroid.models.Prato;
import com.example.desafioandroid.models.Restaurante;

public class DetalhePrato extends AppCompatActivity {

    private ImageView imagemPratoDetalhe;
    private TextView nomePratoDetalhe;
    private TextView descricaoPratoDetelhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_prato);

        imagemPratoDetalhe = findViewById(R.id.prato_detalhe_image_view);
        nomePratoDetalhe = findViewById(R.id.prato_detalhe_nome_text_view);
        descricaoPratoDetelhe = findViewById(R.id.prato_detalhe_descricao_text_view);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Prato prato = (Prato) bundle.getSerializable("PRATO");

        imagemPratoDetalhe.setImageResource(prato.getImagemPrato());
        nomePratoDetalhe.setText(prato.getNomePrato());
        descricaoPratoDetelhe.setText(prato.getDescricaoPrato());
    }
}
