package app;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos) {
        inicializaLoja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos) {
        inicializaLoja(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, maxProdutos); // valor padrão
    }

    private void inicializaLoja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado
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

    @Override
    public String toString() {
        return "Loja: " + nome +
                " | Funcionários: " + quantidadeFuncionarios +
                " | Salário Base: " + (salarioBaseFuncionario == -1 ? "Não definido" : "R$" + String.format("%.2f", salarioBaseFuncionario)) +
                " | Endereço: " + endereco +
                " | Data de Fundação: " + dataFundacao +
                " | Capacidade do Estoque: " + estoqueProdutos.length;
    }
}
