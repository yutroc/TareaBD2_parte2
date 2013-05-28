package model;
public class Sala3d {
    private int numLentes;
    private int númerosa;
    private int númerosu;

    public Sala3d() {
    }

    public Sala3d(int numLentes, int númerosa, int númerosu) {
        this.numLentes = numLentes;
        this.númerosa = númerosa;
        this.númerosu = númerosu;
    }

    public int getNumLentes() {
        return numLentes;
    }

    public void setNumLentes(int numLentes) {
        this.numLentes = numLentes;
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

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("numLentes=");
        buffer.append(getNumLentes());
        buffer.append(',');
        buffer.append("númerosa=");
        buffer.append(getNúmerosa());
        buffer.append(',');
        buffer.append("númerosu=");
        buffer.append(getNúmerosu());
        buffer.append(']');
        return buffer.toString();
    }
}
