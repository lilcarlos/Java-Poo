public class Main {

    public static void main(String[] args) {

        Pato pato = new Pato(10);
        Aviao aviao = new Aviao();
        SuperHomem superman = new SuperHomem();
        TorreDeControle torre = new TorreDeControle();


        torre.adicionarVoador(pato);
        torre.adicionarVoador(pato);
        torre.adicionarVoador(pato);

        torre.voemTodos();

    }

}
