package Ex03;

import java.util.Set;

public class Prova {

    private int contador;


    public void somaTotal(Set<Integer> conjuntoDeInteiros) {

        for (Integer valor : conjuntoDeInteiros) {
            this.contador += valor;
        }
        System.out.println(getContador());

    }


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
