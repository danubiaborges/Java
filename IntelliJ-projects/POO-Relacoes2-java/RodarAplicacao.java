class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

//        exemplo de downcast:
//        Vendedor vendedor_ = (Vendedor) new Funcionario();
//        evitar usar downcast

    }
}
