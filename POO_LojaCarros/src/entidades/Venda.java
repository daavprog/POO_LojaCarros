package entidades;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Cliente cliente;
    // Essa Lista vai aceitar tanto o Produto quanto o Serviço
    private List<ItemVenda> itens;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>(); // A lista vai começar vazia
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
    }

    public void finalizarVenda() {
        System.out.println("CUPOM FISCAL DA LOJA DE CARROS");
        System.out.println("Cliente: " + cliente.getNome());

        double total = 0;

        // Varre a lista calculando o total
        for (ItemVenda item : itens) {
            item.mostrarDetalhes(); // Aqui cada item vai saber como se mostrar
            total += item.calcularPrecoFinal();
        }

        System.out.println("---------------------------------------");
        System.out.println("TOTAL A PAGAR: R$ " + String.format("%.2f", total));
        System.out.println("=======================================");
    }
}
