package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

public class Ex3 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());
        pilha.empipla(1);
        System.out.println(pilha.estaVazia());
    }
}
