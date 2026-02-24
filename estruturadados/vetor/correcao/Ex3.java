package estruturadados.vetor.correcao;

import estruturadados.vetor.Lista;

public class Ex3 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        System.out.println(lista);
        lista.removeElemento("A");
        System.out.println(lista);
        lista.removeElemento("D");
        System.out.println(lista);

    }
}
