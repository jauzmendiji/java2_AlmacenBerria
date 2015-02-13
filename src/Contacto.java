public class Contacto {

	//añadid las propiedades convenientes
	private String nombre;
	private String apellido;
	private String email;
	private String dni;
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

}