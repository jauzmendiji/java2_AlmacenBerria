import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cliente {
	//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private double num_socio;
	private Double dto;

	//métodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellidos (String ape){
		apellidos = ape;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setDNI (String dn){
		DNI = dn;
	}
	public String getDNI(){
		return DNI;
	}
	public void setDireccion (Direccion dir){
		direccion = dir;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setNum_Socio (double d){
		num_socio =  d;
	}
	public double getNum_Socio(){
		return num_socio;
	}
	public void setDto (Double dt){
		dto = dt;
	}
	public Double getDto(){
		return dto;
	}
	
	public static void leerCli() throws IOException{
		File archivo2 = new File("/home/zubiri/proyectojava/java2/ariketaAlmacen/src/clientes.txt");
		FileReader fr2 = new FileReader(archivo2);
		BufferedReader br2 = new BufferedReader(fr2);
		String linea2 = br2.readLine();

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String [] partec = null;
		String [] partec1 = null;
		String [] partec2 = null;
		while ((linea2 != null) || (linea2 == "")) {
			partec = linea2.split(";");
			Cliente cliente = new Cliente();
			partec1 = partec[0].split(",");
			cliente.setNombre(partec1[0]);
			cliente.setApellidos(partec1[1]);
			cliente.setDNI(partec1[2]);
			cliente.setNum_Socio(Integer.parseInt(partec1[3]));
			cliente.setDto(Double.parseDouble(partec1[4]));

			partec2 = partec[1].split(",");
			Direccion direccion = new Direccion();
			direccion.setCiudad(partec2[0]);
			direccion.setCalle(partec2[1]);
			direccion.setNumero(Integer.parseInt(partec2[3]));
			direccion.setCP(Integer.parseInt(partec2[4]));
			cliente.setDireccion(direccion);

			clientes.add(cliente);
			linea2 = br2.readLine();
		}
	}
}