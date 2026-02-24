package estruturadados.pilha.correcao;
//Escreva um programa que leia 10 numeros.Para cada numero lido,
//verifique e codifique de acordo com as regras a seguir:
//- Se o numero for par, empilhe na pilha chamada par
//- Se o numero for impar, empilhe na pilha chamada impar
//- Se o numero for zero, desempilhe um elemento de cada pilha. Caso
//alguma oulha esteja vazia, mostre uma mensagem de erro na tela.
//Ao final do programa desempilhe todos os elementos das duas pilhas,
//imprimindo-as na tela.

import estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o numero ");
            int num = scan.nextInt();
            //pilha par
            if (num == 0) {
                Integer desempilhado = par.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par" + desempilhado);
                }

                desempilhado = impar.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha impar vazia");
                } else {
                    System.out.println("Desempilhando da pilha impar" + desempilhado);
                }

            } else if (num % 2 == 0) {
                System.out.println("Numero par empilhando na pilha par");
                par.empipla(num);
            } else {
                System.out.println("Numero impar empilhando na pilha impar");
                impar.empipla(num);
            }
        }
        System.out.println("desempilhando todos os numeros da pilha par");
        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par" + par.desempilha());

        }
        System.out.println("desempilhando todos os numeros da pilha impar");
            while (!impar.estaVazia()) {
                System.out.println("Desempilhando da pilha impar" + impar.desempilha());
            }
        }
    }
