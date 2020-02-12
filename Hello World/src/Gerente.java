public class Gerente extends Atentende{

    public String lojaResp;

    @Override
    public double calcularSalario (float horas, float valor) {

        return horas * (valor + 300);
    }

}
