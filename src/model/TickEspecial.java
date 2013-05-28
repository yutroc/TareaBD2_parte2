package model;
public class TickEspecial {
    private int c�digoh;
    private int c�digopeli;
    private int c�digot;
    private String formaCompra;
    private int n�msala;
    private int n�msucur;
    private String premium;
    private int puntoSumado;
    private String rutc;

    public TickEspecial() {
    }

    public TickEspecial(int c�digoh, int c�digopeli, int c�digot, String formaCompra,
                        int n�msala, int n�msucur, String premium, int puntoSumado, String rutc) {
        this.c�digoh = c�digoh;
        this.c�digopeli = c�digopeli;
        this.c�digot = c�digot;
        this.formaCompra = formaCompra;
        this.n�msala = n�msala;
        this.n�msucur = n�msucur;
        this.premium = premium;
        this.puntoSumado = puntoSumado;
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

    public String getFormaCompra() {
        return formaCompra;
    }

    public void setFormaCompra(String formaCompra) {
        this.formaCompra = formaCompra;
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

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public int getPuntoSumado() {
        return puntoSumado;
    }

    public void setPuntoSumado(int puntoSumado) {
        this.puntoSumado = puntoSumado;
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
        buffer.append("formaCompra=");
        buffer.append(getFormaCompra());
        buffer.append(',');
        buffer.append("n�msala=");
        buffer.append(getN�msala());
        buffer.append(',');
        buffer.append("n�msucur=");
        buffer.append(getN�msucur());
        buffer.append(',');
        buffer.append("premium=");
        buffer.append(getPremium());
        buffer.append(',');
        buffer.append("puntoSumado=");
        buffer.append(getPuntoSumado());
        buffer.append(',');
        buffer.append("rutc=");
        buffer.append(getRutc());
        buffer.append(']');
        return buffer.toString();
    }
}
