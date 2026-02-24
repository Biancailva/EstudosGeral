package estruturadados.filas.teste;

import estruturadados.filas.FilaPrioridade;

public class Ex6 {
    public static void main(String[] args) {
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(4);
        System.out.println(fila);
    }
}
