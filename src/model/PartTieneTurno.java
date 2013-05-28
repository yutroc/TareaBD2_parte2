package model;
public class PartTieneTurno {
    private int códigoturno;
    private String rute;

    public PartTieneTurno() {
    }

    public PartTieneTurno(int códigoturno, String rute) {
        this.códigoturno = códigoturno;
        this.rute = rute;
    }


    public int getCódigoturno() {
        return códigoturno;
    }

    public void setCódigoturno(int códigoturno) {
        this.códigoturno = códigoturno;
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
        buffer.append("códigoturno=");
        buffer.append(getCódigoturno());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
