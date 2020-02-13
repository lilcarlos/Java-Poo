public class Aviao implements Voador {


    private float horasDeVoo;

    public Aviao() {
    }

    public Aviao(float horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }


    @Override
    public void voar() {
        this.horasDeVoo += 13;
        System.out.println("Estou voando como um avião!");
    }


    public float getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(float horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
}
