package model;
import java.sql.Date;


public class ClienteCompraProduc {
    private Date fecha;
    private String n�mproducto;
    private String rutcliente;

    public ClienteCompraProduc() {
    }

    public ClienteCompraProduc(Date fecha, String n�mproducto, String rutcliente) {
        this.fecha = fecha;
        this.n�mproducto = n�mproducto;
        this.rutcliente = rutcliente;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getN�mproducto() {
        return n�mproducto;
    }

    public void setN�mproducto(String n�mproducto) {
        this.n�mproducto = n�mproducto;
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
        buffer.append("fecha=");
        buffer.append(getFecha());
        buffer.append(',');
        buffer.append("n�mproducto=");
        buffer.append(getN�mproducto());
        buffer.append(',');
        buffer.append("rutcliente=");
        buffer.append(getRutcliente());
        buffer.append(']');
        return buffer.toString();
    }
}
