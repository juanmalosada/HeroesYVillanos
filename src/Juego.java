import java.util.List;

public class Juego {
    
    private List<Enfrentable> enfretables;

    public Juego(List<Enfrentable> enfretables) {
        this.enfretables = enfretables;
    }

    public Juego() {
    }

    public List<Enfrentable> getEnfretables() {
        return enfretables;
    }

    public void setEnfretables(List<Enfrentable> enfretables) {
        this.enfretables = enfretables;
    }

    //Devuelve una lista de los personajes que ganarian del juego bajo el comparador dado al personaje pasado por parametro
    public List<Enfrentable> getQuienesVencen(Enfrentable enfrentable, Comparator comparador) {
        //  TODO implementar
        return null;
    }

    //Hace la batalla y devuelve al ganador
    public Enfrentable enfrentar(Enfrentable enfrentable1, Enfrentable enfrentable2, Comparator comparador) {
        return null;
    }

    public boolean addEnfrentable(Enfrentable enfrentable) {
        return this.enfretables.add(enfrentable);
    }

    public boolean removeEnfrentable(Enfrentable enfrentable) {
        return this.enfretables.remove(enfrentable);
    }

    //Devuelve la lista de personajes ordenada por ese comparador
    public List<Personaje> ordenarPersonajes(Comparator comparador) {
        // TODO implementar
        return null;
    }
    
}
