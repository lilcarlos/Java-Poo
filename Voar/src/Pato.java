public class Pato implements Voador {


    private double energia;


    public Pato() {
    }

    public Pato(double energia) {
        this.energia = energia;
    }


    @Override
    public void voar() {

        if (this.energia >= 5) {
            System.out.println("Estou voando como um pato!");
        } else {
            System.out.println("O pato está sem energia para voar :(");
        }
        this.energia -= 5;
    }


    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
}

