import java.util.List;

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
        // TODO implementar
        return 0;
    }

    @Override
    public Enfrentable enfrentar(Enfrentable enfrentable, Comparator comparador) {
        // TODO implementar
        return null;
    }

    @Override
    public List<Personaje> ordenar(Comparator comparador) {
        // TODO implementar
        return null;
    }

    @Override
    protected List<Personaje> getPersonajes() {
        // TODO implementar
        return null;
    }
    
}
