package estruturadados.filas.correcao;

import estruturadados.filas.Fila;
import estruturadados.filas.FilaPrioridade;

//Utilize a classe Fila para simular um sistema de senhas de um pronto socorro.
//Cada pessoa pode ser classificada com 3 codigos: -vermelho: de prioridade maior, - amarelo:prioridade
//media e verde: quando a situacao nao é grave e a pessoa pode esperar mais tempo. O programa deve obedecer
//as seguintes condicoes:
//Enfileirar 6 pessoas na fila inicial;
//Pessoas com prioridade vermelhas devem ser atendidas primeiro;
//Cada consulta dura cerca de 5 segundos, e depois o proximo da fila é atendido
//A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatoria
//(crie um codigo java para criar a aleatoriedade)
public class Ex3 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;
    public static void main(String[] args) {
        FilaPrioridade<Pessoa> fila = new FilaPrioridade<>();
        fila.enfileirar(new Pessoa("1",VERDE));
        fila.enfileirar(new Pessoa("2",AMARELO));
        fila.enfileirar(new Pessoa("3",VERDE));
        fila.enfileirar(new Pessoa("4",VERMELHO));
        fila.enfileirar(new Pessoa("5",VERMELHO));
        fila.enfileirar(new Pessoa("6",AMARELO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);
        t1.start();
        t2.start();
    }
}
