package estruturadados.filas.teste;

import estruturadados.filas.Fila;

public class Ex1 {
    public static void main(String[] args) {
        Fila<Integer> fila =new Fila<>();

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
    }
}
