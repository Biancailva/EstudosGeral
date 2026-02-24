package estruturadados.filas.correcao;

import estruturadados.filas.Fila;

//Escreva um programa que simule a distribuicao de senhas de atendimento
//a um grupo de pessoas. Cada pessoa pode receber uma senha prioritaria
//ou uma senha normal. O programa deve obedecer os seguintes criterios:
//- Existe apenas 1 atendente
//- 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritaria;
//- Noa havendo prioridades, as pessoas com senha normal podem ser atendidas.
public class Ex2 {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();
        //constante
        final int MAX_PRIORIDADE = 3;

        regular.enfileirar("1");
        regular.enfileirar("2");
        regular.enfileirar("3");
        regular.enfileirar("4");
        regular.enfileirar("5");
        prioridade.enfileirar("P1");
        prioridade.enfileirar("P2");
        prioridade.enfileirar("P3");
        prioridade.enfileirar("P4");

        while (!regular.estaVazia() || !prioridade.estaVazia()){
            int cont = 0;
            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE){
               atendePessoa(prioridade);
                cont++;
            }
            if(!regular.estaVazia()){
               atendePessoa(regular);
            }
            if(prioridade.estaVazia()){
                while (!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }
    }
    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileiar();
        System.out.println(pessoaAtendida + "foi atendida");
    }
}
