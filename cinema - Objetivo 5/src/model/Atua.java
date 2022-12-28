package model;

import java.util.ArrayList;
import java.util.List;

public class Atua {
    private String papelAtorFilme;

    private Ator ator;

    private List<Filme> filmes = new ArrayList<>();


    //Construtores


    public Atua(){
        super();
    }

    public Atua(String papelAtorFilme, Ator ator){
        super();
        this.papelAtorFilme = papelAtorFilme;
        this.ator = ator;
    }

    public Atua(String papelAtorFilme, Ator ator, List<Filme> filmes){
        super();
        this.papelAtorFilme = papelAtorFilme;
        this.ator = ator;
        this.filmes = filmes;
    }

    //Getters

    public String getPapelAtorFilme() {
        return papelAtorFilme;
    }

    //Setters

    public void setPapelAtorFilme(String papelAtorFilme) {
        this.papelAtorFilme = papelAtorFilme;
    }

    @Override
    public String toString() {
        return "{" +
                ", Papel=" + papelAtorFilme +
                ", ator=" + ator +
                '}';
    }
}
