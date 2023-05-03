public class Controlador {
    private Modelo model;
    private Visualizador view;

    public Controlador(Modelo model, Visualizador view){
        this.model = model;
        this.view = view;
    }

    public void setUserProduto(String produto){
        model.setName(produto);
    }

    public String getUserProduto(){
        return model.getProduto();
    }

    public void setUserPreco(double preco){
        model.setPreco(preco);
    }

    public double getUserPreco(){
        return model.getPreco();
    }

    public void updateView(){
        view.imprimirDetalhesDoUsuario(model.getProduto(), model.getPreco());
    }
}
