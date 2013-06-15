package model;
public class PartTieneTurno {
    private int codigoturno;
    private String rute;

    public PartTieneTurno() {
    }


    public int getCodigoturno() {
        return codigoturno;
    }

    public void setCodigoturno(String codigoturno) {
        this.codigoturno = Integer.parseInt(codigoturno);
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
        buffer.append("codigoturno=");
        buffer.append(getCodigoturno());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
