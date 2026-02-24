package estruturadados.vetor.teste;

import estruturadados.vetor.Contato;
import estruturadados.vetor.Lista;
import estruturadados.vetor.VetorObjetos;

public class Teste11 {
    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("contato1", "123456","hjdserhbvfff");
        Contato c2 = new Contato("contato2", "123456","hjdserhbvfff");
        Contato c3 = new Contato("contato3", "123456","hjdserhbvfff");

        vetor.adiciona(c1);
    }
}