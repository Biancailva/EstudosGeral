package estruturadados.vetor.teste;

import estruturadados.vetor.Contato;
import estruturadados.vetor.VetorObjetos;

public class ContatoTeste {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

       Contato c1 = new Contato("contato1", "123456","hjdserhbvfff");
       Contato c2 = new Contato("contato2", "123456","hjdserhbvfff");
       Contato c3 = new Contato("contato3", "123456","hjdserhbvfff");

       vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);

        int pos = vetor.pesquisarElemento(c1);
        if(pos > -1){
            System.out.println("Elemento existe");
        }else{
            System.out.println("Elemento não existe");
        }
    }
}
