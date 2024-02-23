package lista_01.ex02;

public class Main {
    public static void main(String[] args) {
        
        // Criando uma instância de Data com a data atual
        Data dataAtual = new Data(2, 23, 2024);

        // Exibindo a data atual
        System.out.println("Data atual: " + dataAtual.mostrarData());

        // Calculando e exibindo os dias restantes até o final do ano
        int diasRestantes = dataAtual.getDiasTerminoAno();
        System.out.println("Dias restantes até o final do ano: " + diasRestantes);
    }
}
