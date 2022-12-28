package br.edu.ifsul.tsi.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Filme {

    private Integer idFilme;
    private String tituloFilme;
    private Time duracaoFilme;

    private Genero genero;

    private Atua atua;

    private List<Sessao> sessoes = new ArrayList<>();


    //Construtores


    public Filme(){
        super();
    }

    public Filme(String tituloFilme, Time duracaoFilme, Genero genero, Atua atua){
        super();
        this.tituloFilme = tituloFilme;
        this.duracaoFilme = duracaoFilme;
        this.genero = genero;
        this.atua = atua;
    }

    public Filme(String tituloFilme, Time duracaoFilme, Genero genero, Atua atua, List<Sessao> sessoes){
        super();
        this.tituloFilme = tituloFilme;
        this.duracaoFilme = duracaoFilme;
        this.genero = genero;
        this.atua = atua;
        this.sessoes = sessoes;
    }

    public Filme(String tituloFilme, Genero genero, Atua atua){
        super();
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.atua = atua;
        this.sessoes = sessoes;
    }

    //Getters

    public String getTituloFilme() {
        return tituloFilme;
    }
    public Time getDuracaoFilme() {
        return duracaoFilme;
    }
    public Genero getGenero() {
        return genero;
    }

    public Atua getAtua() {
        return atua; }

    public Integer getIdFilme() {
        return idFilme;
    }


    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }


    public void setDuracaoFilme(Time duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }


    @Override
    public String toString() {
        return "{" +
                "ID=" + idFilme +
                ", Titulo=" + tituloFilme +
                ", duração=" + duracaoFilme +
                ", Genero=" + genero +
                ", Atua=" + atua +
                '}';
    }
}
