package app;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {return nome;}

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "etapa_01.Loja: " + nome +
                " | Funcionários: " + quantidadeFuncionarios +
                " | Salário Base: " + (salarioBaseFuncionario == -1 ? "Não definido" : "R$" + salarioBaseFuncionario) +
                " | Endereço: " + endereco +
                " | Data de Fundação: " + dataFundacao;
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }
        else {
            return 'G';
        }
    }

}
