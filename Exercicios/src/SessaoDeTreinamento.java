public class SessaoDeTreinamento {

    private float experiencia;

    public SessaoDeTreinamento() {
    }


    public void treinarA (JodadorDeFutebol jogador) {

        if (jogador.getEnergia() >= 25) {

            System.out.println(jogador.getNome());
            this.experiencia = jogador.getExperiencia();
            System.out.println("Experiência inicial: " + jogador.getExperiencia());
            jogador.correr();
            jogador.fazerGol();
            jogador.correr();
            this.experiencia ++;
            jogador.setExperiencia(this.experiencia);
            System.out.println("Experiência final: " + jogador.getExperiencia());
            System.out.println("Energia: " + jogador.getEnergia() + " Alegria: " + jogador.getAlegria());
        }
        else {
            System.out.println("Jogador cansado!!");
        }
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
}
