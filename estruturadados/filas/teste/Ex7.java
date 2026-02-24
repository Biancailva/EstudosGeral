package estruturadados.filas.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();
        fila.add(2);
        fila.add(1);
        System.out.println(fila);

    }
}
