package model;
public class SalaNormal {
    private int numerosa;
    private int numerosu;
    private String tipoSonido;

    public SalaNormal() {
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
        buffer.append("numerosa=");
        buffer.append(getNumerosa());
        buffer.append(',');
        buffer.append("numerosu=");
        buffer.append(getNumerosu());
        buffer.append(',');
        buffer.append("tipoSonido=");
        buffer.append(getTipoSonido());
        buffer.append(']');
        return buffer.toString();
    }
}
