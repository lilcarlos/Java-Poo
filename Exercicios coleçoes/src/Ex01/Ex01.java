package Ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {

        Map<Integer, String>  dicionario = new HashMap<>();

        dicionario.put(0, "Ovo");
        dicionario.put(1, "Água");
        dicionario.put(2, "Escopeta");
        dicionario.put(3, "Cavalo");
        dicionario.put(4, "Dentista");
        dicionario.put(5, "fogo");




        Map<String, List> dicionario2 = new HashMap<>();
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<String> lista4 = new ArrayList<>();


        lista1.add("Juan,Fissura,Maromba");
        lista2.add("Night Watch,Bruce Wayne,Tampinha");
        lista3.add("Wonder Woman,Mary,Marilene");
        lista4.add("Lukinha,Jorge,George");


        dicionario2.put("João", lista1);
        dicionario2.put("Miguel", lista2);
        dicionario2.put("Maria", lista3);
        dicionario2.put("Lucas", lista4);





        for (Integer chave : dicionario.keySet()) {
            String valor = dicionario.get(chave);
            System.out.println(chave + " " + valor);
        }


        for (String chave : dicionario2.keySet()) {
            List valor = dicionario2.get(chave);
            System.out.println(chave + " " + valor);

        }

        System.out.println(dicionario2.get("João"));


    }
}
