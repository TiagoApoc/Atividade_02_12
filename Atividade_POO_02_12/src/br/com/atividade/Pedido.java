package br.com.atividade;

public class Pedido {
    private String nome;
    private String categoria;
    private float preco;

    public Pedido (String nome, String categoria, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return float return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }


	public void add(Pedido pedido) {
	}

}