package estruturadados.pilha.correcao;

import estruturadados.pilha.Pilha;

//Escreva um programa para verificar se uma expressao matematica
//tem os parenteses agrupados da maneira correta, isto é:
//1. Se o numero de perenteses a esquerda e a direita sao iguais;
//2. Se todo parentese aberto é seguido posteriormete por um fechamento de
//parenteses. Ex
//((A+B) ou A+B( - viola a condicao 1
//)A+B(-C ou (A+B)) - (C + D - viola a condicao 2
//((A+B)+D) - esta ok
public class Ex6 {
    public static void main(String[] args) {
        resultado("(A+B");
        resultado(")A+B(-C");
        resultado("(A+B))");
        resultado("((A+B)+D)");
        
    }
    public static void resultado(String expressao){
        System.out.println(expressao + "esta balanceada?" + verificarSibolos(expressao));
    }
    final static String ABRE = "({[";
    final static String FECHA = ")}]";
    public static boolean verificarSibolos(String expressao){
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;
        while (index < expressao.length()){
            simbolo = expressao.charAt(index);
            if(ABRE.indexOf(simbolo) > -1){
                pilha.empipla(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if(pilha.estaVazia()){
                    return false;
                }else{
                    topo = pilha.desempilha();
                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }




        return true;
    }
}
