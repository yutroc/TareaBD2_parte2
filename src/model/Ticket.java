package model;
import java.util.Date;
import java.sql.Timestamp;

public class Ticket {
    private int codigoti;
    private int dctoPorDia;
    private Date fechaCompra;
    private Timestamp horaCompra;
    private String rutcajero;
    private Cajero cajero;

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Ticket() {
    }


    public int getCodigoti() {
        return codigoti;
    }

    public void setCodigoti(String codigoti) {
        this.codigoti = Integer.parseInt(codigoti);
    }

    public int getDctoPorDia() {
        return dctoPorDia;
    }

    public void setDctoPorDia(String dctoPorDia) {
        this.dctoPorDia = Integer.parseInt(dctoPorDia);
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = Mapper.toDate(fechaCompra);
    }

    public Timestamp getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = Mapper.toTime(horaCompra);
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
