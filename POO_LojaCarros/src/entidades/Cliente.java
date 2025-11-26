package entidades;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Usei só os getters porque não preciso mudar o nome do cliente, então não va iter código inútil.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}