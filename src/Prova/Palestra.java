package Prova;

import java.util.ArrayList;

public class Palestra extends Evento {

    public Palestra(String titulo, String descricao, String data, int qntMaxParticipantes) {
        super(titulo,descricao, data, qntMaxParticipantes);
    }

    @Override
    public int calcularPontuacao() {
        return 0;
    }

    @Override
    public void cadastrarParticipante(Estudante estudante) {
        super.cadastrarParticipante(estudante);
    }

    @Override
    public ArrayList<String> verificarNomes() {
        return super.verificarNomes();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
