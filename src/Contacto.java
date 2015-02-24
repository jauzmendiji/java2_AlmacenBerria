public class Contacto {

	//añadid las propiedades convenientes
	private String nombre;
	private String apellido;
	private String email;
	private String dni;
	private Direccion direccion;
	
	public Contacto(String linedContacto, String separator) {

		String[] strArray = linedContacto.split(separator);
		
		this.setNombre(strArray[0]);
		this.setApellido(strArray[1]);
		this.setEmail(strArray[2]);
		this.setDNI(strArray[3]);
		this.setDireccion(new Direccion(strArray[4],"-"));
		
	}
	
	//métodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellido (String ape){
		apellido = ape;
	}
	public String getApellido(){
		return apellido;
	}
	
	public void setEmail (String em){
		email = em;
	}
	public String getEmail(){
		return email;
	}
	public void setDNI (String dnic){
		dni = dnic;
	}
	public String getDNI(){
		return dni;
	}
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String formattedContacto() {
		String formattedContacto = 
				"NOMBRE Y APELLIDO:" +	this.nombre + " " + this.apellido + "\n" +
				"Email:" + this.email + "\n" +
			    "DNI:" + this.dni + "\n" +
				this.direccion.formattedDireccion();
				
				return formattedContacto;
	}

}