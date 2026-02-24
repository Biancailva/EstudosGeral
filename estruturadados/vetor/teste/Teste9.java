package estruturadados.vetor.teste;


import estruturadados.vetor.VetorObjetos;

public class Teste9 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);
    }
}
