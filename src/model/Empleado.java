package model;
import java.util.Date;

import main.Main;

public class Empleado {
    private String direccion;
    private Date fechaNacimiento;
    private String fono;
    private String mail;
    private String nombre;
    private String numsucursal;
    private Sucursal sucursal;
    private String rute;
    private String rutsupervisor;
    private Empleado supervisor;

	public Empleado() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Mapper.toDate(fechaNacimiento);
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumsucursal() {
        return numsucursal;
    }

    public void setNumsucursal(String numsucursal) {
    	this.numsucursal = numsucursal;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}

    public String getRutsupervisor() {
        return rutsupervisor;
    }

    public void setRutsupervisor(String rutsupervisor) {
        this.rutsupervisor = rutsupervisor;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("direccion=");
        buffer.append(getDireccion());
        buffer.append(',');
        buffer.append("fechaNacimiento=");
        buffer.append(getFechaNacimiento());
        buffer.append(',');
        buffer.append("fono=");
        buffer.append(getFono());
        buffer.append(',');
        buffer.append("mail=");
        buffer.append(getMail());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("numsucursal=");
        buffer.append(getNumsucursal());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(',');
        buffer.append("rutsupervisor=");
        buffer.append(getRutsupervisor());
        buffer.append(']');
        return buffer.toString();
    }

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
}
