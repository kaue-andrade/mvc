public class Main {
    public static void main(String[] args) {
        Modelo model = recuperarUsuarioDoBancoDeDados();

        Visualizador view = new Visualizador();

        Controlador controller = new Controlador(model, view);

        controller.updateView();

        // Atualizando o modelo

        controller.setUserProduto("Alexa");
        controller.setUserPreco(250.00);

        controller.updateView();
    }

    private static Modelo recuperarUsuarioDoBancoDeDados(){
        Modelo user = new Modelo();
        user.setName("Amazon Fire TV Stick");
        user.setPreco(236.55);
        return user;
    }
}
