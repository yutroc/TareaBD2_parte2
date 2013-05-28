package model;
public class EncargadoSucursal {
    private int fonoFijo;
    private int oficina;
    private String profesión;
    private String rute;

    public EncargadoSucursal() {
    }

    public EncargadoSucursal(int fonoFijo, int oficina, String profesión, String rute) {
        this.fonoFijo = fonoFijo;
        this.oficina = oficina;
        this.profesión = profesión;
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

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
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
        buffer.append("profesión=");
        buffer.append(getProfesión());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
