package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Teste2 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        //casos com excessao
        /*
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");


    }
}
