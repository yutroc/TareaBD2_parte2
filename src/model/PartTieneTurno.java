package model;
public class PartTieneTurno {
    private int c�digoturno;
    private String rute;

    public PartTieneTurno() {
    }

    public PartTieneTurno(int c�digoturno, String rute) {
        this.c�digoturno = c�digoturno;
        this.rute = rute;
    }


    public int getC�digoturno() {
        return c�digoturno;
    }

    public void setC�digoturno(int c�digoturno) {
        this.c�digoturno = c�digoturno;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("c�digoturno=");
        buffer.append(getC�digoturno());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
