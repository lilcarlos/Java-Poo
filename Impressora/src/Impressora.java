import java.util.ArrayList;
import java.util.List;

public class Impressora {

    List<Imprimivel> lista = new ArrayList<>();

    public Impressora() {
    }


    public void imprimirTudo () {

        for (int x = 0; x < lista.size(); x++) {

            lista.get(x).imprimir();
        }

    }

    public void adicionarImprimivel(Imprimivel imprimivel) {
        lista.add(imprimivel);

    }

    public void mostrar() {
        System.out.println(lista);
    }


    public List<Imprimivel> getLista() {
        return lista;
    }

    public void setLista(List<Imprimivel> lista) {
        this.lista = lista;
    }
}
