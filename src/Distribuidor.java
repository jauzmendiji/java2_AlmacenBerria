import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Distribuidor {
	//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCif (String cf){
		cif = cf;
	}
	public String getCif(){
		return cif;
	}
	public void setDireccion (Direccion dir){
		direccion = dir;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	public Contacto getPersonaContacto(){
		return personaContacto;
	}
	
		
	public Distribuidor() {
		
	}
	
	public Distribuidor(String linedDistribuidor, String separator) {
		
		
		String[] strArray = linedDistribuidor.split(separator);
		this.setNombre(strArray[0]);
		this.setCif(strArray[1]);
		this.setDireccion(new Direccion(strArray[2],";"));
		this.setPersonaContacto(new Contacto(strArray[3],";"));
	}
	public String formattedDistribuidor() {
		String distribuidorStr = 
				"NOMBRE DISTRIBUIDOR:" + this.nombre + "\n" + 
				"CIF:" + this.cif  + "\n" + 
				"\t" + this.direccion.formattedDireccion() + "\n" +
				"\t" + this.personaContacto.formattedContacto() + "\n";
				
				return distribuidorStr;
	}
}