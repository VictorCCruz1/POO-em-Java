package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        System.out.println("=== Contatos na Agenda ===");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public boolean removerContato(String nome) {
        Contato c = buscarContato(nome);
        if (c != null) {
            contatos.remove(c);
            return true;
        }
        return false;
    }
}
