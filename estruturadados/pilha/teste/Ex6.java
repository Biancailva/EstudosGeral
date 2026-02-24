package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

import java.util.Stack;

public class Ex6 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        //esta vazio isEmpy
        System.out.println(stack.isEmpty());

        //empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());

        //tamanho
        System.out.println(stack.size());
        System.out.println(stack);

        //espiar o topo
        System.out.println(stack.peek());

        //remover
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
