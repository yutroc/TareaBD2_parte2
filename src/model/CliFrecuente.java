package model;
import java.util.Date;


public class CliFrecuente {
    private String celular;
    private Date fechaNacimiento;
    private String rutc;
    private Cliente cliente;

    public CliFrecuente() {
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Mapper.toDate(fechaNacimiento);
    }

    public String getRutc() {
        return rutc;
    }

    public void setRutc(String rutc) {
        this.rutc = rutc;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("celular=");
        buffer.append(getCelular());
        buffer.append(',');
        buffer.append("fechaNacimiento=");
        buffer.append(getFechaNacimiento());
        buffer.append(',');
        buffer.append("rutc=");
        buffer.append(getRutc());
        buffer.append(']');
        return buffer.toString();
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
