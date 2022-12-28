package br.edu.ifsul.tsi.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String tituloFilme;
    private LocalTime duracaoFilme;

    private Genero genero;

    private Atua atua;



    private List<Sessao> sessoes = new ArrayList<>();


    //Construtores


    public Filme(){
        super();
    }

    public Filme(String tituloFilme, LocalTime duracaoFilme, Genero genero, Atua atua){
        super();
        this.tituloFilme = tituloFilme;
        this.duracaoFilme = duracaoFilme;
        this.genero = genero;
        this.atua = atua;
    }

    public Filme(String tituloFilme, LocalTime duracaoFilme, Genero genero, Atua atua, List<Sessao> sessoes){
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

    public LocalTime getDuracaoFilme() {
        return duracaoFilme;
    }


    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public void setDuracaoFilme(LocalTime duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    @Override
    public String toString() {
        return "{" +
                "Titulo=" + tituloFilme +
                ", duração=" + duracaoFilme +
                ", Genero=" + genero +
                ", Atua=" + atua +
                '}';
    }
}
