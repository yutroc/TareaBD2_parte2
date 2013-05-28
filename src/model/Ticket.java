package model;
import java.sql.Date;

public class Ticket {
    private int códigoti;
    private int dctoPorDía;
    private Date fechaCompra;
    private Date horaCompra;
    private String rutcajero;

    public Ticket() {
    }

    public Ticket(int códigoti, int dctoPorDía, Date fechaCompra, Date horaCompra, String rutcajero) {
        this.códigoti = códigoti;
        this.dctoPorDía = dctoPorDía;
        this.fechaCompra = fechaCompra;
        this.horaCompra = horaCompra;
        this.rutcajero = rutcajero;
    }


    public int getCódigoti() {
        return códigoti;
    }

    public void setCódigoti(int códigoti) {
        this.códigoti = códigoti;
    }

    public int getDctoPorDía() {
        return dctoPorDía;
    }

    public void setDctoPorDía(int dctoPorDía) {
        this.dctoPorDía = dctoPorDía;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Date horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getRutcajero() {
        return rutcajero;
    }

    public void setRutcajero(String rutcajero) {
        this.rutcajero = rutcajero;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("códigoti=");
        buffer.append(getCódigoti());
        buffer.append(',');
        buffer.append("dctoPorDía=");
        buffer.append(getDctoPorDía());
        buffer.append(',');
        buffer.append("fechaCompra=");
        buffer.append(getFechaCompra());
        buffer.append(',');
        buffer.append("horaCompra=");
        buffer.append(getHoraCompra());
        buffer.append(',');
        buffer.append("rutcajero=");
        buffer.append(getRutcajero());
        buffer.append(']');
        return buffer.toString();
    }
}
