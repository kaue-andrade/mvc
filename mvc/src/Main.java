public class Main {
    public static void main(String[] args) {
        Modelo model = recuperarProdutoDoBancoDeDados();

        Visualizador view = new Visualizador();

        Controlador controller = new Controlador(model, view);

        controller.atualizarView();

        // Atualizando o modelo

        controller.setProdutoDaEmpresa("Alexa");
        controller.setPrecoDoProduto(250.00);

        controller.atualizarView();
    }

    private static Modelo recuperarProdutoDoBancoDeDados(){
        Modelo produto = new Modelo();
        produto.setProduto("Amazon Fire TV Stick");
        produto.setPreco(236.55);
        return produto;
    }
}
