package model;

import java.util.ArrayList;
import java.util.List;

public class Assento {
    private String codigoAssento;

    private List<Sala> salas = new ArrayList<>();


    //Construtores


    public Assento(){
        super();
    }

    public Assento(String codigoAssento){
        super();
        this.codigoAssento = codigoAssento;
    }

    public Assento(String codigoAssento, List<Sala> salas){
        super();
        this.codigoAssento = codigoAssento;
        this.salas = salas;
    }

    //Getters

    public String getCodigoAssento() {
        return getCodigoAssento();
    }

    //Setters

    public void setCodigoAssento(String codigoAssento) {
        this.codigoAssento = codigoAssento;
    }

    @Override
    public String toString() {
        return "Assento{" +
                "Codigo=" + codigoAssento +
                '}';
    }
}
