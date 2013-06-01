package model;
public class Producto {
    private String categoria;
    private int codigoca;
    private String nombre;
    private int numero;
    private int valorEnPesos;
    private int valorEnPuntos;

    public Producto() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigoca() {
        return codigoca;
    }

    public void setCodigoca(int codigoca) {
        this.codigoca = codigoca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        buffer.append("categoria=");
        buffer.append(getCategoria());
        buffer.append(',');
        buffer.append("codigoca=");
        buffer.append(getCodigoca());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("numero=");
        buffer.append(getNumero());
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
