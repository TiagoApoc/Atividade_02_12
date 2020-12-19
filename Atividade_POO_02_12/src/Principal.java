import br.com.atividade.Carrinho;
import br.com.atividade.Pedido;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Pedido pedido1 = new Pedido("Ryzen 5 3600", "Processador", 1600.78f);
        Pedido pedido2 = new Pedido("XPG 16GB", "Memória RAM", 569.56f);
        Pedido pedido3 = new Pedido("RTX 2080", "Placa de Vídeo", 3800);
        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionar(pedido1);
        carrinho1.adicionar(pedido2);
        carrinho1.adicionar(pedido3);
        carrinho1.adicionar(pedido2);

        carrinho1.mostrarProdutos();
    }
}
