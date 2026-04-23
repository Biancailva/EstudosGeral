package estruturadados.listaEncadeada.teste;

import estruturadados.listaEncadeada.ListaEncadeada;

import java.util.LinkedList;

public class Ex11 {
    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        //adicionaPorPosicao();
        //removeInicio();
        //removeFinal();
        //remove();
        apiJava();
    }
    public static void apiJava(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);//adiciona final
        lista.addFirst(2);//adiciona primeiro
        lista.addLast(3);//adiciona como ultimo
        lista.add(2,2);
        System.out.println(lista.contains(2));//busca o elemento
        System.out.println(lista);
        lista.remove();
        System.out.println(lista);
        lista.remove(1);//tem o first e last tambem
    }
    public static void remove(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista.remove(2));
        System.out.println(lista);
    }
    public static void removeFinal(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista.removeFinal());
        System.out.println(lista);
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
