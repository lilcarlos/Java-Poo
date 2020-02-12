public class Main {

    public static void main(String[] args) {


        Cliente joao = new Cliente(999, "Joao Guarnier", 1234,501);
        ContaPoupanca contapoupjoao = new ContaPoupanca(joao, 1000);


        contapoupjoao.depositar(100);
        contapoupjoao.sacarJuros(10);






    }

}
