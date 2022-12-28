package br.edu.ifsul.tsi.controller;

import java.util.Scanner;

public class GerencialController {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        do {
            System.out.print("\n-------  Gerencial CineArt -------");
            System.out.print(
                    """
   
                        1. Vender Ingressos
                        2. Manter Sessões
                        3. Manter Salas
                        4. Manter Filmes
                        5. Manter Generos
                        6. Manter Atores
                        
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao) {
                case 1:
                    System.out.println("Em implementação.");
                    break;
                case 2:
                    System.out.println("Em implementação.");
                    break;
                case 3:
                    System.out.println("Em implementação.");
                    break;
                case 4:
                    System.out.println("Em implementação.");
                    break;
                case 5:
                    GeneroController.main(null);
                    break;
                case 6:
                    System.out.println("Em implementação.");
                    break;
                default:
                    if(opcao != 0) System.out.println("Opção inválida.");
            }
        } while(opcao != 0) ;
        System.out.println("\n\n!!!!!!!! Fim da aplicação !!!!!!!!");
        input.close();
    }

}