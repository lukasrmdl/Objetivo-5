package br.edu.ifsul.tsi.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Sessao {

    private Filme filme;

    private Sala sala;

    private GregorianCalendar dataSessao;
    private LocalTime horaSessao;
    private Double valorInteira;
    private Double valorMeia;
    private Boolean sessaoEncerrada;

    private List<Ingresso> ingressos = new ArrayList<>();


    //Construtores

    public Sessao(){
        super();
    }


    public Sessao(Filme filme, Sala sala, GregorianCalendar dataSessao, LocalTime horaSessao, Double valorInteira, Double valorMeia, Boolean sessaoEncerrada){
        super();
        this.filme = filme;
        this.sala = sala;
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;
        this.sessaoEncerrada = sessaoEncerrada;
    } // selecionar sessão

    public Sessao(Filme filme, Sala sala, GregorianCalendar dataSessao, Double valorInteira, Double valorMeia, Boolean sessaoEncerrada){
        super();
        this.filme = filme;
        this.sala = sala;
        this.dataSessao = dataSessao;
        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;
        this.sessaoEncerrada = sessaoEncerrada;
    } // selecionar sessão

    public Sessao(Filme filme, Sala sala, GregorianCalendar dataSessao, LocalTime horaSessao, Double valorInteira, Double valorMeia, Boolean sessaoEncerrada, List<Ingresso> ingressos){
        super();
        this.filme = filme;
        this.sala = sala;
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;
        this.sessaoEncerrada = sessaoEncerrada;
        this.ingressos = ingressos;
    }

    //Getters

    public Filme getFilme() { return filme;}

    public GregorianCalendar getDataSessao() {
        return dataSessao;
    }

    public LocalTime getHoraSessao() {
        return horaSessao;
    }

    public Double getValorInteira() {
        return valorInteira;
    }

    public Double getValorMeia() {
        return valorMeia;
    }

    public Boolean getSessaoEncerrada() {
        return sessaoEncerrada;
    }

    //Setters

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setDataSessao(GregorianCalendar dataSessao) {
        this.dataSessao = dataSessao;
    }

    public void setHoraSessao(LocalTime horaSessao) {
        this.horaSessao = horaSessao;
    }

    public void setValorInteira(Double valorInteira) {
        this.valorInteira = valorInteira;
    }

    public void setValorMeia(Double valorMeia) {
        this.valorMeia = valorMeia;
    }

    public void setSessaoEncerrada(Boolean sessaoEncerrada) {
        this.sessaoEncerrada = sessaoEncerrada;
    }


    @Override
    public String toString() {
        return "{" +
                "Filme=" + filme +
                "Sala=" + sala +
                "Data=" + dataSessao.get(Calendar.DAY_OF_MONTH) + "-" + dataSessao.get(Calendar.MONTH) + "-" + dataSessao.get(Calendar.YEAR) +
                ", Hora=" + horaSessao +
                ", Valor Inteira=" + valorInteira +
                ", Valor Meia=" + valorMeia +
                ", Sessão encerrada=" + sessaoEncerrada +
                '}';
    }
}
