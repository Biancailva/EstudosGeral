package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

public class Ex5 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empipla(1);
        pilha.empipla(2);
        pilha.empipla(3);
        pilha.empipla(4);

        System.out.println(pilha);
        System.out.println("Desempilhando..." + pilha.desempilha());
        System.out.println(pilha);

    }
}
