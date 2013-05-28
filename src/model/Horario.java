package model;
import java.sql.Date;
import java.sql.Timestamp;

public class Horario {
    private int c�digoh;
    private int c�digopeli;
    private Date fecha;
    private Timestamp hora;
    private int n�msala;
    private int n�msucur;

    public Horario() {
    }

    public Horario(int c�digoh, int c�digopeli, Date fecha, Timestamp hora, int n�msala,
                   int n�msucur) {
        this.c�digoh = c�digoh;
        this.c�digopeli = c�digopeli;
        this.fecha = fecha;
        this.hora = hora;
        this.n�msala = n�msala;
        this.n�msucur = n�msucur;
    }


    public int getC�digoh() {
        return c�digoh;
    }

    public void setC�digoh(int c�digoh) {
        this.c�digoh = c�digoh;
    }

    public int getC�digopeli() {
        return c�digopeli;
    }

    public void setC�digopeli(int c�digopeli) {
        this.c�digopeli = c�digopeli;
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

    public int getN�msala() {
        return n�msala;
    }

    public void setN�msala(int n�msala) {
        this.n�msala = n�msala;
    }

    public int getN�msucur() {
        return n�msucur;
    }

    public void setN�msucur(int n�msucur) {
        this.n�msucur = n�msucur;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("c�digoh=");
        buffer.append(getC�digoh());
        buffer.append(',');
        buffer.append("c�digopeli=");
        buffer.append(getC�digopeli());
        buffer.append(',');
        buffer.append("fecha=");
        buffer.append(getFecha());
        buffer.append(',');
        buffer.append("hora=");
        buffer.append(getHora());
        buffer.append(',');
        buffer.append("n�msala=");
        buffer.append(getN�msala());
        buffer.append(',');
        buffer.append("n�msucur=");
        buffer.append(getN�msucur());
        buffer.append(']');
        return buffer.toString();
    }
}
