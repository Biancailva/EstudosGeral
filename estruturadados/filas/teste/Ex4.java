package estruturadados.filas.teste;

import estruturadados.filas.Fila;

public class Ex4 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println(fila);
        System.out.println(fila.desenfileiar());
        System.out.println(fila);
        System.out.println(fila.desenfileiar());
        System.out.println(fila);
    }
}
