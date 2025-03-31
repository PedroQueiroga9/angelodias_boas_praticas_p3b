public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            estoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades");
        }
    }

    public void exibirInformacoesAntes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + estoque + " unidades");
    }

    public void exibirInformacoesDepois() {
        System.out.println("Estoque atualizado: " + estoque + " unidades");
    }
}
