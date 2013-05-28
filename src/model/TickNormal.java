package model;
public class TickNormal {
    private int códigoh;
    private int códigopeli;
    private int códigot;
    private int númsala;
    private int númsucur;
    private String rutc;

    public TickNormal() {
    }

    public TickNormal(int códigoh, int códigopeli, int códigot, int númsala,
                      int númsucur, String rutc) {
        this.códigoh = códigoh;
        this.códigopeli = códigopeli;
        this.códigot = códigot;
        this.númsala = númsala;
        this.númsucur = númsucur;
        this.rutc = rutc;
    }


    public int getCódigoh() {
        return códigoh;
    }

    public void setCódigoh(int códigoh) {
        this.códigoh = códigoh;
    }

    public int getCódigopeli() {
        return códigopeli;
    }

    public void setCódigopeli(int códigopeli) {
        this.códigopeli = códigopeli;
    }

    public int getCódigot() {
        return códigot;
    }

    public void setCódigot(int códigot) {
        this.códigot = códigot;
    }

    public int getNúmsala() {
        return númsala;
    }

    public void setNúmsala(int númsala) {
        this.númsala = númsala;
    }

    public int getNúmsucur() {
        return númsucur;
    }

    public void setNúmsucur(int númsucur) {
        this.númsucur = númsucur;
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
        buffer.append("códigoh=");
        buffer.append(getCódigoh());
        buffer.append(',');
        buffer.append("códigopeli=");
        buffer.append(getCódigopeli());
        buffer.append(',');
        buffer.append("códigot=");
        buffer.append(getCódigot());
        buffer.append(',');
        buffer.append("númsala=");
        buffer.append(getNúmsala());
        buffer.append(',');
        buffer.append("númsucur=");
        buffer.append(getNúmsucur());
        buffer.append(',');
        buffer.append("rutc=");
        buffer.append(getRutc());
        buffer.append(']');
        return buffer.toString();
    }
}
