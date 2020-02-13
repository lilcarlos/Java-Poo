import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> lista = new ArrayList<>();


    public TorreDeControle(){
    }

    public TorreDeControle(List<Voador> lista) {
        this.lista = lista;
    }


    public void voemTodos() {
        for (int x = 0;x < lista.size(); x++) {
            lista.get(x).voar();
        }
    }


    public void adicionarVoador(Voador voador) {
        lista.add(voador);
    }


}
