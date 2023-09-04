package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(getMedia(), aluno.getMedia()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMedia());
    }
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
class ComparatorNota implements Comparator<Aluno>{

    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getMedia(), p2.getMedia());
    }

}
