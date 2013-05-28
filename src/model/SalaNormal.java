package model;
public class SalaNormal {
    private int n�merosa;
    private int n�merosu;
    private String tipoSonido;

    public SalaNormal() {
    }

    public SalaNormal(int n�merosa, int n�merosu, String tipoSonido) {
        this.n�merosa = n�merosa;
        this.n�merosu = n�merosu;
        this.tipoSonido = tipoSonido;
    }


    public int getN�merosa() {
        return n�merosa;
    }

    public void setN�merosa(int n�merosa) {
        this.n�merosa = n�merosa;
    }

    public int getN�merosu() {
        return n�merosu;
    }

    public void setN�merosu(int n�merosu) {
        this.n�merosu = n�merosu;
    }

    public String getTipoSonido() {
        return tipoSonido;
    }

    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("n�merosa=");
        buffer.append(getN�merosa());
        buffer.append(',');
        buffer.append("n�merosu=");
        buffer.append(getN�merosu());
        buffer.append(',');
        buffer.append("tipoSonido=");
        buffer.append(getTipoSonido());
        buffer.append(']');
        return buffer.toString();
    }
}
