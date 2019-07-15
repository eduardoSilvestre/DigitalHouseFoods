package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.desafioandroid.adapter.RestaurantesAdapter;
import com.example.desafioandroid.interfaces.RestaurantesListener;
import com.example.desafioandroid.models.Prato;
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

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setImagemRestaurante(R.drawable.logomc);
        restaurante1.setNomeRestaurante("McDonald's");
        restaurante1.setEnderecoRestaurante("Alameda Amazonas, 253, Alphaville - 06454-070 Barueri - São Paulo");
        restaurante1.setHorarioRestaurante("24 horas");

        Prato prato1_mcDonalds = new Prato();
        prato1_mcDonalds.setNomePrato("Duplo Quarteirão");
        prato1_mcDonalds.setImagemPrato(R.drawable.duplo_quarteirao_mc);
        prato1_mcDonalds.setDescricaoPrato("Dois hambúrgueres, mostarda, ketchup, cebola e, claro, o delicioso queijo cheddar num pão com gergelim.");
        restaurante1.getListaDePratos().add(prato1_mcDonalds);

        Prato prato2_mcDonalds = new Prato();
        prato2_mcDonalds.setNomePrato("Big Mac");
        prato2_mcDonalds.setImagemPrato(R.drawable.big_mac_mc);
        prato2_mcDonalds.setDescricaoPrato("Não existe nada igual. Dois hambúrgueres, alface, queijo e molho especial, cebola e picles num pão com gergelim.");
        restaurante1.getListaDePratos().add(prato2_mcDonalds);

        Prato prato3_mcDonalds = new Prato();
        prato3_mcDonalds.setNomePrato("McLanche Feliz");
        prato3_mcDonalds.setImagemPrato(R.drawable.mac_lanche_feliz_mc);
        prato3_mcDonalds.setDescricaoPrato("As combinações mais deliciosas para criançada comer e se divertir. Mini Tasty com Tomatinhos, Água Mineral e Danoninho.");
        restaurante1.getListaDePratos().add(prato3_mcDonalds);

        Prato prato4_mcDonalds = new Prato();
        prato4_mcDonalds.setNomePrato("MC Fritas");
        prato4_mcDonalds.setDescricaoPrato("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar. ");
        prato4_mcDonalds.setImagemPrato(R.drawable.mac_fritas_mc);
        restaurante1.getListaDePratos().add(prato4_mcDonalds);
        restaurante1.getListaDePratos().add(prato1_mcDonalds);
        restaurante1.getListaDePratos().add(prato2_mcDonalds);
        restaurante1.getListaDePratos().add(prato3_mcDonalds);
        restaurante1.getListaDePratos().add(prato4_mcDonalds);

        listaRestaurantes.add(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setImagemRestaurante(R.drawable.bk_imagem);
        restaurante2.setNomeRestaurante("Burger King");
        restaurante2.setEnderecoRestaurante("v. Jacu Pêssego, 8210 - Itaquera, São Paulo - SP");
        restaurante2.setHorarioRestaurante("24 horas");

        Prato prato1_burger_king = new Prato();
        prato1_burger_king.setNomePrato("Whopper");
        prato1_burger_king.setImagemPrato(R.drawable.whopper_bk);
        prato1_burger_king.setDescricaoPrato("O WHOPPER® será sempre o nosso número um. Suculenta carne de vaca grelhada de excelente qualidade, tomate e alface fresca, cebola suave e picles saborosos acompanhados com maionese e ketchup. Não esquecer o pão fofo com sementes, que fazem no seu conjunto um hambúrguer de sabor único e que reconhecerias de olhos fechados.");
        restaurante2.getListaDePratos().add(prato1_burger_king);

        Prato prato2_burger_king = new Prato();
        prato2_burger_king.setNomePrato("Chicken Crisp");
        prato2_burger_king.setImagemPrato(R.drawable.chicken_crisp_bk);
        prato2_burger_king.setDescricaoPrato("Pão de brioche, um delicioso e suculento filé de peito de frango crocante, maionese, alface, tomate e duas fatias de queijo cheddar. Todos esses ingredientes são cuidadosamente armazenados e preparados para você se deliciar com um sanduíche fresquinho e de alta qualidade. Imagem meramente ilustrativa.");
        restaurante2.getListaDePratos().add(prato2_burger_king);

        Prato prato3_burger_king = new Prato();
        prato3_burger_king.setNomePrato("MEGA STACKER HASHFRIES 3.0");
        prato3_burger_king.setImagemPrato(R.drawable.mega_stacker_bk);
        prato3_burger_king.setDescricaoPrato("Adora um desafio? Se liga nesse novo sanduíche do BK: Carne, bacon, muito queijo, molho Stacker, barbecue e batatas em formato de Hashtag. Imagem meramente ilustrativa.");
        restaurante2.getListaDePratos().add(prato3_burger_king);

        Prato prato4_burger_king = new Prato();
        prato4_burger_king.setNomePrato("BIG KING™");
        prato4_burger_king.setDescricaoPrato("Dois deliciosos hambúrgueres grelhados no fogo como churrasco, queijo derretido e molho Big KingTM. Consulte os restaurantes Burger King® participantes no site. Imagens meramente ilustrativas");
        prato4_burger_king.setImagemPrato(R.drawable.bing_king_bk);
        restaurante2.getListaDePratos().add(prato4_burger_king);
        restaurante2.getListaDePratos().add(prato1_burger_king);
        restaurante2.getListaDePratos().add(prato2_burger_king);
        restaurante2.getListaDePratos().add(prato3_burger_king);
        restaurante2.getListaDePratos().add(prato4_burger_king);

        listaRestaurantes.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setImagemRestaurante(R.drawable.bobs_logo);
        restaurante3.setNomeRestaurante("Bob's");
        restaurante3.setEnderecoRestaurante("Av. José Pinheiro Borges, s/n - 1666 - Itaquera, São Paulo - SP");
        restaurante3.setHorarioRestaurante("24 horass");


        Prato prato1_bobs = new Prato();
        prato1_bobs.setNomePrato("Parmesão artesanal");
        prato1_bobs.setImagemPrato(R.drawable.parmesao_atersanal_bobs);
        prato1_bobs.setDescricaoPrato("O Parmesão Artesanal voltou, agora com a carne maior e mais suculenta, parmesão crocante, maionese de ervas, bacon, tomate e alface, no pão tipo italiano, assado na hora.");
        restaurante3.getListaDePratos().add(prato1_bobs);

        Prato prato2_bobs = new Prato();
        prato2_bobs.setNomePrato("Australiano artesanal");
        prato2_bobs.setImagemPrato(R.drawable.australiano_artesanal_bobs);
        prato2_bobs.setDescricaoPrato("Pão australiano assado na hora, hambúrguer maior e mais suculento, molho barbecue, bacon, queijo, cebola crispy, tomate e alface americana.");
        restaurante3.getListaDePratos().add(prato2_bobs);

        Prato prato3_bobs = new Prato();
        prato3_bobs.setNomePrato("Big Bob");
        prato3_bobs.setImagemPrato(R.drawable.big_bob_bobs);
        prato3_bobs.setDescricaoPrato("O grande clássico do Bob's. Este sanduíche irresistível vem com queijo, hambúrguer, alface temperada com cebola picadinha em um pão duplo com gergelim, além do molho Big Bob que só o Bob's tem.");
        restaurante3.getListaDePratos().add(prato3_bobs);


        listaRestaurantes.add(restaurante3);
        listaRestaurantes.add(restaurante1);
        listaRestaurantes.add(restaurante2);
        listaRestaurantes.add(restaurante3);

        RestaurantesAdapter restaurantesAdapter = new RestaurantesAdapter(listaRestaurantes, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.restaurante_recycler_view);
        recyclerView.setAdapter(restaurantesAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onRestauranteClicado(Restaurante restaurante) {
        Intent intent = new Intent(this, PratosActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("RESTAURANTE", restaurante);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
