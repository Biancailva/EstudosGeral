package estruturadados.pilha.correcao;

import estruturadados.pilha.Pilha;

//Utilize a classe Pilha e desenvolva os seguintes itens:
//1. Crie uma pilha com capacidade para 20 livros;
//2. Insira 6 livros na pilha; Cada livro contem nome, isbn, ano de nascimento e autor
//3. Crie um exemplo para utilizar cada metodo da classe Pilha
public class Ex3 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1");
        livro1.setAutor("Eu");
        livro1.setAnoLanca("2026");
        livro1.setIsbn("19");

        Livro livro2 = new Livro();
        livro2.setNome("Livro 2");
        livro2.setAutor("Eu");
        livro2.setAnoLanca("2026");
        livro2.setIsbn("19");

        Livro livro3 = new Livro();
        livro3.setNome("Livro 3");
        livro3.setAutor("Eu");
        livro3.setAnoLanca("2026");
        livro3.setIsbn("19");

        Livro livro4 = new Livro();
        livro4.setNome("Livro 4");
        livro4.setAutor("Eu");
        livro4.setAnoLanca("2026");
        livro4.setIsbn("19");

        Livro livro5 = new Livro();
        livro5.setNome("Livro 5");
        livro5.setAutor("Eu");
        livro5.setAnoLanca("2026");
        livro5.setIsbn("19");

        Livro livro6 = new Livro();
        livro6.setNome("Livro 6");
        livro6.setAutor("Eu");
        livro6.setAnoLanca("2026");
        livro6.setIsbn("19");

        System.out.println("Pilha de livros criadas, pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Empilhando livros na pilha");
        pilha.empipla(livro1);
        pilha.empipla(livro2);
        pilha.empipla(livro3);
        pilha.empipla(livro4);
        pilha.empipla(livro5);
        pilha.empipla(livro6);
        System.out.println(pilha.tamanho() + "livros foram empilhados");
        System.out.println(pilha);
        System.out.println("Pilha de livros criadas, pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Espiando o topo da pilha " + pilha.topo());
        System.out.println("Desempilhando livros da pilha");
        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia" + pilha.estaVazia());
    }
}
