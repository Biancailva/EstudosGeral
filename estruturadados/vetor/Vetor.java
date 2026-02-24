package estruturadados.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;


    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    //ADICIONAR ELEMENTOS NO VETOR
    //casos com excessao
   /* public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;

    }else{
            throw new Exception("Vetor cheio!");
        }

   /*public void adiciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if(this.elementos [i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }*/

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
    if (this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;

    }return false;
    //ATE AQUI

}//adicionar o elemento no vetor em qualquer posicao
    public void adicionaElemento(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        this.aumentaCapacidade();
        //mover todos os elementos
        for(int i = this.tamanho - 1;i >= posicao;i--){
            this.elementos[i + 1] = this.elementos[i];
        }//atribuir os elementos para a posicao
        this.elementos[posicao] = elemento;
        this.tamanho++;

    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosnovos = new String[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosnovos[i] = this.elementos[i];
            }
            this.elementos = elementosnovos;
        }
    }

    // TAMANHO DO VETOR
    public int tamanho(){
        return this.tamanho;
    }//retorna a numeracao do tamanho q esta preenchido

    @Override
    //usando o metodo toString e uma classe do java
    //para ler o tamanho do vetor
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(" , ");

        }
        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();

 //       CONCATENACAO SIMPLES
//        String s = "[";
//
//        for(int i = 0; i < this.tamanho - 1; i++){
//            s+= this.elementos[i];
//            s+= " , ";
//
//        }
//        if (this.tamanho > 0){
//            s+= this.elementos[this.tamanho - 1];
//        }
//            s+= " ] ";
//
//        return Arrays.toString(elementos);

    }
    //realizar busca dos elementos
    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }
    //ver se o elemento existe
    //pode usar boolean tambem, usando true no lugar do i e false no lugar do -1
    public int pesquisarElemento(String elemento){
       for(int i = 0; i < this.tamanho;i++){
           if(this.elementos[i].equals(elemento)){
               return i;
           }
       }
       return -1;
    }
    //remover elemento
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        } for(int i = posicao;i < this.tamanho -1; i++ ){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

}
