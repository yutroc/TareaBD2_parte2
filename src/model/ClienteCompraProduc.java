package model;
import java.sql.Date;


public class ClienteCompraProduc {
    private Date fecha;
    private String númproducto;
    private String rutcliente;

    public ClienteCompraProduc() {
    }

    public ClienteCompraProduc(Date fecha, String númproducto, String rutcliente) {
        this.fecha = fecha;
        this.númproducto = númproducto;
        this.rutcliente = rutcliente;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNúmproducto() {
        return númproducto;
    }

    public void setNúmproducto(String númproducto) {
        this.númproducto = númproducto;
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
        buffer.append("númproducto=");
        buffer.append(getNúmproducto());
        buffer.append(',');
        buffer.append("rutcliente=");
        buffer.append(getRutcliente());
        buffer.append(']');
        return buffer.toString();
    }
}
