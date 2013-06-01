package model;
import java.sql.Date;
import java.sql.Timestamp;

public class Horario {
    private int codigoh;
    private int codigopeli;
    private Date fecha;
    private Timestamp hora;
    private int numsala;
    private int numsucur;

    public Horario() {
    }


    public int getCodigoh() {
        return codigoh;
    }

    public void setCodigoh(int codigoh) {
        this.codigoh = codigoh;
    }

    public int getCodigopeli() {
        return codigopeli;
    }

    public void setCodigopeli(int codigopeli) {
        this.codigopeli = codigopeli;
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

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(int numsala) {
        this.numsala = numsala;
    }

    public int getNumsucur() {
        return numsucur;
    }

    public void setNumsucur(int numsucur) {
        this.numsucur = numsucur;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigoh=");
        buffer.append(getCodigoh());
        buffer.append(',');
        buffer.append("codigopeli=");
        buffer.append(getCodigopeli());
        buffer.append(',');
        buffer.append("fecha=");
        buffer.append(getFecha());
        buffer.append(',');
        buffer.append("hora=");
        buffer.append(getHora());
        buffer.append(',');
        buffer.append("numsala=");
        buffer.append(getNumsala());
        buffer.append(',');
        buffer.append("numsucur=");
        buffer.append(getNumsucur());
        buffer.append(']');
        return buffer.toString();
    }
}
