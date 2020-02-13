package Ex03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Prova prova = new Prova();

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(1);

        prova.somaTotal(conjunto);



    }
}
