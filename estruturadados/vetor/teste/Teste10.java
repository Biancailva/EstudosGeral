package estruturadados.vetor.teste;

import estruturadados.vetor.VetorObjetos;

public class Teste10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(3);
        vetor.adiciona("String");
        System.out.println(vetor.tamanho());
    }
}
