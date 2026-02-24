package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Teste6 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);


        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor);

        vetor.adicionaElemento(4, "Elemento10");
        System.out.println(vetor);
    }
}

