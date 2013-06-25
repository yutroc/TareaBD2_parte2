package model;
public class Producto {
    private String categoria;
    private int codigoca;
    private String nombre;
    private int numero;
    private int valorEnPesos;
    private int valorEnPuntos;
    private ComercioAsociado comercioAsociado;

    public ComercioAsociado getComercioAsociado() {
        return comercioAsociado;
    }

    public void setComercioAsociado(ComercioAsociado comercioAsociado) {
        this.comercioAsociado = comercioAsociado;
    }

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

    public void setCodigoca(String codigoca) {
        this.codigoca = Integer.parseInt(codigoca);
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

    public void setNumero(String numero) {
        this.numero = Integer.parseInt(numero);
    }

    public int getValorEnPesos() {
        return valorEnPesos;
    }

    public void setValorEnPesos(String valorEnPesos) {
        this.valorEnPesos = Integer.parseInt(valorEnPesos);
    }

    public int getValorEnPuntos() {
        return valorEnPuntos;
    }

    public void setValorEnPuntos(String valorEnPuntos) {
        this.valorEnPuntos = Integer.parseInt(valorEnPuntos);
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
