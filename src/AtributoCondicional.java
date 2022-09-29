public class AtributoCondicional implements Atributo {
    
    private String key1;

    private String key2;

    private Atributo keyThen;

    private Atributo keyElse;

    public AtributoCondicional(String key1, String key2, Atributo atributoThen, Atributo atributoElse) {
        this.key1 = key1;
        this.key2 = key2;
        this.keyThen = atributoThen;
        this.keyElse = atributoElse;
    }

    public String getKey1() {
        return this.key1;
    }

    public String getKey2() {
        return this.key2;
    }

    public Atributo getKeyThen() {
        return this.keyThen;
    }

    public Atributo getKeyElse() {
        return this.keyElse;
    }

    @Override
    public float getValor(Enfrentable enfrentable) {
        // TODO implementar
        return 0;
    }
    
}
