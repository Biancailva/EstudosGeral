package estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {


    private T[] elementos;
    private int tamanho;


    public Lista(int capacidade){
        this.elementos =(T[]) new Object[capacidade];
        this.tamanho = 0;
    }
//    public Lista(int capacidade, Class<T> tipoClasse){
//        this.elementos = (T[]) Array.newInstance(tipoClasse,capacidade);
//        this.tamanho = 0;
//    }


    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }return false;
        //ATE AQUI

    }//adicionar o elemento no vetor em qualquer posicao
    public void adicionaElemento(int posicao, T elemento){
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
            T[] elementosnovos =(T[]) new Object[this.elementos.length * 2];
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
        s.append(" ] ");
        return s.toString();


    }
    //realizar busca dos elementos
    public T busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }
    //ver se o elemento existe
    //pode usar boolean tambem, usando true no lugar do i e false no lugar do -1
    public int pesquisarElemento(T elemento){
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
    //Exercicios
    //Melhore a classe Lista e implemente o metodo
    //contem, semelhante ao metodo contains da classe
    //ArrayList
    //Exercicio 1
    public boolean contem(T elemento){
//        int pos = pesquisarElemento(elemento);
//        if(pos > -1){
//            return true;
//        }return false;

        return pesquisarElemento(elemento) > -1;
    }
    //Melhore a classe Lista e implemente o metodo
    //ultimo indice, semelhante ao metodo lastIndexOf
    //da classe ArrayList
    //Exercicio 2
    public int ultimoIndice(T elemento){
//        int ultimaPos = -1;
        //inicio ao final
//        for(int i = 0; i < this.tamanho;i++){
//            if(this.elementos[i].equals(elemento)){
//                ultimaPos = i;
//            }
//        }  return ultimaPos;
        //final ao inicio
        for(int i = this.tamanho -1; i >= 0;i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }return -1;


    } //Melhore a classe Lista e implemente o metodo
    //remove(T elemento), onde sera possivel remover um
    //elemento da lista passando o mesmo como parametro
    //Exercicio 3
    public void removeElemento(T elemento){
        int pos = this.pesquisarElemento(elemento);
        if(pos > -1){
            this.remove(pos);
        }
    }
    //Melhore a classe Lista e implemente o metodo
    //obtem(int posicao), onde sera possivel obter o elemento
    //dada a posicao do vetor. Esse metodo é semelhante ao metodo get
    //(int posicao) da classe ArrayList
    //Exercicio 4
    public T obtem(int posicao){
        return  this.busca(posicao);
    }
    //Melhore a classe Lista e implemente o metodo
    //limpar,onde todos os elementos da lista sao removidos.
    //Esse metodo é semelhante ao metodo clear da classe ArrayList
    //Exercicio 5
    public void limpar(){
        //opcao 1
    //   this.elementos =(T[]) new Object[this.elementos.length]
        //opcao 2
    //    this.tamanho = 0;
        //opcao 3
        for(int i = 0; i < this.tamanho;i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
    //Ultilize a classe Lista ou Vetor e classe contato e desenvolva os seguintes itens:
    //1. Crie um vetor com capacidade para 20 contatos;
    //2. Insira 30 contatos no vetor(isso é possivel ser feito atravez de um loop)
    //Crie um exemplo para utilizar cada metodo da classe Lista
    //Exercicio 6

    //Ultilize a classe ArrayList e desenvolva os seguintes itens:
    //1. Crie uma lista utilizando a classe ArrayList da APi do Java
    //2. Passe todos os contatos do vetor para o ArrayList
    //3. Crie um exemplo para utilizar cada metodo da classe ArrayList(somente os metodos que implementamos de forma
    //similar na classe Lista
}

