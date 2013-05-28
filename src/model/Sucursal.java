package model;
public class Sucursal {
    private String calle;
    private String comuna;
    private String nombre;
    private int númerocalle;
    private int númerosu;
    private String región;
    private String rutEncargado;

    public Sucursal() {
    }

    public Sucursal(String calle, String comuna, String nombre, int númerocalle, int númerosu,
                    String región, String rutEncargado) {
        this.calle = calle;
        this.comuna = comuna;
        this.nombre = nombre;
        this.númerocalle = númerocalle;
        this.númerosu = númerosu;
        this.región = región;
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

    public int getNúmerocalle() {
        return númerocalle;
    }

    public void setNúmerocalle(int númerocalle) {
        this.númerocalle = númerocalle;
    }

    public int getNúmerosu() {
        return númerosu;
    }

    public void setNúmerosu(int númerosu) {
        this.númerosu = númerosu;
    }

    public String getRegión() {
        return región;
    }

    public void setRegión(String región) {
        this.región = región;
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
        buffer.append("númerocalle=");
        buffer.append(getNúmerocalle());
        buffer.append(',');
        buffer.append("númerosu=");
        buffer.append(getNúmerosu());
        buffer.append(',');
        buffer.append("región=");
        buffer.append(getRegión());
        buffer.append(',');
        buffer.append("rutEncargado=");
        buffer.append(getRutEncargado());
        buffer.append(']');
        return buffer.toString();
    }
}
