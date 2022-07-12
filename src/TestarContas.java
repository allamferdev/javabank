public class TestarContas {
    public static void main(String[] args) {
        Conta cliente1 = new Conta("Douglas", 10000);
        cliente1.deposito(500);

        Conta cliente2 = new Conta("Ricardo", 10000);
        cliente2.deposito(1000);
        cliente2.saque(20);
        cliente2.transferirPara(75, cliente1);

        System.out.println("======= Saldos =======");
        cliente1.mostrarSaldo();
        cliente2.mostrarSaldo();
    }
}
