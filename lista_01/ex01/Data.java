package lista_01.ex01;

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

    public static void main(String[] args) {
        Data data = new Data(02, 23, 2024);
        System.out.println("Data: " + data.mostrarData());
    }
}
