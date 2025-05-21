package app;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (verificaAnoBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Erro: Mês inválido! A data será configurada para 1/1/2000.");
            return;
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("Erro: Dia inválido! A data será configurada para 1/1/2000.");
            return;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean verificaAnoBissexto(int ano) {

        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

}
