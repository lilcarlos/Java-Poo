package Ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);



        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);



        for (Integer index : lista) {
            System.out.println(index);
        }

        System.out.println("------------------------------------");

        for (Integer index : conjunto) {

            System.out.println(index);
        }












    }
}
