package model;
public class EncargadoSucursal {
    private int fonoFijo;
    private int oficina;
    private String profesion;
    private String rute;

    public EncargadoSucursal() {
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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
        buffer.append("profesion=");
        buffer.append(getProfesion());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
