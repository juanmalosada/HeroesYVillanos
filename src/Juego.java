import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Juego {
    
    private List<Enfrentable> enfrentables;

    public Juego(List<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    public Juego() {
    }

    public List<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public void setEnfretables(List<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    /*
    * Devuelve una lista que contiene a los enfrentables de la lista this.enfrentables que le ganarian
    * al enfrentable pasado por parametro.
     */
    public List<Enfrentable> getQuienesVencen(Enfrentable enfrentable, Comparator comparador) {
        List<Enfrentable> ganadores = new ArrayList<Enfrentable>();
        for (Enfrentable enfrentableAux : this.enfrentables) {
            if (enfrentableAux.enfrentar(enfrentable, comparador).isPresent()) {
                if(enfrentableAux.enfrentar(enfrentable, comparador).get().equals(enfrentableAux)){
                    ganadores.add(enfrentableAux);
                }
            }
        }
        return ganadores;
    }

    /*
    * Cambie el tipo de retorno a optional porque en caso de empate en todas las carecteristicas
    * no se podria devolver un enfrentable, por lo tanto devolveria un optional vacio.
    */
    public Optional<Enfrentable> enfrentar(Enfrentable enfrentable1, Enfrentable enfrentable2, Comparator comparador) {
        if (comparador.compare(enfrentable1, enfrentable2) > 0) {
            return Optional.of(enfrentable1);
        } else if (comparador.compare(enfrentable1, enfrentable2) < 0) {
            return Optional.of(enfrentable2);
        } else {
            return Optional.empty();
        }
    }

    public boolean addEnfrentable(Enfrentable enfrentable) {
        return this.enfrentables.add(enfrentable);
    }

    public boolean removeEnfrentable(Enfrentable enfrentable) {
        return this.enfrentables.remove(enfrentable);
    }

    //Devuelve la lista de personajes ordenada por ese comparador
    public List<Personaje> ordenarPersonajes(Comparator comparador) {
        List <Personaje> personajes = new ArrayList<>();

        for (Enfrentable enfrentable : this.enfrentables) {
            personajes.addAll(enfrentable.getPersonajes());
        }

        personajes.sort(comparador);

        return personajes;
    }

}
