package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Teste8 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);


        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor);

        vetor.remove(4);

        System.out.println(vetor);

        //usando o metodo de pesquisarElementos para remover o elemento
        System.out.println("Remover o elemento 4");

        int pos =vetor.pesquisarElemento("elemento 4");
        if(pos >= -1){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento nao existe");
        }
        System.out.println(vetor);

    }
}
