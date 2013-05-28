package model;
public class EncargadoSucursal {
    private int fonoFijo;
    private int oficina;
    private String profesi�n;
    private String rute;

    public EncargadoSucursal() {
    }

    public EncargadoSucursal(int fonoFijo, int oficina, String profesi�n, String rute) {
        this.fonoFijo = fonoFijo;
        this.oficina = oficina;
        this.profesi�n = profesi�n;
        this.rute = rute;
    }

    public int getFonoFijo() {
        return fonoFijo;
    }

    public void setFonoFijo(int fonoFijo) {
        this.fonoFijo = fonoFijo;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getProfesi�n() {
        return profesi�n;
    }

    public void setProfesi�n(String profesi�n) {
        this.profesi�n = profesi�n;
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
        buffer.append("fonoFijo=");
        buffer.append(getFonoFijo());
        buffer.append(',');
        buffer.append("oficina=");
        buffer.append(getOficina());
        buffer.append(',');
        buffer.append("profesi�n=");
        buffer.append(getProfesi�n());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
