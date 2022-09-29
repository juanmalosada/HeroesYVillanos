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
        // TODO implementar
        return 0;
    }

}