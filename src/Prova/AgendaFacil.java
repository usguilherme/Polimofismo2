package Prova;

import java.util.HashMap;

public class AgendaFacil {
    private final HashMap<String,Estudante> listaEstudantes;
    private final HashMap<Integer,Evento> listaEventos;
    private int id;

    public AgendaFacil() {
        this.listaEstudantes = new HashMap<>();
        this.listaEventos = new HashMap<>();
        this.id = 1;
    }

    public int aumentarContador() {
        return id++;
    }

    public boolean cadastrarEstudante(String nome, String email) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty()) {
            return false;
        } else {
            listaEstudantes.put(email, new Estudante(nome, email));
            return true;
        }
    }

    public String exibirEstudantes(String email) {
        if (listaEstudantes.containsKey(email)) {
            Estudante estudante = listaEstudantes.get(email);
            return estudante.toString();
        } else {
            return "Não foi possível encontrar o estudante";
        }
    }

    //public String[] listarEstudantes() {} Faltou esse método

    public int cadastrarPalestra(String titulo, String descricao, String data, int maxParticipantes) {
        if (titulo == null || titulo.isEmpty() || descricao == null || descricao.isEmpty()) {
            System.out.println("Erro ao cadastrar palestra");
            return -1;
        } else {
            int oldId = id;
            Evento palestra = new Palestra(titulo, descricao, data, maxParticipantes);
            listaEventos.put(oldId, palestra);
            id = aumentarContador();
            return oldId;
        }
    }

    public int cadastrarWorkshop(String titulo, String descricao, String data, int maxParticipantes, int duracao) {
        if (titulo == null || titulo.isEmpty() || descricao == null || descricao.isEmpty()) {
            System.out.println("Erro ao cadastrar workshop");
            return -1;
        } else {
            int oldId = id;
            id = aumentarContador();
            Evento workShop = new WorkShop(titulo,descricao,data,maxParticipantes, duracao);
            listaEventos.put(oldId, workShop);
            return oldId;

        }
    }

    public int cadastrarOficinaAprendizagem(String titulo, String descricao, String data, int maxParticipantes, int duracao, boolean certificado) {
        if (titulo == null || titulo.isEmpty() || descricao == null || descricao.isEmpty()) {
            System.out.println("Erro ao cadastrar oficinaAprendizagem");
            return -1;
        } else {
            int oldId = id;
            id = aumentarContador();
            Evento cadastrarOficinaAprendizagem = new OficinaDeAprendizagem(titulo, descricao, data, maxParticipantes, duracao, certificado);
            listaEventos.put(oldId,cadastrarOficinaAprendizagem);
            return oldId;
        }
    }

    public boolean inscreverParticipantesEmEvento(String emailPartipante, int idEvento) {
        Evento evento = listaEventos.get(idEvento);
        Estudante estudante = listaEstudantes.get(emailPartipante);
        if (estudante == null || evento == null) {
            System.out.println("Erro ao inscrever participantes em evento");
            return false;
        } else {
            evento.cadastrarParticipante(estudante);
            return true;
        }
    }

    public String exibirDetalhesEvento(int idEvento) {
        Evento evento = listaEventos.get(idEvento);
        if (evento == null) {
            return " O evento não foi encontrado";
        } else {
            return evento.toString();
        }
    }
}
