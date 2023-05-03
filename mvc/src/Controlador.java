public class Controlador {
    private Modelo model;
    private Visualizador view;

    public Controlador(Modelo model, Visualizador view){
        this.model = model;
        this.view = view;
    }

    public void setProdutoEmpresa(String produto){
        model.setName(produto);
    }

    public String getProdutoEmpresa(){
        return model.getProduto();
    }

    public void setPrecoEmpresa(double preco){
        model.setPreco(preco);
    }

    public double getPrecoEmpresa(){
        return model.getPreco();
    }

    public void atualizarView(){
        view.imprimirDetalhesDoProduto(model.getProduto(), model.getPreco());
    }
}
