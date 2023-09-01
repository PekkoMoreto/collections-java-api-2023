package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros (){
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero (int numero){
        numerosList.add(numero);
    }
    public int calcuarSoma(){
        int soma = 0;
        for(int numero : numerosList){
            soma += numero;
        }
        return soma;
    }
    public int encontraMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numerosList.isEmpty()) {
            for (int numero : numerosList) {
                if (numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontraMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()) {
            for (int numero : numerosList) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(5);

        int soma = somaNumeros.calcuarSoma();
        System.out.println("Soma: " + soma);

        int maior = somaNumeros.encontraMaiorNumero();
        System.out.println("Maior número: " + maior);

        int menor = somaNumeros.encontraMenorNumero();
        System.out.println("Menor número: " + menor);

        System.out.println("Números na lista: ");
        somaNumeros.exibirNumeros();
    }

}
