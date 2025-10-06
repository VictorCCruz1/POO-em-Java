package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        // Exemplos de livros e pessoas
        livros.add(new Livro("Dom Casmurro", "Machado de Assis"));
        livros.add(new Livro("O Cortiço", "Aluísio Azevedo"));
        livros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis"));

        pessoas.add(new Pessoa("Ana"));
        pessoas.add(new Pessoa("João"));
        pessoas.add(new Pessoa("Maria"));

        int opcao;

        do {
            System.out.println("\n=== MENU DE EMPRÉSTIMOS ===");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Fazer empréstimo");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Listar empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n=== LIVROS CADASTRADOS ===");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println((i + 1) + " - " + livros.get(i));
                    }
                }

                case 2 -> {
                    System.out.println("\nEscolha o número do livro:");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println((i + 1) + " - " + livros.get(i));
                    }
                    int livroEscolhido = sc.nextInt() - 1;
                    sc.nextLine();

                    System.out.println("Digite o nome da pessoa:");
                    String nomePessoa = sc.nextLine();

                    Pessoa p = pessoas.stream()
                            .filter(pe -> pe.getNome().equalsIgnoreCase(nomePessoa))
                            .findFirst()
                            .orElseGet(() -> {
                                Pessoa nova = new Pessoa(nomePessoa);
                                pessoas.add(nova);
                                return nova;
                            });

                    Emprestimo emp = new Emprestimo(livros.get(livroEscolhido), p);
                    emp.registrarEmprestimo();
                    emprestimos.add(emp);
                }

                case 3 -> {
                    System.out.println("\nDigite o título do livro a devolver:");
                    String titulo = sc.nextLine();
                    Emprestimo emprestimo = emprestimos.stream()
                            .filter(e -> e.toString().toLowerCase().contains(titulo.toLowerCase()))
                            .findFirst()
                            .orElse(null);

                    if (emprestimo != null) {
                        emprestimo.registrarDevolucao();
                    } else {
                        System.out.println("Nenhum empréstimo encontrado para esse livro.");
                    }
                }

                case 4 -> {
                    System.out.println("\n=== LISTA DE EMPRÉSTIMOS ===");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo registrado.");
                    } else {
                        for (Emprestimo e : emprestimos) {
                            System.out.println(e);
                        }
                    }
                }

                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
