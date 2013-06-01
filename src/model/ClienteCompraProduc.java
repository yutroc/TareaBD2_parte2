package model;
import java.sql.Date;


public class ClienteCompraProduc {
    private Date fecha;
    private String numproducto;
    private String rutcliente;

    public ClienteCompraProduc() {
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumproducto() {
        return numproducto;
    }

    public void setNumproducto(String numproducto) {
        this.numproducto = numproducto;
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
        buffer.append("numproducto=");
        buffer.append(getNumproducto());
        buffer.append(',');
        buffer.append("rutcliente=");
        buffer.append(getRutcliente());
        buffer.append(']');
        return buffer.toString();
    }
}
