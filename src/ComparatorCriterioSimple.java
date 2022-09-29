public class ComparatorCriterioSimple implements Comparator {

    private String atributo;
    
    @Override
    public int compare(Enfrentable enfrentable1, Enfrentable enfrentable2) {
        Float valor1 = enfrentable1.getValorAtributo(atributo);
        Float valor2 = enfrentable2.getValorAtributo(atributo);
        return valor1.compareTo(valor2);
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
