package estruturadados.vetor.correcao;

import estruturadados.vetor.Lista;
import estruturadados.vetor.Contato;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Criacao das variaveis
        Scanner scanner = new Scanner(System.in);

        //Criar vetor com 20 capacidade
        Lista<Contato> lista = new Lista<Contato>(20);

        //criar e adicionar 30 contatos
        criarContatos(5,lista);


        //Criar um menu
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
    private static void imprimir(Lista<Contato> lista){
        System.out.println(lista);
    }
    private static void limpar(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Contatos excluidos");
    }

    private static void imprimirTamanho(Lista<Contato> lista){
        System.out.println("Tamanho da lista é: " + lista.tamanho());
    }
    private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista){
        System.out.println("Criando um novo contato:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome,telefone,email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }
    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista){
        System.out.println("Criando um novo contato:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome,telefone,email);
        int pos = leInformacaoInt("Digite a posição: ", scanner);

        try {
            lista.adicionaElemento(pos,contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Nao adicionado");
        }
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }
    private static void obtemContato(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato...");
            pos = lista.pesquisarElemento(contato);
            System.out.println("Contrado encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
           Contato contato = lista.busca(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do ultimo indice do contato...");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contrado encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);
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
    private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
                lista.remove(pos);
                System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    private static void excluirContato(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posicao", scanner);
        try {
           Contato contato = lista.busca(pos);
           lista.removeElemento(contato);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }
    protected static int leInformacaoInt(String msg, Scanner scanner){
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();

                num = Integer.parseInt(entrada);
                entradaValida = true;
            }catch (Exception e){
                System.out.println("Entrada invalida, digite novamente");
            }

        }
        return num;
    }
    protected static String lerInformacao(String msg, Scanner scanner){
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }
    static int menu(Scanner scanner){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {


            System.out.println("Digite a opçao desejada: ");
            System.out.println("1 - Adiciona contato no final");
            System.out.println("2 - Adiciona contato em uma posiçao especifica");
            System.out.println("3 - Consultar contato em uma determinada posicao");
            System.out.println("4 - Buscar contato");
            System.out.println("5 - Buscar o ultimo contato");
            System.out.println("6 - Verificar se o contato existe");
            System.out.println("7 - Remover contato por posicao");
            System.out.println("8 - Excluir contato");
            System.out.println("9 - Vefificar tamanho");
            System.out.println("10 - Excluir");
            System.out.println("11 - Imprimir todos os contatos");
            System.out.println("0 - Sair");

            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >=0 && opcao <=11){
                    entradaValida = true;
                }else{
                    System.out.println("Digite a opcao mostrada no menu");
                }

            } catch (Exception e) {
                System.out.println("Digite a opcao mostrada no menu");
            }

        }

        return opcao;
    }
    private static void criarContatos(int quantidade, Lista<Contato> lista ){
        Contato contato;
        for(int i = 1; i < quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " +i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.adiciona(contato);
        }
    }
}
