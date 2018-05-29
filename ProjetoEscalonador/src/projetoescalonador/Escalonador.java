package projetoescalonador;

import java.util.LinkedList;
import java.util.Queue;

public class Escalonador {

    private Queue<Processo> fila;

    public Escalonador(Queue fila) {
        this.fila = new LinkedList();
    }
    

    public Processo escalonar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addProcesso(Processo processo) {
    }
}
