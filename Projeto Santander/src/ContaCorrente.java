public class ContaCorrente extends Conta {


    private double saldoChequeEspecial;


    public ContaCorrente(Cliente cliente, double saldo, double saldoChequeEspecial) {
        super(cliente, saldo);
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    @Override
    public void depositar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        }
        else {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Transação concluida!");
            System.out.println("Saldo atual:R$ " + this.getSaldo());

        }
    }


    public void depositarCheque (double valor, String banco, String data) {

        if (valor <= 0) {
            System.out.println("Valor do cheque inválido!");
        }
        else {
            this.setSaldoChequeEspecial(getSaldoChequeEspecial() + valor);
            System.out.println("Transação concluida!");
            System.out.println("Saldo atual:R$ " + this.getSaldoChequeEspecial());

        }


    }

    @Override
    public void sacar (double valor) {

        if (valor > this.getSaldo()) {
            System.out.println("Valor não disponível para saque");
            System.out.println("Valor atual disponível:R$ " + this.getSaldo());
            System.out.println("Valor cheque especial disponível:R$ " + this.saldoChequeEspecial);
                if (valor <= (this.getSaldo() + this.saldoChequeEspecial)) {
                    System.out.println("------------Usando saldo do cheque especial---------------");
                    var flag = valor - this.getSaldo();
                    this.saldoChequeEspecial -= flag;
                    this.setSaldo(0);
                    System.out.println("Saldo atual da conta:R$ " + this.getSaldo());
                    System.out.println("Saldo do cheque especial:R$ " + this.saldoChequeEspecial);
                }

        }
        else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Transação concluida!");
            System.out.println("Saldo atual:R$ " + this.getSaldo());
            System.out.println("Saldo atual do cheque especial " + this.saldoChequeEspecial );
        }

    }



    public double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }
}
