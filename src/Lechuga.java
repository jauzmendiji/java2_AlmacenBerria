import java.util.ArrayList;
import java.util.Scanner;

public class Lechuga {

	//propiedades
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	public void setTipoLechuga (String tl){
		tipoLechuga = tl;
	}
	public String getTipoLechuga(){
		return tipoLechuga;
	}
	public void setProcedencia (String pro){
		procedencia = pro;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public void setColor (String col){
		color = col;
	}
	public String getColor(){
		return color;
	}
	public void setEurosUnidad (Double eu){
		eurosUnidad = eu;
	}
	public Double getEurosUnidad(){
		return eurosUnidad;
	}
	public void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}
	public void setCod_Barras (Integer cb){
		cod_barras = cb;
	}
	public Integer getCod_Barras(){
		return cod_barras;
	}
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
    static ArrayList<String> distribulechu = new ArrayList<String>();
	
public static void insertarLechuga(){
		

	System.out.println("----> Datos de la lechuga ----------- ");
		for (int g=0 ; g<=0 ; g++){
	Lechuga lechuga = new Lechuga();
	System.out.println("Introduce el tipo de lechuga: ");
	lechuga.setTipoLechuga(sc.next());
	System.out.println("Introduce la procedencia de la lechuga: ");
	lechuga.setProcedencia(sc.next());
	System.out.println("Introduce el color de la lechuga: ");
	lechuga.setColor(sc.next());
	System.out.println("Introduce las unidades de lechuga: ");
	lechuga.setEurosUnidad(sc.nextDouble());
	System.out.println("Introduce el nombre del distribuidor de la lechuga: ");
	String dle = sc.next();
	System.out.println("Numero de codigo de barras: ");
	lechuga.setCod_Barras(sc.nextInt());
	distribulechu.add(dle);
	lechugas.add(lechuga);
		}
	}

	static ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

	public static void imprimirLechuga(){
	
		System.out.println(" \n\n----------- LECHUGA --------------" );
		for (int lechu=0 ; lechu < lechugas.size(); lechu++){
			System.out.println(" \n\nTipo de lechuga: "+lechugas.get(lechu).getTipoLechuga() );
            System.out.println(" \nProcedencia: "+lechugas.get(lechu).getProcedencia());
            System.out.println(" \nColor : "+lechugas.get(lechu).getColor() );
            System.out.println(" \nEuros Unidad: "+lechugas.get(lechu).getEurosUnidad());
           
	        for(int d=0; d<distribuidores.size(); d++)
        	{
        		if (distribulechu.get(lechu).equalsIgnoreCase(distribuidores.get(d).getNombre())){
            	System.out.println("  --------------Distribuidor-----------");
            	
            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
            		//---
            		System.out.println(" \n 	Direccion:" );
            		System.out.println(" \n    		- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
            		System.out.println(" \n     	- Portal: "+ distribuidores.get(d).getDireccion().getNumero());
            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getCP());
            		//---
            		System.out.println(" \n 	Contacto: " );
            		System.out.println(" \n     	- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
            		System.out.println(" \n     	- DNI: "+ distribuidores.get(d).getPersonaContacto().getDNI());
            		System.out.println(" \n     	- Mail: "+ distribuidores.get(d).getPersonaContacto().getEmail());
            		}
        	}
        }
	}
}