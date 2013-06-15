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

    public void setNumLentes(String numLentes) {
        this.numLentes = Integer.parseInt(numLentes);
    }

    public int getNumerosa() {
        return numerosa;
    }

    public void setNumerosa(String numerosa) {
        this.numerosa = Integer.parseInt(numerosa);
    }

    public int getNumerosu() {
        return numerosu;
    }

    public void setNumerosu(String numerosu) {
        this.numerosu = Integer.parseInt(numerosu);
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
