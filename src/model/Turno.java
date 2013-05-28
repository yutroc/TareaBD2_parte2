package model;
import java.sql.Timestamp;

public class Turno {
    private int código;
    private String día;
    private Timestamp hEnt;
    private Timestamp hSal;

    public Turno() {
    }

    public Turno(int código, String día, Timestamp hEnt, Timestamp hSal) {
        this.código = código;
        this.día = día;
        this.hEnt = hEnt;
        this.hSal = hSal;
    }


    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getDía() {
        return día;
    }

    public void setDía(String día) {
        this.día = día;
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
        buffer.append("código=");
        buffer.append(getCódigo());
        buffer.append(',');
        buffer.append("día=");
        buffer.append(getDía());
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
