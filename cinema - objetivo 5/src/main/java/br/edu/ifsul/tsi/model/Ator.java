package br.edu.ifsul.tsi.model;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    private String nomeAtor;

    private List<Atua> atuou = new ArrayList<>();


    //Construtores


    public Ator(){
        super();
    }

    public Ator(String nomeAtor){
        super();
        this.nomeAtor = nomeAtor;
    }

    public Ator(String nomeAtor, List<Atua> atuou){
        super();
        this.nomeAtor = nomeAtor;
        this.atuou = atuou;
    }

    //Getters

    public String getNomeAtor() {
        return nomeAtor;
    }

    //Setters

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    @Override
    public String toString() {
        return "ator{" +
                "ator=" + nomeAtor +
                '}';
    }
}
