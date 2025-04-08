package Prova;

import java.util.ArrayList;

public class OficinaDeAprendizagem extends Evento {
    private int duracao;
    private boolean certificacao;

    public OficinaDeAprendizagem(String titulo, String idEvento, String descricao, String data, int qntMaxParticipantes, int duracao, boolean certificacao) {
        super(titulo, idEvento, descricao, data, qntMaxParticipantes);
        this.duracao = duracao;
        this.certificacao = certificacao;
    }

    @Override
    public void cadastrarParticipante(Estudante estudante) {
        super.cadastrarParticipante(estudante);
        estudante.setPontos(calcularPontuacao());
    }

    @Override
    public int calcularPontuacao() {
        if (certificacao) {
            return duracao + 10;
        }
        return 0;
    }

    @Override
    public ArrayList<String> verificarNomes() {
        return super.verificarNomes();
    }

    public String verificarCertificacao() {
        if (certificacao) {
            return "Sim";
        } else {
            return "Nao";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Duracao: ").append(this.duracao).append("\n");
        sb.append("Certificacao: ").append(verificarCertificacao()).append("\n");
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
    public void setData(String data) {
        super.setData(data);
    }

    @Override
    public String getData() {
        return super.getData();
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
