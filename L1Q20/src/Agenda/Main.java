package Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\n=== MENU AGENDA TELEFÔNICA ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone));
                    System.out.println("Contato adicionado com sucesso!");
                }
                case 2 -> agenda.listarContatos();
                case 3 -> {
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = sc.nextLine();
                    Contato contato = agenda.buscarContato(nomeBusca);
                    if (contato != null)
                        System.out.println("Contato encontrado: " + contato);
                    else
                        System.out.println("Contato não encontrado.");
                }
                case 4 -> {
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = sc.nextLine();
                    if (agenda.removerContato(nomeRemover))
                        System.out.println("Contato removido com sucesso!");
                    else
                        System.out.println("Contato não encontrado.");
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
