package Prova01LP2;

public class Cliente { //até 100 clientes, sem repeticao
    private String nome;
    private String email;
    private String pratoPreferido;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pratoPreferido = "Prato preferido não definido";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.nome).append(", Prato preferido: ").append(this.pratoPreferido);
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

    public String getPratoPreferido() {
        return pratoPreferido;
    }

    public void setPratoPreferido(String pratoPreferido) {
        this.pratoPreferido = pratoPreferido;
    }
}
