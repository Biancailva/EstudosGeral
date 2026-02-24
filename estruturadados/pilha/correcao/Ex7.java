package estruturadados.pilha.correcao;

import java.util.Stack;

//Usando a classe Pilha ou Stack, desenvolva um algoritmo que faca a conversao
//de numeros decimais para binarios
public class Ex7 {
    public static void main(String[] args) {
        resultado(2);
        resultado(10);
        resultado(25);
        resultadoDeBases(25, 16);
        resultadoDeBases(25, 8);
        resultadoDeBases(25, 2);
    }
    public static void resultado(int numero){
        System.out.println(numero + " em binario é: " + decimalBinario(numero));
    }
    public static void resultadoDeBases(int numero, int base){
        System.out.println(numero + " na base " + base + " é: " + qualquerBase(numero, base));
    }
    public static String decimalBinario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;
        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2; //numero = numero /2

        }
        while (!pilha.isEmpty()){
            numeroBinario += pilha.pop();
        }


        return numeroBinario;
    }
    public static String qualquerBase(int numero, int base){
        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0){
            resto = numero % base;
            pilha.push(resto);
            numero /= base; //numero = numero /2

        }
        while (!pilha.isEmpty()){
            numBase += bases.charAt(pilha.pop());
        }


        return numBase;
    }


}
