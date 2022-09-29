import java.util.List;

public class ComparatorCompuesto implements Comparator {

    private List<Comparator> comparators;

    public ComparatorCompuesto(List<Comparator> comparators) {
        this.comparators = comparators;
    }

    public List<Comparator> getComparators() {
        return comparators;
    }

    public void setComparators(List<Comparator> comparators) {
        this.comparators = comparators;
    }

    public boolean addComparator(Comparator comparator) {
        return this.comparators.add(comparator);
    }

    public boolean addComparator(Comparator comparator, int index) {
        this.comparators.add(index, comparator);
        return true;
    }
    @Override
    public int compare(Enfrentable enfrentable1, Enfrentable enfrentable2) {
        for (Comparator comparator : comparators) {
            int res = comparator.compare(enfrentable1, enfrentable2);
            if(res != 0) {
                return res;
            }
        }
        return 0;
    }
    
}
