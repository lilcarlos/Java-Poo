public class JodadorDeFutebol {

    private String nome;
    private float energia;
    private float alegria;
    private int gols;
    private float experiencia;

    public JodadorDeFutebol(String nome, float energia, float alegria, float experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.experiencia = experiencia;
    }

    public void fazerGol () {
        if (this.energia >= 5) {

            this.energia -= 5;
            this.alegria += 10;
            this.gols++;
            System.out.println("GOOOLLLLL!!!!");
        }
        else {
            System.out.println("Sem energia!");
        }

    }

    public void correr () {
        if (this.energia >= 10) {
            this.energia -= 10;
            System.out.println("Cansei...");
        }
        else {
            System.out.println("Sem energia!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getAlegria() {
        return alegria;
    }

    public void setAlegria(float alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
}
