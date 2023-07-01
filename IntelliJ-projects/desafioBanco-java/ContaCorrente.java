public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void impimirExtrato() {
        System.out.println("--- Extrato da Conta Corrente ---");
        super.imprimirAtributos();
    }
}
