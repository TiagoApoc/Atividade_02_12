package br.com.atividade;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pedido> pedido = new ArrayList<Pedido>();
    private float valorTotal;
    

    public void adicionar (Pedido pedido){
        pedido.add(pedido);
        valorTotal += pedido.getPreco();
        System.out.format("%s  (Categoria: %s) - R$%.2f\n", pedido.getNome(), pedido.getCategoria(), pedido.getPreco());
    }

    public void mostrarProdutos() {        
        System.out.format("Valor total dos Produtos adicionados ao carrinho: R$ %.2f", valorTotal);

    }    
 //Método Get**********************************************
        public double getTotal() {
        return valorTotal;
    }
}
