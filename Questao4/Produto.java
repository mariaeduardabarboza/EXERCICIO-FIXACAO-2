public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void comprarProduto() {
        if (this.quantidade > 0) {
            this.quantidade = this.quantidade - 1;
            System.out.println("O produto " + this.nome + " foi comprado.");
        } else {
            System.out.println("O produto " + this.nome + " nao esta mais em estoque.");
        }
    }

}
