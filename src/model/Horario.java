package model;
import java.sql.Date;
import java.sql.Timestamp;

public class Horario {
    private int códigoh;
    private int códigopeli;
    private Date fecha;
    private Timestamp hora;
    private int númsala;
    private int númsucur;

    public Horario() {
    }

    public Horario(int códigoh, int códigopeli, Date fecha, Timestamp hora, int númsala,
                   int númsucur) {
        this.códigoh = códigoh;
        this.códigopeli = códigopeli;
        this.fecha = fecha;
        this.hora = hora;
        this.númsala = númsala;
        this.númsucur = númsucur;
    }


    public int getCódigoh() {
        return códigoh;
    }

    public void setCódigoh(int códigoh) {
        this.códigoh = códigoh;
    }

    public int getCódigopeli() {
        return códigopeli;
    }

    public void setCódigopeli(int códigopeli) {
        this.códigopeli = códigopeli;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public int getNúmsala() {
        return númsala;
    }

    public void setNúmsala(int númsala) {
        this.númsala = númsala;
    }

    public int getNúmsucur() {
        return númsucur;
    }

    public void setNúmsucur(int númsucur) {
        this.númsucur = númsucur;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("códigoh=");
        buffer.append(getCódigoh());
        buffer.append(',');
        buffer.append("códigopeli=");
        buffer.append(getCódigopeli());
        buffer.append(',');
        buffer.append("fecha=");
        buffer.append(getFecha());
        buffer.append(',');
        buffer.append("hora=");
        buffer.append(getHora());
        buffer.append(',');
        buffer.append("númsala=");
        buffer.append(getNúmsala());
        buffer.append(',');
        buffer.append("númsucur=");
        buffer.append(getNúmsucur());
        buffer.append(']');
        return buffer.toString();
    }
}
