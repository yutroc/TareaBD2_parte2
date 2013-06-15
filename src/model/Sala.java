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

    public void setCapacidad(String capacidad) {
        this.capacidad = Integer.parseInt(capacidad);
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

    public String getRutEncargado() {
        return rutEncargado;
    }

    public void setRutEncargado(String rutEncargado) {
        this.rutEncargado = rutEncargado;
    }

    public int getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(String valorEntrada) {
        this.valorEntrada = Integer.parseInt(valorEntrada);
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
