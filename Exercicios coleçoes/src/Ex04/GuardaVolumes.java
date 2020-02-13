package Ex04;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes extends Peca {

    Map<Integer, List<Peca>> mapa = new HashMap<>();
    private int contador;

    public GuardaVolumes(String marca,String modelo) {
        this.mapa = mapa;
        this.contador = contador;
        setMarca(marca);
        setModelo(modelo);
    }

    public void guardarPecas(List<Peca> listaDePeca) {
        this.contador += 1;
        mapa.put(contador, listaDePeca);
        System.out.println("Sua chave de identificação é: " +  this.contador);

    }

    public void mostrarPecas() {
        System.out.println("Itens no Guarda Volumes: " + mapa);
    }

    public void mostrarPecas(Integer numero){
        System.out.println(mapa.get(numero));
    }


    public void devolverPecas(Integer numero){
        mapa.remove(numero);

    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    void retirada() {

    }
}
