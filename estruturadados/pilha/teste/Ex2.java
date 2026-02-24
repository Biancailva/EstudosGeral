package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

public class Ex2 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for(int i = 1; i<= 11;i++){
            pilha.empipla(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
