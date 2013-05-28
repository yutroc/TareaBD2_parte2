package model;
import java.sql.Date;

public class Ticket {
    private int c�digoti;
    private int dctoPorD�a;
    private Date fechaCompra;
    private Date horaCompra;
    private String rutcajero;

    public Ticket() {
    }

    public Ticket(int c�digoti, int dctoPorD�a, Date fechaCompra, Date horaCompra, String rutcajero) {
        this.c�digoti = c�digoti;
        this.dctoPorD�a = dctoPorD�a;
        this.fechaCompra = fechaCompra;
        this.horaCompra = horaCompra;
        this.rutcajero = rutcajero;
    }


    public int getC�digoti() {
        return c�digoti;
    }

    public void setC�digoti(int c�digoti) {
        this.c�digoti = c�digoti;
    }

    public int getDctoPorD�a() {
        return dctoPorD�a;
    }

    public void setDctoPorD�a(int dctoPorD�a) {
        this.dctoPorD�a = dctoPorD�a;
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
        buffer.append("c�digoti=");
        buffer.append(getC�digoti());
        buffer.append(',');
        buffer.append("dctoPorD�a=");
        buffer.append(getDctoPorD�a());
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
