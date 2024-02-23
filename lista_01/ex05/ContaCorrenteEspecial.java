package lista_01.ex05;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(double saldoAtual) {
        super(saldoAtual);
    }

    @Override
    public boolean registrarSaque(double valor) {
        double tarifa = valor * 0.001; 
        double totalDebito = valor + tarifa;
    
        if (valor <= 0 || totalDebito > getSaldo()) {
            System.out.println("Saque não autorizado: valor inválido ou saldo insuficiente");
            return false;
        } 
    
        setSaldo(getSaldo() - totalDebito);
        System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        return true;
    }

}
