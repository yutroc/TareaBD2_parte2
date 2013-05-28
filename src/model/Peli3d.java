package model;
public class Peli3d {
    private int código;
    private String espacioDeColores;

    public Peli3d() {
    }

    public Peli3d(int código, String espacioDeColores) {
        this.código = código;
        this.espacioDeColores = espacioDeColores;
    }


    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
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
        buffer.append("código=");
        buffer.append(getCódigo());
        buffer.append(',');
        buffer.append("espacioDeColores=");
        buffer.append(getEspacioDeColores());
        buffer.append(']');
        return buffer.toString();
    }
}
