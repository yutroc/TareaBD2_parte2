package model;
public class Sala {
    private int capacidad;
    private int numerosa;
    private int numerosu;
    private String rutEncargado;
    private int valorEntrada;

    public Sala() {
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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

    public String getRutEncargado() {
        return rutEncargado;
    }

    public void setRutEncargado(String rutEncargado) {
        this.rutEncargado = rutEncargado;
    }

    public int getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(int valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("capacidad=");
        buffer.append(getCapacidad());
        buffer.append(',');
        buffer.append("numerosa=");
        buffer.append(getNumerosa());
        buffer.append(',');
        buffer.append("numerosu=");
        buffer.append(getNumerosu());
        buffer.append(',');
        buffer.append("rutEncargado=");
        buffer.append(getRutEncargado());
        buffer.append(',');
        buffer.append("valorEntrada=");
        buffer.append(getValorEntrada());
        buffer.append(']');
        return buffer.toString();
    }
}
