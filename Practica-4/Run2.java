import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Run2 {
    public static void main(String[] args) {
        
        //Arraylist Implementacion con listas
        List<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Fresa");

        //System.out.println("Listas de frutas"+listaFrutas);

        //System.out.println("segunda fruta: "+listaFrutas.get(1));

        //foreach
        /*for (String fruta : listaFrutas){
            System.out.println("-" +fruta);
        }*/

        //-----------------------
        //HashSet

        Set<String> listaColores = new HashSet<>();

        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Azul");
        listaColores.add("Blanco");

        //System.out.println("Listas de Colores"+listaColores);
        //System.out.println("Contiene verde? "+listaColores.contains("Verde"));

        /*for (String c : listaColores ){
            System.out.println("- "+c);

        }    
            */


            //Map

            Map<String, Integer> listaEdades = new HashMap<>();

            listaEdades.put("Gabriel", 24);
            listaEdades.put("Pedro", 30);
            listaEdades.put("Vania", 21);

            //System.out.println("Lista del equipo y la edad: "+listaEdades);

            //System.out.println("Se encuentra David?"+listaEdades.containsKey("David"));

            //listaEdades.put("Gabriel", 29);

            for (Map.Entry<String, Integer> personas : listaEdades.entrySet()){
                System.out.println("-"+personas.getKey()+": "+personas.getValue()+" años ");
            }
        

    }
}
