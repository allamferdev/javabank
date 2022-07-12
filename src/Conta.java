public class Conta {
    private double saldo = 0;
    public String nome;

    public Conta(String nome, double SaldoInicial){
        this.nome = nome;
        this.saldo = SaldoInicial;
    }
    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        if(quantia < saldo){
            saldo -= quantia;
        }
    }

    public void transferirPara(double quantia, Conta destino){
        this.saque(quantia);
        destino.deposito(quantia);
    }

    public void mostrarSaldo(){
        System.out.println("Titular: " + nome + ", Saldo R$: " + saldo);
    }
}
