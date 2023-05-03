import java.util.Scanner;

public class Visualizador {
    public void imprimirDetalhesDoUsuario(String produto, double preco){
        System.out.println("Nome: " + produto);
        System.out.println("Preço: " + preco);
    }

    public String getProduto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o produto: ");
        return scanner.nextLine();
    }

    public int getPreco(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        return scanner.nextInt();
    }
}
