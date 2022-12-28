package model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private Integer numeroSala;

    private Integer capacidadeSala;

    private Assento assento;

    private List<Sessao> sessoes = new ArrayList<>();



    //Construtores


    public Sala(){
        super();
    }

    public Sala(Integer capacidadeSala, Integer numeroSala){
        super();
        this.capacidadeSala = capacidadeSala;
        this.numeroSala = numeroSala;
    }

    public Sala(Integer capacidadeSala, Integer numeroSala, List<Sessao> sessoes){
        super();
        this.capacidadeSala = capacidadeSala;
        this.numeroSala = numeroSala;
        this.sessoes = sessoes;
    }

    //Getters

    public Integer getNumeroSala() {
        return numeroSala;
    } // consultar sala

    public Integer getCapacidadeSala() {
        return capacidadeSala;
    } // consultar sala

    //setters

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setCapacidadeSala(Integer capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    @Override
    public String toString() {
        return "{" +
                "Numero da sala=" + numeroSala +
                ", Capacidade=" + capacidadeSala +
                '}';
    }
}
