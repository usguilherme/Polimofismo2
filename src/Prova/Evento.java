package Prova;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String titulo;
    private String descricao;
    private String data;
    private int qntMaxParticipantes;
    private List<Estudante> participantes;

    public Evento(String titulo, String descricao, String data, int qntMaxParticipantes) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.qntMaxParticipantes = qntMaxParticipantes;
        this.participantes = new ArrayList<>();
    }

    public void cadastrarParticipante(Estudante estudante) {
        if (participantes.contains(estudante)) {
            throw new IllegalArgumentException("Participante já cadastrado no evento");
        }
        if (participantes.size() >= qntMaxParticipantes) {
            throw new IllegalArgumentException("Quantidade de participantes excede o limite do evento");
        }
        participantes.add(estudante);
        estudante.setPontos(calcularPontuacao());
    }

    public abstract int calcularPontuacao();

    public ArrayList<String> verificarNomes() {
        ArrayList<String> nomes = new ArrayList<>();
        for (Estudante estudante : participantes) {
            nomes.add(estudante.getNome());
        }
        return nomes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(descricao).append("\n");
        sb.append(data).append("\n");
        sb.append(calcularPontuacao()).append("\n");
        sb.append(verificarNomes());
        return sb.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntMaxParticipantes() {
        return qntMaxParticipantes;
    }

    public void setQntMaxParticipantes(int qntMaxParticipantes) {
        this.qntMaxParticipantes = qntMaxParticipantes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Estudante> getParticipantes() {
        return new ArrayList<>(participantes);
    }


    public void setParticipantes(ArrayList<Estudante> participantes) {
        this.participantes = participantes;
    }
}
