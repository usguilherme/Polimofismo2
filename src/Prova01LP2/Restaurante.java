package Prova01LP2;

import java.util.HashSet;

public class Restaurante { //Até 50 restaurantes, sem repeticao
    private final String  nome;
    private final String pratoEscolhido;
    private final double valorMenu;
    private int votos;
    private HashSet<Cliente> listaClientesRestaurante;

    public Restaurante(String pratoEscolhido, String nome) {
        this.pratoEscolhido = pratoEscolhido;
        this.nome = nome;
        this.valorMenu = 89.90;
        this.votos = 0;
        this.listaClientesRestaurante = new HashSet<>();
    }

    public boolean verificarCliente(Cliente cliente) {
        return listaClientesRestaurante.contains(cliente);
    }

    public void adicionarClienteListaRestaurante(Cliente cliente) {
        listaClientesRestaurante.add(cliente);
    }

    public void aumentarVotos() {
        votos++;
    }

    public String getNome() {
        return nome;
    }

    public String getPratoEscolhido() {
        return pratoEscolhido;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public HashSet<Cliente> getListaClientesRestaurante() {
        return listaClientesRestaurante;
    }

    public void setListaClientesRestaurante(HashSet<Cliente> listaClientesRestaurante) {
        this.listaClientesRestaurante = listaClientesRestaurante;
    }
}
