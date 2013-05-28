package model;
import java.sql.Date;

public class Descuento {
    private int códigoca;
    private int códigod;
    private int duración;
    private Date fechaInicio;
    private double porcentaje;
    private String rutcliente;

    public Descuento() {
    }

    public Descuento(int códigoca, int códigod, int duración, Date fechaInicio, double porcentaje,
                     String rutcliente) {
        this.códigoca = códigoca;
        this.códigod = códigod;
        this.duración = duración;
        this.fechaInicio = fechaInicio;
        this.porcentaje = porcentaje;
        this.rutcliente = rutcliente;
    }


    public int getCódigoca() {
        return códigoca;
    }

    public void setCódigoca(int códigoca) {
        this.códigoca = códigoca;
    }

    public int getCódigod() {
        return códigod;
    }

    public void setCódigod(int códigod) {
        this.códigod = códigod;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
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
        buffer.append("códigoca=");
        buffer.append(getCódigoca());
        buffer.append(',');
        buffer.append("códigod=");
        buffer.append(getCódigod());
        buffer.append(',');
        buffer.append("duración=");
        buffer.append(getDuración());
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
