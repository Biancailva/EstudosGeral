package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Teste7 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);


        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor);

    }
}
