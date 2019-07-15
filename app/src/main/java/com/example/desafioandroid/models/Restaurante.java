package com.example.desafioandroid.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Serializable {

    private String nomeRestaurante;
    private int imagemRestaurante;
    private String enderecoRestaurante;
    private String horarioRestaurante;
    private List<Prato> listaDePratos = new ArrayList<>();

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getImagemRestaurante() {
        return imagemRestaurante;
    }

    public void setImagemRestaurante(int imagemRestaurante) {
        this.imagemRestaurante = imagemRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public String getHorarioRestaurante() {
        return horarioRestaurante;
    }

    public void setHorarioRestaurante(String horarioRestaurante) {
        this.horarioRestaurante = horarioRestaurante;
    }

    public List<Prato> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }
}
