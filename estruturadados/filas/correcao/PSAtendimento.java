package estruturadados.filas.correcao;

import estruturadados.filas.FilaPrioridade;

public class PSAtendimento implements Runnable {
    public PSAtendimento(FilaPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    private FilaPrioridade<Pessoa> fila;
    @Override
    public void run() {
        while (!fila.estaVazia()){
            try {
                System.out.println(fila.desenfileiar() + "atendida");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluido");
    }
}
