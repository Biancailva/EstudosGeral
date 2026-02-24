package estruturadados.pilha.correcao;

import estruturadados.pilha.Pilha;

import java.util.Scanner;

//Escreva um programa que leia 10 numeros.Para cada numero lido,
//verifique e codifique de acordo com as regras a seguir:
//- Se o numero for par, empiplhe na pilha;
//- Se o numero for impar, desempilhe um numero da pilha.
//Caso a pilha esteja vazia, mostre uma mensagem.
//- Se ao final do programa a pilha nao estiver vazia, desempilhe
//todos os elementos, imprimindo-os na tela.
public class Ex1 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for(int i = 1; i< 10; i++){
            System.out.println("Digite um numero");
            int num = scan.nextInt();

            if(num % 2 == 0){
                System.out.println("Empilhando o numero " + num);
                pilha.empipla(num);
            }else {
                Integer desempilhado = pilha.desempilha();
                if(desempilhado == null) {
                    System.out.println("Pilha está vazia");
                }
                    System.out.println("Numero impar, desempilhando " + desempilhado);
                }
            }

        System.out.println("Todos os numeros foram lidos, desempilhando numeros da pilha");

        while (!pilha.estaVazia()){
                System.out.println("desempilhando " + pilha.desempilha());
            }

        System.out.println("Todos os elementos foram desempilhados");
        }

    }


