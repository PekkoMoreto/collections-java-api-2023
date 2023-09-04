package main.java.set.Pesquisa;

import main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) ;
            {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Pedro", 123465);
        agendaContato.adicionarContato("Pedro Moreto", 0);
        agendaContato.adicionarContato("Bife", 2);
        agendaContato.adicionarContato("Amanda", 667);
        agendaContato.adicionarContato("Morgana", 1111111);
        agendaContato.exibirContato();

        System.out.println("Pesquisa: " + agendaContato.pesquisarPorNome("Amanda"));

        System.out.println("Contato atualizado: " +
                agendaContato.atualizarNumeroContato("Amanda", 666));
    }
}
