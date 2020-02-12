public class Exercicio2 {

    public static void main(String[] args) {

        JodadorDeFutebol jogador1 = new JodadorDeFutebol("Cr7",100,50, 1);
        JodadorDeFutebol jogador2 = new JodadorDeFutebol("Messi", 100, 50, 2);

        SessaoDeTreinamento treinamento = new SessaoDeTreinamento();

        treinamento.treinarA(jogador1);
        treinamento.treinarA(jogador1);
        treinamento.treinarA(jogador1);
        treinamento.treinarA(jogador1);


    }
}
