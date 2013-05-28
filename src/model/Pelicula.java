package model;
import java.sql.Date;
import java.sql.Timestamp;

public class Pelicula {
    private String clasificación;
    private int código;
    private String director;
    private Timestamp duración;
    private Date fechaEstreno;
    private String título;

    public Pelicula() {
    }

    public Pelicula(String clasificación, int código, String director, Timestamp duración, Date fechaEstreno,
                    String título) {
        this.clasificación = clasificación;
        this.código = código;
        this.director = director;
        this.duración = duración;
        this.fechaEstreno = fechaEstreno;
        this.título = título;
    }

    public String getClasificación() {
        return clasificación;
    }

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Timestamp getDuración() {
        return duración;
    }

    public void setDuración(Timestamp duración) {
        this.duración = duración;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("clasificación=");
        buffer.append(getClasificación());
        buffer.append(',');
        buffer.append("código=");
        buffer.append(getCódigo());
        buffer.append(',');
        buffer.append("director=");
        buffer.append(getDirector());
        buffer.append(',');
        buffer.append("duración=");
        buffer.append(getDuración());
        buffer.append(',');
        buffer.append("fechaEstreno=");
        buffer.append(getFechaEstreno());
        buffer.append(',');
        buffer.append("título=");
        buffer.append(getTítulo());
        buffer.append(']');
        return buffer.toString();
    }
}
