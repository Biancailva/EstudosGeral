package estruturadados.listaEncadeada.teste;

import estruturadados.listaEncadeada.ListaEncadeada;

public class Ex8 {
    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        //adicionaPorPosicao();
        removeInicio();

    }
    public static void removeInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        //lista.removeInicio();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista.removeInicio());
        System.out.println(lista);

    }
    public static void adicionaPorPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(0,0);
        lista.adiciona(4,5);
        lista.adiciona(2,3);
        System.out.println(lista);
    }
    public static void adicionaInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }
    public static void testesIniciais(){
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
