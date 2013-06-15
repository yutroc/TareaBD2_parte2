package model;
public class PartTime {
    private int honorarioPorHora;
    private String rute;
    private Empleado empleado;

    public PartTime() {
    }

    public int getHonorarioPorHora() {
        return honorarioPorHora;
    }

    public void setHonorarioPorHora(String honorarioPorHora) {
        this.honorarioPorHora = Integer.parseInt(honorarioPorHora);
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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
