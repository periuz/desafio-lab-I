package app;

public class Vestuario extends Loja{
    private boolean produtosImportados;

    public boolean isProdutosImportados() {
        return produtosImportados;
    }
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }

    @Override
    public String toString() {
        return super.toString() + " | Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }


}
