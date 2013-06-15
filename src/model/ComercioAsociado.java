package model;
public class ComercioAsociado {
    private int codigoca;
    private String nombre;
    private String rubro;
    private String rutadmin;

    public ComercioAsociado() {
    }


    public int getCodigoca() {
        return codigoca;
    }

    public void setCodigoca(String codigoca) {
        this.codigoca = Integer.parseInt(codigoca);
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
        buffer.append("codigoca=");
        buffer.append(getCodigoca());
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
