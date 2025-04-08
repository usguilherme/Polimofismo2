package Prova;

import java.util.ArrayList;

public class Palestra extends Evento {

    public Palestra(String titulo, String idEvento, String descricao, String data, int qntMaxParticipantes) {
        super(titulo, idEvento, descricao, data, qntMaxParticipantes);
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

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String getIdEvento() {
        return super.getIdEvento();
    }

    @Override
    public void setIdEvento(String idEvento) {
        super.setIdEvento(idEvento);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public int getQntMaxParticipantes() {
        return super.getQntMaxParticipantes();
    }

    @Override
    public void setQntMaxParticipantes(int qntMaxParticipantes) {
        super.setQntMaxParticipantes(qntMaxParticipantes);
    }

    @Override
    public String getData() {
        return super.getData();
    }

    @Override
    public void setData(String data) {
        super.setData(data);
    }

    @Override
    public ArrayList<Estudante> getParticipantes() {
        return super.getParticipantes();
    }

    @Override
    public void setParticipantes(ArrayList<Estudante> participantes) {
        super.setParticipantes(participantes);
    }
}
