public class Conta {

    private int numeroConta;
    private double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void depositar (double valor) {

        saldo = valor;
        System.out.println("Voce depositou: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }


    public void saque (double valor) {

        if (valor > saldo) {
            System.out.println("Valor a ser sacado: " + valor + " | Saldo disponível: " + saldo + " | Você nao tem saldo!");
        } else {
            saldo = saldo - valor;
            System.out.println("Voce sacou: " + valor);
            System.out.println("Saldo atual: " + saldo);
        }

    }


}
