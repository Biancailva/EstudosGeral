package estruturadados.vetor.correcao;

import estruturadados.vetor.Lista;

public class Ex4 {
    public static void main(String[] args) {
            Lista<String> lista = new Lista<>(5);
            lista.adiciona("A");
            lista.adiciona("B");
            lista.adiciona("C");
            lista.adiciona("D");
        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(3));
    }
}
