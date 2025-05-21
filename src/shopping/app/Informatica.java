package app;

public class Informatica extends Loja{
    private double seguroEletronicos;

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }

    @Override
    public String toString() {
        return super.toString() + " | Seguro Eletrônicos: " + seguroEletronicos;
    }
}
