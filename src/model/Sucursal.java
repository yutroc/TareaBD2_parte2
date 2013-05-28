package model;
public class Sucursal {
    private String calle;
    private String comuna;
    private String nombre;
    private int n�merocalle;
    private int n�merosu;
    private String regi�n;
    private String rutEncargado;

    public Sucursal() {
    }

    public Sucursal(String calle, String comuna, String nombre, int n�merocalle, int n�merosu,
                    String regi�n, String rutEncargado) {
        this.calle = calle;
        this.comuna = comuna;
        this.nombre = nombre;
        this.n�merocalle = n�merocalle;
        this.n�merosu = n�merosu;
        this.regi�n = regi�n;
        this.rutEncargado = rutEncargado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN�merocalle() {
        return n�merocalle;
    }

    public void setN�merocalle(int n�merocalle) {
        this.n�merocalle = n�merocalle;
    }

    public int getN�merosu() {
        return n�merosu;
    }

    public void setN�merosu(int n�merosu) {
        this.n�merosu = n�merosu;
    }

    public String getRegi�n() {
        return regi�n;
    }

    public void setRegi�n(String regi�n) {
        this.regi�n = regi�n;
    }

    public String getRutEncargado() {
        return rutEncargado;
    }

    public void setRutEncargado(String rutEncargado) {
        this.rutEncargado = rutEncargado;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("calle=");
        buffer.append(getCalle());
        buffer.append(',');
        buffer.append("comuna=");
        buffer.append(getComuna());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("n�merocalle=");
        buffer.append(getN�merocalle());
        buffer.append(',');
        buffer.append("n�merosu=");
        buffer.append(getN�merosu());
        buffer.append(',');
        buffer.append("regi�n=");
        buffer.append(getRegi�n());
        buffer.append(',');
        buffer.append("rutEncargado=");
        buffer.append(getRutEncargado());
        buffer.append(']');
        return buffer.toString();
    }
}
