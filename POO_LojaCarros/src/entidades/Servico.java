package entidades;

public class Servico extends ItemVenda {
    private int horasEstimadas;

    public Servico(String descricao, double preco, int horasEstimadas) {
        super(descricao, preco);
        this.horasEstimadas = horasEstimadas;
    }

    // Polimorfismo, onde o Serviço cobra o valor base VEZES as horas precisas para a realização do seviço fictício
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * horasEstimadas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Serviço: " + getDescricao() + " | Duração: " + horasEstimadas + "h | Valor Total: R$ " + calcularPrecoFinal());
    }
}