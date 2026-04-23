package estruturadados.listaEncadeada.teste;

import estruturadados.listaEncadeada.ListaEncadeada;

public class Ex3 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        System.out.println(lista);
        System.out.println(lista.getTamanho());

        lista.adiciona(2);
        System.out.println(lista);
        lista.adiciona(3);
        System.out.println(lista);

    }
}
