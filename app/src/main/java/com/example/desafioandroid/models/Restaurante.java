package com.example.desafioandroid.models;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private String nomeRestaurante;
    private int imagemRestaurante;
    private String enderecoRestaurante;
    private String horarioRestaurante;

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
}
