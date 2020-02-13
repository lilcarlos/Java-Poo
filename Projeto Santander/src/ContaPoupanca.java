public class ContaPoupanca extends Conta {


    private double saldoJuros;


    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);

    }



    public void depositar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        }
        else {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Transação concluida!");
            var flag = valor * 0.10;
            this.saldoJuros += flag;
            System.out.println("Sua conta rendeu:R$ " + flag);
            System.out.println("Saldo atual:R$ " + this.getSaldo());
            System.out.println("Juros para sacar:R$ " + this.saldoJuros);

        }
    }

    @Override
    public void sacar (double valor) {

        if (valor > this.getSaldo()) {
            System.out.println("Valor não disponível para saque");
            System.out.println("Valor atual disponível:R$ " + this.getSaldo());
            System.out.println("Saldo atual de juros para sacar:R$ " + this.saldoJuros);
        }
        else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Transação concluida!");
            System.out.println("Saldo atual:R$ " + this.getSaldo());
            System.out.println("Saldo atual de juros para sacar:R$ " + this.saldoJuros);
        }

    }


    public void sacarJuros (double valor) {


        if (valor > this.saldoJuros || valor <= 0) {
            System.out.println("Valor não disponível para saque");
            System.out.println("Valor de juros atual disponível:R$ " + this.saldoJuros);
        }
        else {
            this.saldoJuros -= valor;
            System.out.println("Transação concluida!");
            System.out.println("Saldo de juros atual:R$ " + this.saldoJuros);
        }

    }


}
