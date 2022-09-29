public class AtributoSimple implements Atributo {

    private float valor;

    public AtributoSimple(float valor) {
        this.valor = valor;
    }

    @Override
    public float getValor(Enfrentable enfrentable) {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}