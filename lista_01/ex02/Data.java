package lista_01.ex02;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String mostrarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public int getDiasTerminoAno() {
        int diasNoMes;
        int diasRestantes = 0;

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[1] = 29; 
        }

        diasNoMes = diasPorMes[mes - 1]; 
        diasRestantes += diasNoMes - dia;

        for (int i = mes; i < 12; i++) {
            diasRestantes += diasPorMes[i];
        }

        return diasRestantes;
    }
}