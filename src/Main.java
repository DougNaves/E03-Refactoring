public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente ("João", "111.111.111-11", "31 1111-1111");
        Banco banco = new Banco (111, "Gil");
        Conta minhaConta = new Conta(cliente, banco, 222222,0.00);

        minhaConta.realizarOperacao('d', 450);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);

        System.out.println(minhaConta);
    }
}
