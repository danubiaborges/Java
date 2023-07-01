public class Main {

    public static void main(String[] args) {

        Cliente danubia = new Cliente();
        danubia.setNome("Danubia");

        Conta cc = new ContaCorrente(danubia);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(danubia);

        cc.transferir(10, cp);


        cc.impimirExtrato();
        cp.impimirExtrato();

    }
}