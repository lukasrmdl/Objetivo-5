package br.edu.ifsul.tsi.controller;

import java.util.List;
import java.util.Scanner;

import br.edu.ifsul.tsi.dao.GeneroDAO;
import br.edu.ifsul.tsi.model.Genero;

        public class GeneroController {
            private static final Scanner input = new Scanner(System.in);

            public static void main(String[] args) {

                int opcao = 0;
                do {
                    System.out.print("\n\"-------  Gerencial -> Gêneros -------\"");
                    System.out.print(
                            "\n1. Inserir novo Gênero " +
                                    "\n2. Atualizar um Gênero" +
                                    "\n3. Listar todos os Generos" +
                                    "\n4. Buscar Gênero pelo código" +
                                    "\n5. Buscar Gênero pela descrição" +
                                    "\n6. Excluir Gênero" +
                                    "\nOpção (Zero p/sair): ");
                    opcao = input.nextInt();
                    input.nextLine();
                    switch(opcao) {
                        case 1:
                            inserir();
                            break;
                        case 2:
                            atualizar();
                            break;
                        case 3:
                            selectGeneros();
                            break;
                        case 4:
                            selectGeneroById();
                            break;
                        case 5:
                            selectGenerosByDesc();
                            break;
                        case 6:
                            ExcludeGenero();
                            break;
                        default:
                            if(opcao != 0) System.out.println("Opção inválida.");
                    }
                } while(opcao != 0) ;
            }

            //opção 1
            private static void inserir() {
                Genero genero = new Genero();
                System.out.println("\n++++++ Cadastro de novo Gênero ++++++");
                System.out.print("Digite a descrição do Gênero: ");
                genero.setDescricaoGenero(input.nextLine());

                if(GeneroDAO.insertGenero(genero)) {
                    System.out.println("\nGênero salvo com sucesso.");
                }else {
                    System.out.println("\nHouve um erro ao salvar o Gênero. Por favor, contate o administrador do sistema.");
                }
            }

            //opção 2
            private static void atualizar() {
                System.out.println("\n++++++ Alterar um Gênero ++++++");
                Genero genero = null;
                int opcao = 0;
                do{
                    System.out.print("\nDigite o código do Gênero (Zero p/sair): ");
                    int codigo = input.nextInt();
                    input.nextLine();
                    if(codigo == 0) {
                        opcao = 0;
                    } else {
                        genero = GeneroDAO.selectGeneroById(codigo);
                        if(genero == null){
                            System.out.println("Código inválido.");
                        }else{
                            System.out.println("Descrição: " + genero.getDescricaoGenero());
                            System.out.print("Alterar? (0-sim/1-não) ");
                            if(input.nextInt() == 0){
                                input.nextLine();
                                System.out.println("Digite a nova descrição do Gênero: ");
                                genero.setDescricaoGenero(input.nextLine());
                            }

                            if(GeneroDAO.updateGenero(genero)){
                                System.out.println("Gênero salvo:" + genero);
                            }else{
                                System.out.println("Erro ao tentar salvar o Gênero. Por favor, contate o adminstrador.");
                            }
                            opcao = 1;
                        }

                    }
                }while(opcao != 0);
            }

            //opção 3
            private static void selectGeneros() {
                System.out.println("\nLista de Gêneros cadastrados no banco de dados:\n" + GeneroDAO.selectGeneros());
            }

            //opção 4
            private static void selectGeneroById() {
                System.out.print("\nDigite o código do Gênero: ");
                Genero genero = GeneroDAO.selectGeneroById(input.nextInt());
                input.nextLine();
                if(genero != null){
                    System.out.println(genero);
                }else{
                    System.out.println("Código não localizado.");
                }
            }

            //opção 5
            private static void selectGenerosByDesc() {
                System.out.print("Digite a descrição do Gênero: ");
                String desc = input.next();
                System.out.println("Chave de pesquisa: " + desc);
                List<Genero> generos = GeneroDAO.selectGenerosByDesc(desc);
                if(generos.isEmpty()){
                    System.out.println("Não há registros correspondentes para: " + desc);
                }else{
                    System.out.println(generos);
                }
            }

            private static void ExcludeGenero() {
                System.out.println("\n++++++ Excluir um Gênero ++++++");
                Genero genero = null;
                int opcao = 0;
                do{
                    System.out.print("\nDigite o código do Gênero (Zero p/sair): ");
                    int codigo = input.nextInt();
                    input.nextLine();
                    if(codigo == 0) {
                        opcao = 0;
                    } else {
                        genero = GeneroDAO.selectGeneroById(codigo);
                        if(genero == null){
                            System.out.println("Código inválido.");
                        }else{
                            System.out.println("Descrição: " + genero.getDescricaoGenero());
                            System.out.print("Excluir? (0-sim/1-não) ");
                            if(input.nextInt() == 0){
                                input.nextLine();
                            }
                            if(GeneroDAO.deleteGenero(codigo)){
                                System.out.println("Gênero Excluido:" + genero);
                            }else{
                                System.out.println("Erro ao tentar Deletar o Gênero. Por favor, contate o adminstrador.");
                            }
                            opcao = 1;
                        }

                    }
                }while(opcao != 0);
            }

        }//fim classe
