package model;
public class PeliNormal {
    private int c�digo;
    private String resoluci�n;

    public PeliNormal() {
    }

    public PeliNormal(int c�digo, String resoluci�n) {
        this.c�digo = c�digo;
        this.resoluci�n = resoluci�n;
    }


    public int getC�digo() {
        return c�digo;
    }

    public void setC�digo(int c�digo) {
        this.c�digo = c�digo;
    }

    public String getResoluci�n() {
        return resoluci�n;
    }

    public void setResoluci�n(String resoluci�n) {
        this.resoluci�n = resoluci�n;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("c�digo=");
        buffer.append(getC�digo());
        buffer.append(',');
        buffer.append("resoluci�n=");
        buffer.append(getResoluci�n());
        buffer.append(']');
        return buffer.toString();
    }
}
