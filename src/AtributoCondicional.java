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
        float valor1 = enfrentable.getValorAtributo(this.key1);
        float valor2 = enfrentable.getValorAtributo(this.key2);
        if(valor1 > valor2) {
            return this.keyThen.getValor(enfrentable);
        }
        return this.keyElse.getValor(enfrentable);
    }
    
}
