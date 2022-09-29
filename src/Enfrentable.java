import java.util.List;
import java.util.Optional;

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

    /*
    * Cambie el tipo de retorno a optional porque en caso de empate en todas las carecteristicas
    * no se podria devolver un enfrentable, por lo tanto devolveria un optional vacio.
    */
    public abstract Optional<Enfrentable> enfrentar(Enfrentable enfrentable, Comparator comparador);

    protected abstract List<Personaje> getPersonajes();
    
}
