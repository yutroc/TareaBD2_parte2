package model;
public class PeliNormal {
    private int codigo;
    private String resolucion;

    public PeliNormal() {
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = Integer.parseInt(codigo);
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("resolucion=");
        buffer.append(getResolucion());
        buffer.append(']');
        return buffer.toString();
    }
}
