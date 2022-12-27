package controller;

import model.*;

import java.time.LocalTime;
import java.util.GregorianCalendar;

public class CinemaController {
    public static void main(String[] args){
        //Instanciando Classe de Ator
        Ator ator1 = new Ator("James Cameron");

        //Instanciando Classe de Genero
        Genero genero1 = new Genero("ficção cientifica");

        //Instanciando Classe de Atua
        Atua atua1 = new Atua("Navih", ator1);

        //Instanciando Classe de Filme
        Filme filme1 = new Filme("Avatar", LocalTime.parse("02:45:00"),genero1, atua1);

        //Intanciando classe de assento
        Assento assento1 = new Assento("1A");

        //Intanciando classe de sala
        Sala sala1 = new Sala(30, 1);

        //Intanciando classe de Sessão
        Sessao sessao1 = new Sessao(filme1, sala1,new GregorianCalendar(2022, 12, 24, 10, 01), LocalTime.parse("14:00"), 12.20,5.10,Boolean.FALSE);

        //Instanciando Ingresso
        Ingresso ingresso1 = new Ingresso("A1", 2, sessao1);

        System.out.println(ingresso1);



    }
}