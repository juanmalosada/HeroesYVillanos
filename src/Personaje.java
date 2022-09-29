import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Personaje extends Enfrentable {
    
    private Map<String, Atributo> atributos;

    public Personaje(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public Personaje(String nombre, String nombreFantasia, Map<String, Atributo> atributos) {
        super(nombre, nombreFantasia);
        this.atributos = atributos;
    }

    public Map<String, Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(Map<String, Atributo> atributos) {
        this.atributos = atributos;
    }

    public void addAtributo(String key, Atributo atributo) {
        this.atributos.put(key, atributo);
    }

    public void removeAtributo(String key) {
        this.atributos.remove(key);
    }

    @Override
    public float getValorAtributo(String atributo) {
        return this.atributos.get(atributo).getValor(this);
    }

    @Override
    public Optional<Enfrentable> enfrentar(Enfrentable enfrentable, Comparator comparador) {
        if (comparador.compare(this, enfrentable) > 0) {
            return Optional.of(this);
        } else if (comparador.compare(this, enfrentable) < 0) {
            return Optional.of(enfrentable);
        } else {
            return Optional.empty();
        }
    }

    @Override
    protected List<Personaje> getPersonajes() {
        List<Personaje> personajes = new ArrayList<Personaje>();
        personajes.add(this);
        return personajes;
    }

}
