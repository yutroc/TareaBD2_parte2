package model;
import java.sql.Date;

public class Empleado {
    private String direcci�n;
    private Date fechaNacimiento;
    private String fono;
    private String mail;
    private String nombre;
    private int n�msucursal;
    private String rute;
    private String rutsupervisor;

    public Empleado() {
    }

    public Empleado(String direcci�n, Date fechaNacimiento, String fono, String mail, String nombre,
                    int n�msucursal, String rute, String rutsupervisor) {
        this.direcci�n = direcci�n;
        this.fechaNacimiento = fechaNacimiento;
        this.fono = fono;
        this.mail = mail;
        this.nombre = nombre;
        this.n�msucursal = n�msucursal;
        this.rute = rute;
        this.rutsupervisor = rutsupervisor;
    }

    public String getDirecci�n() {
        return direcci�n;
    }

    public void setDirecci�n(String direcci�n) {
        this.direcci�n = direcci�n;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public int getN�msucursal() {
        return n�msucursal;
    }

    public void setN�msucursal(int n�msucursal) {
        this.n�msucursal = n�msucursal;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
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
        buffer.append("direcci�n=");
        buffer.append(getDirecci�n());
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
        buffer.append("n�msucursal=");
        buffer.append(getN�msucursal());
        buffer.append(',');
        buffer.append("rute=");
        buffer.append(getRute());
        buffer.append(',');
        buffer.append("rutsupervisor=");
        buffer.append(getRutsupervisor());
        buffer.append(']');
        return buffer.toString();
    }
}
