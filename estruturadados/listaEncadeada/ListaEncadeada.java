package estruturadados.listaEncadeada;

public class ListaEncadeada<T>{
    private No<T> incio;
    private No<T> ultimo;
    private int tamanho = 0;

    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posicao nao existe.";
    private final String LISTA_VAZIA = "Lista esta vazia.";

    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento);
        if(tamanho == 0){
            this.incio = celula;
        }else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;

    }
    public void adicionaInicio(T elemento){
        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.incio = novoNo;
            this.ultimo = novoNo;
        }else{
            No<T> novoNo = new No<>(elemento, this.incio);
            this.incio = novoNo;
        }
        this.tamanho++;
    }
    public void adiciona(int posicao, T elemento){
        //if(posicao < 0 || posicao > this.tamanho){
        if(this.posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        if(posicao == 0){ //esta vazia
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho) {//adiciona 
            this.adiciona(elemento);
        } else {//meio
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }
    private boolean posicaoNaoExiste(int posicao){
        return !(posicao >= 0 && posicao <= this.tamanho);
    }
    public T remove(int posicao){
           if(this.posicaoNaoExiste(posicao)){
               throw new IllegalArgumentException(NAO_EXISTE);
           }
           if(posicao == 0){
               return this.removeInicio();
           }if(posicao == this.tamanho -1){
               return this.removeFinal();
        }
           No<T> noAnterior = this.buscaNo(posicao -1);
           No<T> atual = noAnterior.getProximo();
           No<T> proximo = atual.getProximo();
           atual.setProximo(null);
           noAnterior.setProximo(proximo);
           this.tamanho--;
           return atual.getElemento();
    }

    public T removeInicio(){
        if(this.tamanho == 0){
            throw new RuntimeException(LISTA_VAZIA);
        }
        T removido = this.incio.getElemento();
        this.incio = this.incio.getProximo();
        this.tamanho--;
        if(this.tamanho == 0){
            this.ultimo = null;
        }
        return removido;
    }
    public T removeFinal(){
        if(this.tamanho == 0){
            throw new RuntimeException(LISTA_VAZIA);
        }
        if(this.tamanho == 1){
            return this.removeInicio();
        }
        No<T> penutimoNo = this.buscaNo(this.tamanho -2);
        T removido = penutimoNo.getProximo().getElemento();
        penutimoNo.setProximo(null);
        this.ultimo = penutimoNo;
        this.tamanho--;


        return removido;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void limpa(){
        //outra forma mais elaborada
        for(No<T> atual = this.incio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.incio = null;
        this.ultimo = null;
        this.tamanho = 0;


        //forma mais simples
//        this.incio = null;
//        this.ultimo = null;
//        this.tamanho = 0;
    }
    private No<T> buscaNo(int posicao){
        //if(!(posicao >= 0 && posicao <= this.tamanho)){
        if(this.posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        No<T> noAtual = this.incio;
        for(int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }
    public T buscaPosicao(int posicao){

        return this.buscaNo(posicao).getElemento();
    }
    public int busca(T elemento){
        No<T> noAtual = this.incio;
        int pos = 0;

        while (noAtual != null){
            if(noAtual.getElemento().equals(elemento)){
                return pos;
            }
            pos++;

            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    @Override
    public String toString() {
        if(this.tamanho ==0){
            return  "[]";
        }
        StringBuilder builder = new StringBuilder();
       No<T> atual = this.incio;
       builder.append(atual.getElemento()).append(",");
       while (atual.getProximo() != null){
           atual = atual.getProximo();
           builder.append(atual.getElemento()).append(",");
       }
      return builder.toString();
    }
}
