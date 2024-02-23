package lista_01.ex05;

public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldoAtual) {
        this.saldo = saldoAtual;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean registrarDeposito(double valor) {
        if (valor <= 0) {
            return false;
        }

        saldo += valor;

        return true;
    }

    public boolean registrarSaque(double valor) {
        double tarifa = valor * 0.005;
        double totalDebito = valor + tarifa;
    
        if (valor <= 0 || totalDebito > saldo) {
            System.out.println("Saque não autorizado: valor inválido ou saldo insuficiente");
            return false;
        } 
    
        saldo -= totalDebito;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        return true;
    }   
}

