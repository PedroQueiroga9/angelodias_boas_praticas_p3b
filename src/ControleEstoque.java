import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoqueInicial = scanner.nextInt();

        Produto produto = new Produto(nome, preco, estoqueInicial);


        System.out.println("\n--- Informações do Produto ---");
        produto.exibirInformacoesAntes();


        System.out.print("\nDigite a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();


        produto.vender(quantidadeVendida);


        produto.exibirInformacoesDepois();

        scanner.close();
    }
}
