package model;
public class TickNormal {
    private int codigoh;
    private int codigopeli;
    private int codigot;
    private int numsala;
    private int numsucur;
    private String rutc;

    public TickNormal() {
    }


    public int getCodigoh() {
        return codigoh;
    }

    public void setCodigoh(String codigoh) {
        this.codigoh = Integer.parseInt(codigoh);
    }

    public int getCodigopeli() {
        return codigopeli;
    }

    public void setCodigopeli(String codigopeli) {
        this.codigopeli =Integer.parseInt( codigopeli);
    }

    public int getCodigot() {
        return codigot;
    }

    public void setCodigot(String codigot) {
        this.codigot = Integer.parseInt(codigot);
    }

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(String numsala) {
        this.numsala =Integer.parseInt( numsala);
    }

    public int getNumsucur() {
        return numsucur;
    }

    public void setNumsucur(String numsucur) {
        this.numsucur = Integer.parseInt(numsucur);
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
        buffer.append("numsala=");
        buffer.append(getNumsala());
        buffer.append(',');
        buffer.append("numsucur=");
        buffer.append(getNumsucur());
        buffer.append(',');
        buffer.append("rutc=");
        buffer.append(getRutc());
        buffer.append(']');
        return buffer.toString();
    }
}
