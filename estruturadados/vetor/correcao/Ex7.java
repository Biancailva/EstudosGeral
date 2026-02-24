package estruturadados.vetor.correcao;

import estruturadados.vetor.Contato;
import estruturadados.vetor.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 extends Ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<Contato>(20);
        criarContatos(5,lista);

        int opcao = 1;
        while (opcao != 0){
            opcao = menu(scanner);
            switch (opcao){
                case 1: adicionarContatoFinal(scanner, lista);
                    break;
                case 2: adicionarContatoPosicao(scanner, lista);
                    break;
                case 3: obtemContatoPosicao(scanner,lista);
                    break;
                case 4:obtemContato(scanner,lista);
                    break;
                case 5: pesquisarUltimoIndice(scanner,lista);
                    break;
                case 6: pesquisarContatoExiste(scanner,lista);
                    break;
                case 7:excluirPorPosicao(scanner,lista);
                    break;
                case 8:excluirContato(scanner,lista);
                    break;
                case 9:imprimirTamanho(lista);
                    break;
                case 10:limpar(lista);
                    break;
                case 11:imprimir(lista);
                    break;
            }
        }
        System.out.println("Saindo...");
    }
    private static void imprimir(ArrayList<Contato> lista){
        System.out.println(lista);
    }
    private static void limpar(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Contatos excluidos");
    }

    private static void imprimirTamanho(ArrayList<Contato> lista){
        System.out.println("Tamanho da lista é: " + lista.size());
    }
    private static void adicionarContatoFinal(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Criando um novo contato:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome,telefone,email);

        lista.add(contato);
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }
    private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Criando um novo contato:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome,telefone,email);
        int pos = leInformacaoInt("Digite a posição: ", scanner);

        try {
            lista.add(pos,contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Nao adicionado");
        }
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }
    private static void obtemContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato...");
            pos = lista.indexOf(contato);
            System.out.println("Contrado encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do ultimo indice do contato...");
            pos = lista.lastIndexOf(contato);
            System.out.println("Contrado encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);
            if(existe){
                System.out.println("Contato encontrado: ");
                System.out.println(contato);
            }else{
                System.out.println("Contato não existe");
            }
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void excluirPorPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            lista.remove(pos);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.get(pos);
            lista.removeLast();
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void criarContatos(int quantidade, ArrayList<Contato> lista ){
        Contato contato;
        for(int i = 1; i < quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " +i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.add(contato);
        }
    }
}
