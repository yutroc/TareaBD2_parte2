package model;
public class PartTime {
    private int honorarioPorHora;
    private String rute;

    public PartTime() {
    }

    public int getHonorarioPorHora() {
        return honorarioPorHora;
    }

    public void setHonorarioPorHora(int honorarioPorHora) {
        this.honorarioPorHora = honorarioPorHora;
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
        buffer.append("honorarioPorHora=");
        buffer.append(getHonorarioPorHora());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(']');
        return buffer.toString();
    }
}
