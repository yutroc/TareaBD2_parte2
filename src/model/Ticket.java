package model;
import java.sql.Date;

public class Ticket {
    private int codigoti;
    private int dctoPorDia;
    private Date fechaCompra;
    private Date horaCompra;
    private String rutcajero;

    public Ticket() {
    }


    public int getCodigoti() {
        return codigoti;
    }

    public void setCodigoti(int codigoti) {
        this.codigoti = codigoti;
    }

    public int getDctoPorDia() {
        return dctoPorDia;
    }

    public void setDctoPorDia(int dctoPorDia) {
        this.dctoPorDia = dctoPorDia;
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
        buffer.append("codigoti=");
        buffer.append(getCodigoti());
        buffer.append(',');
        buffer.append("dctoPorDia=");
        buffer.append(getDctoPorDia());
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
