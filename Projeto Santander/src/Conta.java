public class Conta {

    private Cliente cliente;
    private double saldo;


    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double valor) {

        if (valor > this.saldo) {
            System.out.println("Valor indisponivel");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += valor;

        }
    }


    public void consultarSaldo() {
        System.out.println("Saldo atual:R$ " + this.saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}



