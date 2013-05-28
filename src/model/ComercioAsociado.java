package model;
public class ComercioAsociado {
    private int códigoca;
    private String nombre;
    private String rubro;
    private String rutadmin;

    public ComercioAsociado() {
    }

    public ComercioAsociado(int códigoca, String nombre, String rubro, String rutadmin) {
        this.códigoca = códigoca;
        this.nombre = nombre;
        this.rubro = rubro;
        this.rutadmin = rutadmin;
    }


    public int getCódigoca() {
        return códigoca;
    }

    public void setCódigoca(int códigoca) {
        this.códigoca = códigoca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRutadmin() {
        return rutadmin;
    }

    public void setRutadmin(String rutadmin) {
        this.rutadmin = rutadmin;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("códigoca=");
        buffer.append(getCódigoca());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("rubro=");
        buffer.append(getRubro());
        buffer.append(',');
        buffer.append("rutadmin=");
        buffer.append(getRutadmin());
        buffer.append(']');
        return buffer.toString();
    }
}
