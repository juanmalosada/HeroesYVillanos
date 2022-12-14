public class AtributoOperacion implements Atributo {

    private String key1;

    private String key2;

    public String getKey1() {
        return this.key1;
    }

    public String getKey2() {
        return this.key2;
    }

    public AtributoOperacion(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public float getValor(Enfrentable enfrentable) {
        float valor1 = enfrentable.getValorAtributo(this.key1);
        float valor2 = enfrentable.getValorAtributo(this.key2);
        if(valor1 == 0 || valor2 == 0) {
            return 0f;
        }
        return valor1 / valor2;
    }

}