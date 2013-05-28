package model;
public class Cajero {
    private String antecedentes;
    private String rute;

    public Cajero() {
    }

    public Cajero(String antecedentes, String rute) {
        this.antecedentes = antecedentes;
        this.rute = rute;
    }


    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
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
        buffer.append("antecedentes=");
        buffer.append(getAntecedentes());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
