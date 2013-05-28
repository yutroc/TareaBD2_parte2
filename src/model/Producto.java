package model;
public class Producto {
    private String categor�a;
    private int c�digoca;
    private String nombre;
    private int n�mero;
    private int valorEnPesos;
    private int valorEnPuntos;

    public Producto() {
    }

    public Producto(String categor�a, int c�digoca, String nombre, int n�mero, int valorEnPesos,
                    int valorEnPuntos) {
        this.categor�a = categor�a;
        this.c�digoca = c�digoca;
        this.nombre = nombre;
        this.n�mero = n�mero;
        this.valorEnPesos = valorEnPesos;
        this.valorEnPuntos = valorEnPuntos;
    }

    public String getCategor�a() {
        return categor�a;
    }

    public void setCategor�a(String categor�a) {
        this.categor�a = categor�a;
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

    public int getN�mero() {
        return n�mero;
    }

    public void setN�mero(int n�mero) {
        this.n�mero = n�mero;
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
        buffer.append("categor�a=");
        buffer.append(getCategor�a());
        buffer.append(',');
        buffer.append("c�digoca=");
        buffer.append(getC�digoca());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("n�mero=");
        buffer.append(getN�mero());
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
