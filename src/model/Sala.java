package model;
public class Sala {
    private int capacidad;
    private int n�merosa;
    private int n�merosu;
    private String rutEncargado;
    private int valorEntrada;

    public Sala() {
    }

    public Sala(int capacidad, int n�merosa, int n�merosu, String rutEncargado,
                int valorEntrada) {
        this.capacidad = capacidad;
        this.n�merosa = n�merosa;
        this.n�merosu = n�merosu;
        this.rutEncargado = rutEncargado;
        this.valorEntrada = valorEntrada;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
        buffer.append("n�merosa=");
        buffer.append(getN�merosa());
        buffer.append(',');
        buffer.append("n�merosu=");
        buffer.append(getN�merosu());
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
