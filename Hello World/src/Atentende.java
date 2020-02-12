public class Atentende extends Funcionario {

    private String setor;

    @Override
    public double calcularSalario (float horas, float valor) {

        return horas * (valor + 100);
    }

    public String getSetor() {
        return this.setor;
    }


    public void setSetor(String novoSetor) {
        this.setor = novoSetor;
    }



}

