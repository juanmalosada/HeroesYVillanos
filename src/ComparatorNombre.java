public class ComparatorNombre implements Comparator {

    @Override
    public int compare(Enfrentable enfrentable1, Enfrentable enfrentable2) {
        return enfrentable1.getNombre().compareTo(enfrentable2.getNombre());
    }

}