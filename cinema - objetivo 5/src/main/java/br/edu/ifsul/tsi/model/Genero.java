package br.edu.ifsul.tsi.model;

import java.util.ArrayList;
import java.util.List;

public class Genero {

    private Integer idGenero;

    private String descricaoGenero;


    //Construtores


    public Genero(){
        super();
    }

    public Genero(String descricaoGenero){
        super();
        this.descricaoGenero = descricaoGenero;
    }

    public Genero(Integer idGenero, String descricaoGenero){
        super();
        this.idGenero = idGenero;
        this.descricaoGenero = descricaoGenero;
    }

    //Getters

    public String getDescricaoGenero() {
        return descricaoGenero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }


    //Setters

    public void setDescricaoGenero(String descricaoGenero) {
        this.descricaoGenero = descricaoGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }


    @Override
    public String toString() {
        return "{" +
                "ID=" + idGenero +
                ", Descrição=" + descricaoGenero +
                '}';
    }
}
