package estruturadados.listaEncadeada.teste;

import estruturadados.listaEncadeada.ListaEncadeada;

public class Ex2 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        System.out.println(lista);
        System.out.println(lista.getTamanho());
    }
}
