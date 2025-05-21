package app;

public class Bijuteria extends Loja{
    private double metaVendas;

    public double getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }


    @Override
    public String toString() {
        return super.toString() + " | Meta de Vendas: " + metaVendas;
    }
}
