package Prova;

public class Estudante {
    private String nome;
    private String email;
    private int pontos;
    private int qntEventos;

    public Estudante(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontos = 0;
        this.qntEventos = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Quantidade de eventos: ").append(qntEventos).append("\n");
        sb.append("Quantidade de pontos: ").append(pontos);
        return sb.toString();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getQntEventos() {
        return qntEventos;
    }

    public void setQntEventos(int qntEventos) {
        this.qntEventos = qntEventos;
    }
}
