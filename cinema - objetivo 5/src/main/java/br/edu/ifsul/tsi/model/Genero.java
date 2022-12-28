package br.edu.ifsul.tsi.model;

import java.util.ArrayList;
import java.util.List;

public class Genero {
    private String descricaoGenero;

    private List<Filme> filmes = new ArrayList<>();


    //Construtores


    public Genero(){
        super();
    }

    public Genero(String descricaoGenero){
        super();
        this.descricaoGenero = descricaoGenero;
    }

    public Genero(String descricaoGenero, List<Filme> filmes){
        super();
        this.descricaoGenero = descricaoGenero;
        this.filmes = filmes;
    }

    //Getters

    public String getDescricaoGenero() {
        return descricaoGenero;
    }

    //Setters

    public void setDescricaoGenero(String descricaoGenero) {
        this.descricaoGenero = descricaoGenero;
    }

    @Override
    public String toString() {
        return "{" +
                "Descrição=" + descricaoGenero +
                '}';
    }
}
