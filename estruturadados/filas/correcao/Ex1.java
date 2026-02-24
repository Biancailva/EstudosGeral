package estruturadados.filas.correcao;

import estruturadados.filas.Fila;

//Usando a etsrutura de dados Fila, crie uma fila de documentos
//que precisam ser impressos. Cada documento é composto
//de um nome e quantidade de folhas a serem impressas.
//O programa deve:
//Enfileirar os documentos;
//E seguindo a ordem, o programa deve "imprimir" cada documento,
//desenfileirando da fila. Se desejar pode usar Treads para esperar
//a impressao de acordo com o numero de folhas a serem impressas.
public class Ex1 {
    public static void main(String[] args) {
        Fila<Documento> impressora = new Fila<>();

        impressora.enfileirar(new Documento("A" , 1));
        impressora.enfileirar(new Documento("B" , 2));
        impressora.enfileirar(new Documento("C" , 3));
        impressora.enfileirar(new Documento("D" , 4));

        while (!impressora.estaVazia()){
            Documento doc = impressora.desenfileiar();
            System.out.println("Imprimindo documento..." + doc.getNome());
            try {
                Thread.sleep(700L * doc.getNumFolhas());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos");
    }
}
