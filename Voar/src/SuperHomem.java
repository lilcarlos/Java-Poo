public class SuperHomem implements Voador {

    private float experiencia;


    public SuperHomem(){
    }

    public SuperHomem(float experiencia) {
        this.experiencia = experiencia;
    }


    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um campeão!");
    }
}
