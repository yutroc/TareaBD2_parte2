package model;
public class Cajero {
    private String antecedentes;
    private String rute;
    private Empleado empleado;

    public Cajero() {
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


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
}
