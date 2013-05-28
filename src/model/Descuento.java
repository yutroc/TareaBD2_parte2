package model;
import java.sql.Date;

public class Descuento {
    private int c�digoca;
    private int c�digod;
    private int duraci�n;
    private Date fechaInicio;
    private double porcentaje;
    private String rutcliente;

    public Descuento() {
    }

    public Descuento(int c�digoca, int c�digod, int duraci�n, Date fechaInicio, double porcentaje,
                     String rutcliente) {
        this.c�digoca = c�digoca;
        this.c�digod = c�digod;
        this.duraci�n = duraci�n;
        this.fechaInicio = fechaInicio;
        this.porcentaje = porcentaje;
        this.rutcliente = rutcliente;
    }


    public int getC�digoca() {
        return c�digoca;
    }

    public void setC�digoca(int c�digoca) {
        this.c�digoca = c�digoca;
    }

    public int getC�digod() {
        return c�digod;
    }

    public void setC�digod(int c�digod) {
        this.c�digod = c�digod;
    }

    public int getDuraci�n() {
        return duraci�n;
    }

    public void setDuraci�n(int duraci�n) {
        this.duraci�n = duraci�n;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getRutcliente() {
        return rutcliente;
    }

    public void setRutcliente(String rutcliente) {
        this.rutcliente = rutcliente;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("c�digoca=");
        buffer.append(getC�digoca());
        buffer.append(',');
        buffer.append("c�digod=");
        buffer.append(getC�digod());
        buffer.append(',');
        buffer.append("duraci�n=");
        buffer.append(getDuraci�n());
        buffer.append(',');
        buffer.append("fechaInicio=");
        buffer.append(getFechaInicio());
        buffer.append(',');
        buffer.append("porcentaje=");
        buffer.append(getPorcentaje());
        buffer.append(',');
        buffer.append("rutcliente=");
        buffer.append(getRutcliente());
        buffer.append(']');
        return buffer.toString();
    }
}
