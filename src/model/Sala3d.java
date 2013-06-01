package model;
public class Sala3d {
    private int numLentes;
    private int numerosa;
    private int numerosu;

    public Sala3d() {
    }

    public int getNumLentes() {
        return numLentes;
    }

    public void setNumLentes(int numLentes) {
        this.numLentes = numLentes;
    }

    public int getNumerosa() {
        return numerosa;
    }

    public void setNumerosa(int numerosa) {
        this.numerosa = numerosa;
    }

    public int getNumerosu() {
        return numerosu;
    }

    public void setNumerosu(int numerosu) {
        this.numerosu = numerosu;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("numLentes=");
        buffer.append(getNumLentes());
        buffer.append(',');
        buffer.append("numerosa=");
        buffer.append(getNumerosa());
        buffer.append(',');
        buffer.append("numerosu=");
        buffer.append(getNumerosu());
        buffer.append(']');
        return buffer.toString();
    }
}
