package estruturadados.matrizes;

public class MatrizTridimencional {
    public static void main(String[] args) {
        int [][][] matriztridimencional = new int[3][3][3];

        for(int i = 0; i < matriztridimencional.length; i++){
            for (int j = 0; j < matriztridimencional[i].length ; j++){
                for (int k = 0; k < matriztridimencional[i][j].length; k++){
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matriztridimencional[i][j][k] = i +j + k;
                }
            }
        }
        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;
        for(int i = 0; i < matriztridimencional.length; i++){
            for (int j = 0; j < matriztridimencional[i].length ; j++){
                for (int k = 0; k < matriztridimencional[i][j].length; k++){
                   soma += matriztridimencional[i][j][k];
                   if(matriztridimencional[i][j][k] % 2 ==0){
                       somaPar += matriztridimencional[i][j][k];
                   }else {
                       somaImpar += matriztridimencional[i][j][k];
                   }
                }
            }
        }
        System.out.println("Soma total " + soma);
        System.out.println("Soma pares " + somaPar);
        System.out.println("Soma Impar " + somaImpar);

    }
}
