public class ComparatorCriterioSimple implements Comparator {

    private String atributo;
    
    @Override
    public int compare(Enfrentable enfrentable1, Enfrentable enfrentable2) {
        // TODO implementar
        return 0;
    }

    public String getAtributo() {
        return this.atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public ComparatorCriterioSimple(String atributo) {
        this.atributo = atributo;
    }
    
}
