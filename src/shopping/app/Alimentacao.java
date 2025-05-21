package app;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Data getDataAlvara() {
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }

    @Override
    public String toString() {
        return super.toString() + " | Data do Alvará: " + dataAlvara;
    }
}
