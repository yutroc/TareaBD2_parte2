package model;
public class AdministradorDeExternos {
    private String nivelEducacional;
    private String rute;

    public AdministradorDeExternos() {
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
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
        buffer.append("nivelEducacional=");
        buffer.append(getNivelEducacional());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
