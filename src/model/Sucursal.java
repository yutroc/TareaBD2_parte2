package model;
public class Sucursal {
	
	private String calle;
    private String comuna;
    private String nombre;
    private int numerocalle;
    private int numerosu;
    private String region;
    private EncargadoSucursal encargado;
    private String rutEncargado;

    public String getRutEncargado() {
        return rutEncargado;
    }

    public Sucursal() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerocalle() {
        return numerocalle;
    }

    public void setNumerocalle(String numerocalle) {
        this.numerocalle = Integer.parseInt(numerocalle);
    }

    public int getNumerosu() {
        return numerosu;
    }

    public void setNumerosu(String numerosu) {
        this.numerosu = Integer.parseInt(numerosu);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public void setRutEncargado(String r){
    	this.rutEncargado = r;
    }

    public EncargadoSucursal getEncargado() {
		return encargado;
	}

	public void setEncargado(EncargadoSucursal encargado) {
		this.encargado = encargado;
	}


    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("calle=");
        buffer.append(getCalle());
        buffer.append(',');
        buffer.append("comuna=");
        buffer.append(getComuna());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("numerocalle=");
        buffer.append(getNumerocalle());
        buffer.append(',');
        buffer.append("numerosu=");
        buffer.append(getNumerosu());
        buffer.append(',');
        buffer.append("region=");
        buffer.append(getRegion());
        buffer.append(',');
        buffer.append("rutEncargado=");
        buffer.append(getEncargado());
        buffer.append(']');
        return buffer.toString();
    }
}
