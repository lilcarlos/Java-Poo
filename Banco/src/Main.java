public class Main {

    public static void main(String[] args) {

       Cliente cliente1 = new Cliente("Joao", 123456);

       Conta conta1 = new Conta(cliente1);

       cliente1.conta = conta1;


       cliente1.imprimir();

       conta1.depositar(100);

       conta1.saque(50);

       conta1.saque(51);

       conta1.saque(50);

    }
}
