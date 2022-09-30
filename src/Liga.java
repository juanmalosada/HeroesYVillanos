import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Liga extends Enfrentable {

    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        this.integrantes = integrantes;
    }

    public List<Enfrentable> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Enfrentable> integrantes) {
        this.integrantes = integrantes;
    }

    public boolean addIntegrante(Enfrentable enfrentable) {
        return this.integrantes.add(enfrentable);
    }

    @Override
    public float getValorAtributo(String atributo) {
        List <Personaje> personajes = this.getPersonajes();
        float valor = 0;
        for (Personaje personaje : personajes) {
            valor += personaje.getValorAtributo(atributo);
        }
        return valor / personajes.size();
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

    public List<Personaje> ordenar(Comparator comparador) {    
        return integrantes.stream().flatMap(enfrentable -> enfrentable.getPersonajes().stream()).sorted(comparador).collect(Collectors.toList());
    }

    @Override
    protected List<Personaje> getPersonajes() {
        List<Personaje> personajes = new ArrayList<Personaje>();
        for (Enfrentable enfrentable : this.integrantes) {
            personajes.addAll(enfrentable.getPersonajes());
        }

        return personajes;
    }
    
}
