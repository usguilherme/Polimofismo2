package Prova01LP2;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema_PRW {
    private HashMap<String, Cliente> listaClientes;
    private HashMap<String, Restaurante> listaRestaurante;

    public Sistema_PRW() {
        this.listaRestaurante = new HashMap<>();
        this.listaClientes = new HashMap<>();
    }


    public void adicionarRestaunte(String nome, String pratoEscolhido) {
        if (nome == null || pratoEscolhido == null || nome.isEmpty() || pratoEscolhido.isEmpty()) {
            throw new IllegalArgumentException("Não foi possível cadastrar o restaurante.");
        } else {
            Restaurante restaurante = new Restaurante(nome, pratoEscolhido);
            System.out.println("Restaurante adicionado com sucesso.");
        }
    }

    public void adicionarCliente(String nome, String email) {
        if (nome == null || email == null || nome.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("Não foi possível cadastrar o cliete");
        } else {
            Cliente cliente = new Cliente(nome, email);
            System.out.println("Cliente adicionado com sucesso;");
        }
    }

    public void visitarRestaurante(String emailCliente, String nomeRestaurante) {
        Cliente cliente = listaClientes.get(emailCliente);
        Restaurante restaurante = listaRestaurante.get(nomeRestaurante);

        if (restaurante == null || cliente == null) {
            throw new IllegalArgumentException("Erro ao visitar restaurante.");
        } else {
            restaurante.adicionarClienteListaRestaurante(cliente);
        }
    }

    public String[] listarClientesRestaurante(String nomeRestaurante) {
        Restaurante restaurante = listaRestaurante.get(nomeRestaurante);
        if (restaurante == null) {
            throw new IllegalArgumentException("Erro ao listar clientes do restaurante.");
        }
        HashSet<Cliente> listaClientes = restaurante.getListaClientesRestaurante();
        String[] novoArray = new String[listaClientes.size()];
        int i = 0;
        for (Cliente cliente : listaClientes) {
            novoArray[i] = cliente.toString();
            i++;
        }
        return novoArray;
    }

    public String votarPratoPreferido(String emailCliente, String nomeRestaurante) {
        Restaurante restaurante = listaRestaurante.get(nomeRestaurante);
        Cliente cliente = listaClientes.get(emailCliente);
        if (restaurante == null || cliente == null || (!restaurante.verificarCliente(cliente))) {
            throw new IllegalArgumentException("Voto não registrado.");
        } else {
            restaurante.aumentarVotos();
            return "Voto registrado com sucesso!";
        }
    }

    public String melhorPrato() {
        if (listaRestaurante.isEmpty()) {
            throw new IllegalArgumentException("Nenhum restaunte cadastrado.");
        }

        String pratoVencedor = null;
        int maiorVoto = -1;

        for (Restaurante restaurante : listaRestaurante.values()) {
            if (restaurante.getVotos() > maiorVoto) {
                maiorVoto = restaurante.getVotos();
                pratoVencedor = restaurante.getPratoEscolhido();
            }
        }
        return pratoVencedor;
    }

}
