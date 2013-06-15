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

    public void setCodigoh(String codigoh) {
        this.codigoh = Integer.parseInt(codigoh);
    }

    public int getCodigopeli() {
        return codigopeli;
    }

    public void setCodigopeli(String codigopeli) {
        this.codigopeli = Integer.parseInt(codigopeli);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = Mapper.toDate(fecha);
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = Mapper.toTime(hora);
    }

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(String numsala) {
        this.numsala = Integer.parseInt(numsala);
    }

    public int getNumsucur() {
        return numsucur;
    }

    public void setNumsucur(String numsucur) {
        this.numsucur = Integer.parseInt(numsucur);
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
