package model;
import java.sql.Timestamp;

public class Turno {
    private int c�digo;
    private String d�a;
    private Timestamp hEnt;
    private Timestamp hSal;

    public Turno() {
    }

    public Turno(int c�digo, String d�a, Timestamp hEnt, Timestamp hSal) {
        this.c�digo = c�digo;
        this.d�a = d�a;
        this.hEnt = hEnt;
        this.hSal = hSal;
    }


    public int getC�digo() {
        return c�digo;
    }

    public void setC�digo(int c�digo) {
        this.c�digo = c�digo;
    }

    public String getD�a() {
        return d�a;
    }

    public void setD�a(String d�a) {
        this.d�a = d�a;
    }

    public Timestamp getHEnt() {
        return hEnt;
    }

    public void setHEnt(Timestamp hEnt) {
        this.hEnt = hEnt;
    }

    public Timestamp getHSal() {
        return hSal;
    }

    public void setHSal(Timestamp hSal) {
        this.hSal = hSal;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("c�digo=");
        buffer.append(getC�digo());
        buffer.append(',');
        buffer.append("d�a=");
        buffer.append(getD�a());
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
