package model;
import java.sql.Date;
import java.sql.Timestamp;

public class Pelicula {
    private String clasificaci�n;
    private int c�digo;
    private String director;
    private Timestamp duraci�n;
    private Date fechaEstreno;
    private String t�tulo;

    public Pelicula() {
    }

    public Pelicula(String clasificaci�n, int c�digo, String director, Timestamp duraci�n, Date fechaEstreno,
                    String t�tulo) {
        this.clasificaci�n = clasificaci�n;
        this.c�digo = c�digo;
        this.director = director;
        this.duraci�n = duraci�n;
        this.fechaEstreno = fechaEstreno;
        this.t�tulo = t�tulo;
    }

    public String getClasificaci�n() {
        return clasificaci�n;
    }

    public void setClasificaci�n(String clasificaci�n) {
        this.clasificaci�n = clasificaci�n;
    }

    public int getC�digo() {
        return c�digo;
    }

    public void setC�digo(int c�digo) {
        this.c�digo = c�digo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Timestamp getDuraci�n() {
        return duraci�n;
    }

    public void setDuraci�n(Timestamp duraci�n) {
        this.duraci�n = duraci�n;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getT�tulo() {
        return t�tulo;
    }

    public void setT�tulo(String t�tulo) {
        this.t�tulo = t�tulo;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("clasificaci�n=");
        buffer.append(getClasificaci�n());
        buffer.append(',');
        buffer.append("c�digo=");
        buffer.append(getC�digo());
        buffer.append(',');
        buffer.append("director=");
        buffer.append(getDirector());
        buffer.append(',');
        buffer.append("duraci�n=");
        buffer.append(getDuraci�n());
        buffer.append(',');
        buffer.append("fechaEstreno=");
        buffer.append(getFechaEstreno());
        buffer.append(',');
        buffer.append("t�tulo=");
        buffer.append(getT�tulo());
        buffer.append(']');
        return buffer.toString();
    }
}
