package entidades;

public class Produto extends ItemVenda {
    private String marca;

    // Aqui ocorrem as Sobrecargas com Construtor completo e outro simplificado, sem a marca (Caso o "Cliente não informe")
    public Produto(String descricao, double preco, String marca) {
        super(descricao, preco);
        this.marca = marca;
    }

    public Produto(String descricao, double preco) {
        super(descricao, preco);
        this.marca = "Generica";
    }

    // Polimorfismo, onde o Produto tem 5% de acréscimo no valor.
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Produto: " + getDescricao() + " | Marca: " + marca + " | Valor Final: R$ " + calcularPrecoFinal());
    }
}