package model;
public class TickEspecial {
    private int codigoh;
    private int codigopeli;
    private int codigot;
    private String formaCompra;
    private int numsala;
    private int numsucur;
    private String premium;
    private int puntoSumado;
    private String rutc;

    public TickEspecial() {
    }


    public int getCodigoh() {
        return codigoh;
    }

    public void setCodigoh(int codigoh) {
        this.codigoh = codigoh;
    }

    public int getCodigopeli() {
        return codigopeli;
    }

    public void setCodigopeli(int codigopeli) {
        this.codigopeli = codigopeli;
    }

    public int getCodigot() {
        return codigot;
    }

    public void setCodigot(int codigot) {
        this.codigot = codigot;
    }

    public String getFormaCompra() {
        return formaCompra;
    }

    public void setFormaCompra(String formaCompra) {
        this.formaCompra = formaCompra;
    }

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(int numsala) {
        this.numsala = numsala;
    }

    public int getNumsucur() {
        return numsucur;
    }

    public void setNumsucur(int numsucur) {
        this.numsucur = numsucur;
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
        buffer.append("codigoh=");
        buffer.append(getCodigoh());
        buffer.append(',');
        buffer.append("codigopeli=");
        buffer.append(getCodigopeli());
        buffer.append(',');
        buffer.append("codigot=");
        buffer.append(getCodigot());
        buffer.append(',');
        buffer.append("formaCompra=");
        buffer.append(getFormaCompra());
        buffer.append(',');
        buffer.append("numsala=");
        buffer.append(getNumsala());
        buffer.append(',');
        buffer.append("numsucur=");
        buffer.append(getNumsucur());
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
