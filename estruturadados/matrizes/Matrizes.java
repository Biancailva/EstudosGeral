package estruturadados.matrizes;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        double[][] alunos = new double[2][4];
        String[] nomeAlunos = new String[2];
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            continuar = menu(alunos, nomeAlunos);
        }
//        alunos[0][0] = 10;
//        alunos[0][1] = 7;
//        alunos[0][2] = 8;
//        alunos[0][3] = 9;
//
//        alunos[1][0] = 10;
//        alunos[1][1] = 7;
//        alunos[1][2] = 8;
//        alunos[1][3] = 9;
//
//        alunos[2][0] = 10;
//        alunos[2][1] = 7;
//        alunos[2][2] = 8;
//        alunos[2][3] = 9;

    }

    public static void imprimir(double[][] alunos, String[] nomeAlunos) {
        System.out.println("Lista dos alunos");
        for (int i = 0; i < alunos.length; i++) {
            if (nomeAlunos[i] != null) {
                System.out.println("Aluno " + nomeAlunos[i]);

                for (int j = 0; j < alunos[i].length; j++) {
                        System.out.println("Nota " + (j + 1) + " = " + alunos[i][j]);
                    }
                }
                System.out.println();
            }
        }

    public static void adicionarAlunos(String[] nomeAlunos, Scanner scan) {
        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + " = ");
            nomeAlunos[i] = scan.next();
        }
        System.out.println("Aluno adicionado com sucesso");
    }

    public static void adicionarNotas(double[][] alunos, String[] nomeAlunos, Scanner scan) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite as notas do aluno " + nomeAlunos[i]);
            for (int j = 0; j < alunos[i].length; j++) {
                //iniciar a contagem das notas a partir do 1
                System.out.println("Nota " + (j + 1) + " = ");
                alunos[i][j] = scan.nextDouble();
            }
            System.out.println("Notas adicionadas!");
            System.out.println();
        }

    }

    public static void calcularMedia(double[][] alunos, String[] nomeAlunos) {
        System.out.println("Calculando a media");
        for (int i = 0; i < alunos.length; i++) {
            if (nomeAlunos[i] != null) {
                double soma = 0;

                for (int j = 0; j < alunos[i].length; j++) {
                    soma += alunos[i][j];
                }
                System.out.println("Media do aluno " + nomeAlunos[i] + " é " + (soma/4));
                if(soma >= 21){
                    System.out.println("Aprovado");
                }else{
                    System.out.println("Reprovado");
                }

            }
        }
    }

    public static void alterarNota(double[][] alunos, String[] nomeAlunos, Scanner scan) {
        imprimir(alunos, nomeAlunos);
        System.out.println("Digite o nome do aluno:");
        String nome = scan.next();
        for (int i = 0; i < alunos.length; i++) {
            if (nomeAlunos[i] != null && nomeAlunos[i].equalsIgnoreCase(nome)) {
                System.out.println("Digite a nota a ser alterada:");
                int nota = scan.nextInt();
                System.out.println("Digite a nova nota:");
                double novaNota = scan.nextDouble();
                alunos[i][nota - 1] = novaNota;
                System.out.println("Aluno " + nomeAlunos[i]);
                for (int j = 0; j < alunos[i].length; j++) {
                    System.out.println("Nota " + (j + 1) + " = " + alunos[i][j]);
                }
                System.out.println("Nota alterada com sucesso");
                break;
            }

            System.out.println();
        }
    }

    public static void remover(double[][] alunos, String[] nomeAlunos, Scanner scan) {
        imprimir(alunos, nomeAlunos);
        System.out.println("Digite o nome do aluno a ser removido:");
        String nome = scan.next();
        for (int i = 0; i < nomeAlunos.length; i++) {
            if (nomeAlunos[i] != null && nomeAlunos[i].equalsIgnoreCase(nome)) {
                nomeAlunos[i] = null;
                for (int j = 0; j < alunos[i].length; j++) {
                    alunos[i][j] = 0;
                }
                System.out.println("Aluno removido com sucesso.");
                return;
            }
        }
        System.out.println("Aluno nao encontrado");
    }

    public static boolean menu(double[][] alunos, String[] nomeAlunos) {
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Adicionar Aluno");
        System.out.println("2 - Adicionar Nota");
        System.out.println("3 - Calcular media");
        System.out.println("4 - Alterar nota");
        System.out.println("5 - Remover aluno");
        System.out.println("6 - Ver lista de Alunos");
        System.out.println("7 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                adicionarAlunos(nomeAlunos, scan);
                break;
            case 2:
                adicionarNotas(alunos, nomeAlunos, scan);
                break;
            case 3:
                calcularMedia(alunos, nomeAlunos);
                break;
            case 4:
                alterarNota(alunos, nomeAlunos, scan);
                break;

            case 5:
                remover(alunos, nomeAlunos, scan);
                break;
            case 6:
                imprimir(alunos, nomeAlunos);
                break;
            case 7:
                System.out.println("Saindo...");
                return false;
            default:
                System.out.println("Opção inválida");
        }
        return true;
    }
}

