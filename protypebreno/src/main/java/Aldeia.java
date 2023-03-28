public class Aldeia implements Cloneable {
    private String vila;
    private Integer numero;

    public Aldeia(String vila, Integer numero) {
        super();
        this.vila = vila;
        this.numero = numero;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Aldeia{" +
                "vila='" + vila + '\'' +
                ", numero=" + numero +
                '}';
    }
}
