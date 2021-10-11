public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Produto produto = new Produto("Sal", 1.0f, 10);
        System.out.println("Nome do produto: " + produto.getNome() + " custa R$" + produto.getPreco());

        System.out.println();
        produto.comprarProduto();
        System.out.println("Estoque de " + produto.getNome() + ": " + produto.getQuantidade());

        System.out.println();
        produto.comprarProduto();
        System.out.println("Estoque de " + produto.getNome() + ": " + produto.getQuantidade());

        System.out.println();
        for (int i = 0; i < 9; i++) {
            produto.comprarProduto();
        }
        System.out.println("Estoque de " + produto.getNome() + ": " + produto.getQuantidade());
    }
}
