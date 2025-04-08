package Prova;

import java.util.ArrayList;

public class WorkShop extends Evento {
    private int duracao;

    public WorkShop(String titulo,  String descricao, String data, int qntMaxParticipantes, int duracao) {
        super(titulo,descricao, data, qntMaxParticipantes);
        this.duracao = duracao;
    }

    @Override
    public int calcularPontuacao() {
        return duracao;
    }

    @Override
    public void cadastrarParticipante(Estudante estudante) {
        super.cadastrarParticipante(estudante);
        estudante.setPontos(calcularPontuacao());
    }

    @Override
    public ArrayList<String> verificarNomes() {
        return super.verificarNomes();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append('\n');
        sb.append(duracao);
        return sb.toString();
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
