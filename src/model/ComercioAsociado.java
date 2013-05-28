package model;
public class ComercioAsociado {
    private int c�digoca;
    private String nombre;
    private String rubro;
    private String rutadmin;

    public ComercioAsociado() {
    }

    public ComercioAsociado(int c�digoca, String nombre, String rubro, String rutadmin) {
        this.c�digoca = c�digoca;
        this.nombre = nombre;
        this.rubro = rubro;
        this.rutadmin = rutadmin;
    }


    public int getC�digoca() {
        return c�digoca;
    }

    public void setC�digoca(int c�digoca) {
        this.c�digoca = c�digoca;
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
        buffer.append("c�digoca=");
        buffer.append(getC�digoca());
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