package model;
public class FullTime {
    private int bono;
    private String rute;
    private int sueldo;

    public FullTime() {
    }

    public FullTime(int bono, String rute, int sueldo) {
        this.bono = bono;
        this.rute = rute;
        this.sueldo = sueldo;
    }


    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("bono=");
        buffer.append(getBono());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(',');
        buffer.append("sueldo=");
        buffer.append(getSueldo());
        buffer.append(']');
        return buffer.toString();
    }
}
