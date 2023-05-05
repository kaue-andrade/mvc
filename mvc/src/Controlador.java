public class Controlador {
    private Modelo model;
    private Visualizador view;

    public Controlador(Modelo model, Visualizador view){
        this.model = model;
        this.view = view;
    }

    public void setProdutoDaEmpresa(String produto){
        model.setProduto(produto);
    }

    public String getProdutoDaEmpresa(){
        return model.getProduto();
    }

    public void setPrecoDoProduto(double preco){
        model.setPreco(preco);
    }

    public double getPrecoDoProduto(){
        return model.getPreco();
    }

    public void atualizarView(){
        view.imprimirDetalhesDoProduto(model.getProduto(), model.getPreco());
    }
}
