package model;
import java.util.Date;

public class Descuento {
    private int codigoca;
    private int codigod;
    private int duracion;
    private Date fechaInicio;
    private double porcentaje;
    private String rutcliente;

    public Descuento() {
    }


    public int getCodigoca() {
        return codigoca;
    }

    public void setCodigoca(String codigoca) {
        this.codigoca = Integer.parseInt(codigoca);
    }

    public int getCodigod() {
        return codigod;
    }

    public void setCodigod(String codigod) {
        this.codigod = Integer.parseInt(codigod);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = Integer.parseInt(duracion);
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = Mapper.toDate(fechaInicio) ;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = Double.parseDouble(porcentaje.replace("," ,"." ));
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
        buffer.append("codigoca=");
        buffer.append(getCodigoca());
        buffer.append(',');
        buffer.append("codigod=");
        buffer.append(getCodigod());
        buffer.append(',');
        buffer.append("duracion=");
        buffer.append(getDuracion());
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
