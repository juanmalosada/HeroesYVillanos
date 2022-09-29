import java.util.List;

public abstract class Enfrentable {
    
    private String nombre;

    private String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    //devuelve el valor del atributo pasado por parametro
    public abstract float getValorAtributo(String atributo);

    //Hace la batalla y devuelve al ganador
    public abstract Enfrentable enfrentar(Enfrentable enfrentable, Comparator comparador);

    public abstract List<Personaje> ordenar (Comparator comparador);

    protected abstract List<Personaje> getPersonajes();
    
}
