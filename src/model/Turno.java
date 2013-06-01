package model;
import java.sql.Timestamp;

public class Turno {
    private int codigo;
    private String dia;
    private Timestamp hEnt;
    private Timestamp hSal;

    public Turno() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = Integer.parseInt(codigo);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Timestamp getHEnt() {
        return hEnt;
    }

    public void setHEnt(String hEnt) {
        this.hEnt = Mapper.toTime(hEnt);
    }

    public Timestamp getHSal() {
        return hSal;
    }

    public void setHSal(String hSal) {
        this.hSal = Mapper.toTime(hSal);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("dia=");
        buffer.append(getDia());
        buffer.append(',');
        buffer.append("hEnt=");
        buffer.append(getHEnt());
        buffer.append(',');
        buffer.append("hSal=");
        buffer.append(getHSal());
        buffer.append(']');
        return buffer.toString();
    }
}
