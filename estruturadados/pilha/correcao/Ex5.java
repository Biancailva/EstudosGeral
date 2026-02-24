package estruturadados.pilha.correcao;

import estruturadados.pilha.Pilha;

//Escreva um programa que testa se uma sequencia de caracteres
//fornecida pelo usuario é um palindromo, ou seja, é uma palavra
//cuja primeira metade é simetrica a segunda metade. Ex:
//AABCCBAA - sim
//ADDFDDA - sim
//ABFFBB - nao
public class Ex5 {
    public static void main(String[] args) {
       resultado("ADA");
       resultado("ABC");
       resultado("abcd");
       resultado("ABCCBA");
    }
    public static void resultado(String palavra){
        System.out.println(palavra + " é polindromo?" + testaPalindromo(palavra));

    }
    public static boolean testaPalindromo(String palavra){
        Pilha<Character> pilha = new Pilha<>();

        for(int i = 0; i < palavra.length(); i++){
            pilha.empipla(palavra.charAt(i));
        }


        String palavraInversa = "";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }
        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
