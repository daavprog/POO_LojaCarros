package entidades;

public abstract class ItemVenda implements Imprimivel {
    // Ecapsulamento para atributos privados
    private String descricao;
    private double preco;

    public ItemVenda(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // Os Getters e os Setters para aceasso controlado
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Uso o Método abstrato porque vai obrigar as classes filhas (Produto e Servico) a implementarem
    // uma lógica de preço, que serão diferentes porque dependerá do tipo (Se é uma Peça ou um Serviço)
    public abstract double calcularPrecoFinal();
}