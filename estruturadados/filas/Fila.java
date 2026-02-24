package estruturadados.filas;

import estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

    public Fila(){
        super();
    }
    public Fila(int capacidade) {
        super(capacidade);
    }
    public void enfileirar(T elemento){
//        this.elementos[this.tamanho] = elemento;
//        this.tamanho++; outra opcao

//        this.elementos[this.tamanho++] = elemento;
        //ou usar o metodo da classe mae, ai so chama, como esta escrito abaixo
        this.adiciona(elemento);
    }
    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }
    public T desenfileiar(){
        final int pos = 0;
        if(this.estaVazia()){
            return null;
        }
        T elementoASerRemovido = this.elementos[pos];

        this.remove(pos);
        return elementoASerRemovido;
    }
}
