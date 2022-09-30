import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Enfrentable> enfrentables = new ArrayList<Enfrentable>();
        Juego juego = new Juego(enfrentables);
        
        AtributoSimple fuerza1 = new AtributoSimple(10);
        AtributoSimple fuerza2 = new AtributoSimple(20);

        AtributoSimple inteligencia1 = new AtributoSimple(10);
        AtributoSimple inteligencia2 = new AtributoSimple(20);

        AtributoSimple velocidad1 = new AtributoSimple(10);
        AtributoSimple velocidad2 = new AtributoSimple(20);

        AtributoSimple resistencia1 = new AtributoSimple(10);
        AtributoSimple resistencia2 = new AtributoSimple(20);

        AtributoSimple destreza1 = new AtributoSimple(10);
        AtributoSimple destreza2 = new AtributoSimple(20);

        AtributoSimple poder1 = new AtributoSimple(10);
        AtributoSimple poder2 = new AtributoSimple(20);

        AtributoSimple suerte1 = new AtributoSimple(10);
        AtributoSimple suerte2 = new AtributoSimple(20);

        AtributoSimple fuerza3 = new AtributoSimple(50);

        Map<String, Atributo> atributosGoku = Map.of(
            "fuerza", fuerza1,
            "inteligencia", inteligencia1,
            "velocidad", velocidad1,
            "resistencia", resistencia1,
            "destreza", destreza1,
            "poder", poder1,
            "suerte", suerte1
        );

        Map<String, Atributo> atributosVegeta = Map.of(
            "fuerza", fuerza2,
            "inteligencia", inteligencia2,
            "velocidad", velocidad2,
            "resistencia", resistencia2,
            "destreza", destreza2,
            "poder", poder2,
            "suerte", suerte2
        );

        Map<String, Atributo> atributosPiccolo = Map.of(
            "fuerza", fuerza3
        );

        Personaje piccolo = new Personaje("Piccolo", "Piccolo", atributosPiccolo);

        Personaje goku = new Personaje("Goku", "Son Goku", atributosGoku);
        Personaje vegeta = new Personaje("Vegeta", "Vegeta", atributosVegeta);
        
        juego.addEnfrentable(goku);
        juego.addEnfrentable(vegeta);

        //System.out.println(juego.enfrentar(goku, vegeta, new ComparatorCriterioSimple("fuerza")).get().getNombreFantasia());

        ComparatorCriterioSimple comparadorFuerza = new ComparatorCriterioSimple("fuerza");
    
        List<Personaje> personajesOrdenados = juego.ordenarPersonajes(comparadorFuerza);

        //System.out.println(personajesOrdenados.toString());

        List<Personaje> personajesOrdenadosReversed = juego.ordenarPersonajes(comparadorFuerza.reversed());

        //System.out.println(personajesOrdenadosReversed.toString());

        List<Personaje> personajesOrdenadosPorNombre = juego.ordenarPersonajes(new ComparatorNombre());

        //System.out.println(personajesOrdenadosPorNombre.toString());

        List<Enfrentable> personajesQueVencenAGoku = juego.getQuienesVencen(goku, comparadorFuerza);

        /*for (Enfrentable enfrentable : personajesQueVencenAGoku) {
            System.out.println(enfrentable.getNombreFantasia());
        }*/

        List<Enfrentable> gokuVegetta = new ArrayList<Enfrentable>();

        gokuVegetta.add(goku);
        gokuVegetta.add(vegeta);
        Liga liga = new Liga("Liga Z", "liga zeta", gokuVegetta);

        juego.addEnfrentable(liga);

        System.out.println(juego.enfrentar(piccolo, liga, comparadorFuerza).get().getNombreFantasia());
        //System.out.println(liga.getValorAtributo("fuerza"));


    }
}