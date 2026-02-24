package estruturadados.filas.correcao;

import estruturadados.filas.Fila;

import java.util.Random;

//Escreva um programa usando Filas que simule a brincadeira de "Batata quente"
//A brincadeira consiste de um grupo de criancas que fica em circulo, sentados ou em pe.
//Uma crianca fica fora da roda, de costas ou com os olhos vendados, dizendo a frase
//"Batata quente, quente, quente,...,queimou!" Enquando isso, os demias vaopassando a bola
//de mao em mao ate ouvirem a palavra "queimou". Quem estiver com a bola nesse momento
//sai da roda. Ganha o ultimo que sobrar.
public class Ex4 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for(int i = 0; i < 10; i++){
            fila.enfileirar(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while (num == 0){
            num = aleatorio.nextInt(10);
        }
        System.out.println("Numero: " + num);

        while (fila.tamanho() > 1){
            for (int i = 0;i < num; i++){
                fila.enfileirar(fila.desenfileiar());
            }
            System.out.println("Eliminado" + fila.desenfileiar());
        }
        System.out.println("Ganhador: " + fila.desenfileiar());
    }

}
