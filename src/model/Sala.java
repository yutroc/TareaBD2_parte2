package model;
public class Sala {
    private int capacidad;
    private int númerosa;
    private int númerosu;
    private String rutEncargado;
    private int valorEntrada;

    public Sala() {
    }

    public Sala(int capacidad, int númerosa, int númerosu, String rutEncargado,
                int valorEntrada) {
        this.capacidad = capacidad;
        this.númerosa = númerosa;
        this.númerosu = númerosu;
        this.rutEncargado = rutEncargado;
        this.valorEntrada = valorEntrada;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNúmerosa() {
        return númerosa;
    }

    public void setNúmerosa(int númerosa) {
        this.númerosa = númerosa;
    }

    public int getNúmerosu() {
        return númerosu;
    }

    public void setNúmerosu(int númerosu) {
        this.númerosu = númerosu;
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
        buffer.append("númerosa=");
        buffer.append(getNúmerosa());
        buffer.append(',');
        buffer.append("númerosu=");
        buffer.append(getNúmerosu());
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
