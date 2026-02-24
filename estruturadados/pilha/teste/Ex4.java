package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

public class Ex4 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());
        System.out.println(pilha);

        pilha.empipla(1);
        pilha.empipla(2);
        pilha.empipla(3);
        pilha.empipla(4);

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
