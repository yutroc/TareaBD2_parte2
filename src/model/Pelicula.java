package model;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String clasificacion;
    private int codigo;
    private String director;
    private Timestamp duracion;
    private Date fechaEstreno;
    private String titulo;
    private List<TickNormal> tickNormal;
    private List<TickEspecial> tickEspecial;

    public Pelicula() {
    	tickNormal = new ArrayList<TickNormal>();
    	tickEspecial = new ArrayList<TickEspecial>();
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = Integer.parseInt(codigo);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Timestamp getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = Mapper.toTime(duracion);
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = Mapper.toDate(fechaEstreno);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("clasificacion=");
        buffer.append(getClasificacion());
        buffer.append(',');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("director=");
        buffer.append(getDirector());
        buffer.append(',');
        buffer.append("duracion=");
        buffer.append(getDuracion());
        buffer.append(',');
        buffer.append("fechaEstreno=");
        buffer.append(getFechaEstreno());
        buffer.append(',');
        buffer.append("titulo=");
        buffer.append(getTitulo());
        buffer.append(']');
        return buffer.toString();
    }

	public List<TickNormal> getTickNormal() {
		return tickNormal;
	}

	public void setTickNormal(List<TickNormal> tickNormal) {
		this.tickNormal = tickNormal;
	}
	
	public void addTickNormal(TickNormal tickNormal) {
		this.tickNormal.add(tickNormal);
	}

	public List<TickEspecial> getTickEspecial() {
		return tickEspecial;
	}

	public void setTickEspecial(List<TickEspecial> tickEspecial) {
		this.tickEspecial = tickEspecial;
	}
	
	public void addTickEspecial(TickEspecial tickEspecial) {
		this.tickEspecial.add(tickEspecial);
	}
}
