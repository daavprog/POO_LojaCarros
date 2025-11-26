package aplicacao;

import entidades.Cliente;
import entidades.Produto;
import entidades.Servico;
import entidades.Venda;

public class Main {
    public static void main(String[] args) {
        // Crio o cliente
        Cliente cliente1 = new Cliente("Samara Saouza", "123.456.789-00");

        // Inicio a venda (Pode ter só Produto, só Serviço ou os dois misturados)
        Venda venda = new Venda(cliente1);

        // Aqui eu estou Instanciando os produtos e os serviços
        Produto p1 = new Produto("Pneu Aro 18", 400.00, "Michelin");
        Produto p2 = new Produto("Perfume para o Carro", 15.00); // Faço o testo do construtor simplificado, onde não possui marca
        Servico s1 = new Servico("Instalação de Som", 100.00, 2); // Informo a quantidade de horas usadas no serviço. Nesse caso, 2 horas

        venda.adicionarItem(p1);
        venda.adicionarItem(p2);
        venda.adicionarItem(s1);

        venda.finalizarVenda();
    }
}