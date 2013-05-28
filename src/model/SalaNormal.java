package model;
public class SalaNormal {
    private int númerosa;
    private int númerosu;
    private String tipoSonido;

    public SalaNormal() {
    }

    public SalaNormal(int númerosa, int númerosu, String tipoSonido) {
        this.númerosa = númerosa;
        this.númerosu = númerosu;
        this.tipoSonido = tipoSonido;
    }


    public int getNúmerosa() {
        return númerosa;
    }

    public void setNúmerosa(int númerosa) {
        this.númerosa = númerosa;
    }

    public int getNúmerosu() {
        return númerosu;
    }

    public void setNúmerosu(int númerosu) {
        this.númerosu = númerosu;
    }

    public String getTipoSonido() {
        return tipoSonido;
    }

    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("númerosa=");
        buffer.append(getNúmerosa());
        buffer.append(',');
        buffer.append("númerosu=");
        buffer.append(getNúmerosu());
        buffer.append(',');
        buffer.append("tipoSonido=");
        buffer.append(getTipoSonido());
        buffer.append(']');
        return buffer.toString();
    }
}
