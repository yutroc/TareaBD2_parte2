package model;
public class Sala3d {
    private int numLentes;
    private int n�merosa;
    private int n�merosu;

    public Sala3d() {
    }

    public Sala3d(int numLentes, int n�merosa, int n�merosu) {
        this.numLentes = numLentes;
        this.n�merosa = n�merosa;
        this.n�merosu = n�merosu;
    }

    public int getNumLentes() {
        return numLentes;
    }

    public void setNumLentes(int numLentes) {
        this.numLentes = numLentes;
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

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("numLentes=");
        buffer.append(getNumLentes());
        buffer.append(',');
        buffer.append("n�merosa=");
        buffer.append(getN�merosa());
        buffer.append(',');
        buffer.append("n�merosu=");
        buffer.append(getN�merosu());
        buffer.append(']');
        return buffer.toString();
    }
}
