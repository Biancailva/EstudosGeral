package estruturadados.listaEncadeada.teste;

import estruturadados.listaEncadeada.ListaEncadeada;

public class Ex6 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        System.out.println("Tamanho: " + lista.getTamanho());
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println("Busca elemento");
        System.out.println(lista.busca(2));
        System.out.println("Busca posicao");
        System.out.println(lista.buscaPosicao(0));
        System.out.println(lista.buscaPosicao(3));
        
    }
}
