package model;
public class Peli3d {
    private int codigo;
    private String espacioDeColores;

    public Peli3d() {
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspacioDeColores() {
        return espacioDeColores;
    }

    public void setEspacioDeColores(String espacioDeColores) {
        this.espacioDeColores = espacioDeColores;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("espacioDeColores=");
        buffer.append(getEspacioDeColores());
        buffer.append(']');
        return buffer.toString();
    }
}
