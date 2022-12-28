package br.edu.ifsul.tsi.model;

public class Ingresso {

    private Sessao sessao;
    private String codigoAssentoIngresso;
    private Integer tipoIngresso;


    //Construtores

    public Ingresso(){
        super();
    }


    public Ingresso(String codigoAssentoIngresso, Integer tipoIngresso){
        super();
        this.codigoAssentoIngresso = codigoAssentoIngresso;
        this.tipoIngresso = tipoIngresso;

    }

    public Ingresso(String codigoAssentoIngresso, Integer tipoIngresso, Sessao sessao){
        super();
        this.codigoAssentoIngresso = codigoAssentoIngresso;
        this.tipoIngresso = tipoIngresso;
        this.sessao = sessao;
    }

    //Getters

    public String getCodigoAssentoIngresso() {
        return codigoAssentoIngresso;
    }

    public Integer getTipoIngresso() {
        return tipoIngresso;
    }

    //Setters

    public void setCodigoAssentoIngresso(String codigoAssentoIngresso) {
        this.codigoAssentoIngresso = codigoAssentoIngresso;
    }

    public void setTipoIngresso(Integer tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }




    @Override
    public String toString() {
        return "Ingresso{" +
                "Sessão=" + sessao +
                "Codigo do assento=" + codigoAssentoIngresso +
                ", tipo do ingresso=" + tipoIngresso +
                '}';
    }
}
