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

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    }
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
    }

    @Override
    public String toString() {
        return super.toString() + " | Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }


}
