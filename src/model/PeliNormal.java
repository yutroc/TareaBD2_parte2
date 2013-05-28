package model;
public class PeliNormal {
    private int código;
    private String resolución;

    public PeliNormal() {
    }

    public PeliNormal(int código, String resolución) {
        this.código = código;
        this.resolución = resolución;
    }


    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getResolución() {
        return resolución;
    }

    public void setResolución(String resolución) {
        this.resolución = resolución;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("código=");
        buffer.append(getCódigo());
        buffer.append(',');
        buffer.append("resolución=");
        buffer.append(getResolución());
        buffer.append(']');
        return buffer.toString();
    }
}
