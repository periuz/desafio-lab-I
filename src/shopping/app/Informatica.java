package app;

public class Informatica extends Loja{
    private double seguroEletronicos;

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    }
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
    }

    @Override
    public String toString() {
        return super.toString() + " | Seguro Eletrônicos: " + seguroEletronicos;
    }
}
