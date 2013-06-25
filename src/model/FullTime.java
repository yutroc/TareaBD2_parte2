package model;
public class FullTime {
    private int bono;
    private String rute;
    private int sueldo;
    private Empleado empleado;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public FullTime() {
    }


    public int getBono() {
        return bono;
    }

    public void setBono(String bono) {
        this.bono = Integer.parseInt(bono);
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo =  Integer.parseInt(sueldo);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("bono=");
        buffer.append(getBono());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(',');
        buffer.append("sueldo=");
        buffer.append(getSueldo());
        buffer.append(']');
        return buffer.toString();
    }
}
