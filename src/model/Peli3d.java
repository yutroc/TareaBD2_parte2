package model;
public class Peli3d {
    private int c�digo;
    private String espacioDeColores;

    public Peli3d() {
    }

    public Peli3d(int c�digo, String espacioDeColores) {
        this.c�digo = c�digo;
        this.espacioDeColores = espacioDeColores;
    }


    public int getC�digo() {
        return c�digo;
    }

    public void setC�digo(int c�digo) {
        this.c�digo = c�digo;
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
        buffer.append("c�digo=");
        buffer.append(getC�digo());
        buffer.append(',');
        buffer.append("espacioDeColores=");
        buffer.append(getEspacioDeColores());
        buffer.append(']');
        return buffer.toString();
    }
}
