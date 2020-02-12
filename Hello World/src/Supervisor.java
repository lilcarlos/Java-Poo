public class Supervisor extends Funcionario {

    public String turnoResp;

    @Override
    public double calcularSalario (float horas,float valor) {

        return horas * (valor + 200);
    }
}
