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
	
		
	public final static void leerDist() throws IOException{
		
		File archivo = new File("/home/zubiri/proyectojava/java2/java2_AlmacenBerria/src/distribuidores.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		String [] parte = null;
		String [] parte1 = null;
		String [] parte2 = null;
		String [] parte3 = null;
		while ((linea != null) || (linea == "")) {
			parte = linea.split(";");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(parte[0]);
			distribuidor.setCif(parte[1]);

			parte2 = parte[2].split(",");
			Direccion direccion = new Direccion();
			direccion.setCiudad(parte2[0]);
			direccion.setCalle(parte2[1]);
			direccion.setNumero(Integer.parseInt(parte2[2]));
			direccion.setCP(Integer.parseInt(parte2[3]));
			distribuidor.setDireccion(direccion);

			parte3 = parte[3].split(",");
			Contacto contacto = new Contacto();
			contacto.setNombre(parte3[0]);
			contacto.setApellido(parte3[1]);
			contacto.setEmail(parte3[2]);
			contacto.setDNI(parte3[3]);
			distribuidor.setPersonaContacto(contacto);

			distribuidores.add(distribuidor);
			linea = br.readLine();
		}
		
	}
}