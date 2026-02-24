package estruturadados.base;

public class EstruturaEstatica<T> {

        protected T[] elementos;
        protected int tamanho;


        public EstruturaEstatica(int capacidade) {
            this.elementos = (T[]) new Object[capacidade];
            this.tamanho = 0;
        }

        public EstruturaEstatica() {
            this(10);
        }

        protected boolean adiciona(T elemento) {
            this.aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;

            }
            return false;
        }

    protected boolean adiciona(int posicao, T elemento){

        if (posicao < 0 || posicao > tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
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
        private void aumentaCapacidade(){
            if(this.tamanho == this.elementos.length){
                T[] elementosnovos =(T[]) new Object[this.elementos.length * 2];
                for(int i = 0; i < this.elementos.length; i++){
                    elementosnovos[i] = this.elementos[i];
                }
                this.elementos = elementosnovos;
            }
        }
        public boolean estaVazia(){
           return this.tamanho == 0;
        }
    protected void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        } for(int i = posicao;i < this.tamanho -1; i++ ){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    }



