package model;
public class Producto {
    private String categoría;
    private int códigoca;
    private String nombre;
    private int número;
    private int valorEnPesos;
    private int valorEnPuntos;

    public Producto() {
    }

    public Producto(String categoría, int códigoca, String nombre, int número, int valorEnPesos,
                    int valorEnPuntos) {
        this.categoría = categoría;
        this.códigoca = códigoca;
        this.nombre = nombre;
        this.número = número;
        this.valorEnPesos = valorEnPesos;
        this.valorEnPuntos = valorEnPuntos;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
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

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public int getValorEnPesos() {
        return valorEnPesos;
    }

    public void setValorEnPesos(int valorEnPesos) {
        this.valorEnPesos = valorEnPesos;
    }

    public int getValorEnPuntos() {
        return valorEnPuntos;
    }

    public void setValorEnPuntos(int valorEnPuntos) {
        this.valorEnPuntos = valorEnPuntos;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("categoría=");
        buffer.append(getCategoría());
        buffer.append(',');
        buffer.append("códigoca=");
        buffer.append(getCódigoca());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("número=");
        buffer.append(getNúmero());
        buffer.append(',');
        buffer.append("valorEnPesos=");
        buffer.append(getValorEnPesos());
        buffer.append(',');
        buffer.append("valorEnPuntos=");
        buffer.append(getValorEnPuntos());
        buffer.append(']');
        return buffer.toString();
    }
}
