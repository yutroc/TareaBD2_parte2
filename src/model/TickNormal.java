package model;
public class TickNormal {
    private int c�digoh;
    private int c�digopeli;
    private int c�digot;
    private int n�msala;
    private int n�msucur;
    private String rutc;

    public TickNormal() {
    }

    public TickNormal(int c�digoh, int c�digopeli, int c�digot, int n�msala,
                      int n�msucur, String rutc) {
        this.c�digoh = c�digoh;
        this.c�digopeli = c�digopeli;
        this.c�digot = c�digot;
        this.n�msala = n�msala;
        this.n�msucur = n�msucur;
        this.rutc = rutc;
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

    public int getC�digot() {
        return c�digot;
    }

    public void setC�digot(int c�digot) {
        this.c�digot = c�digot;
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

    public String getRutc() {
        return rutc;
    }

    public void setRutc(String rutc) {
        this.rutc = rutc;
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
        buffer.append("c�digot=");
        buffer.append(getC�digot());
        buffer.append(',');
        buffer.append("n�msala=");
        buffer.append(getN�msala());
        buffer.append(',');
        buffer.append("n�msucur=");
        buffer.append(getN�msucur());
        buffer.append(',');
        buffer.append("rutc=");
        buffer.append(getRutc());
        buffer.append(']');
        return buffer.toString();
    }
}
