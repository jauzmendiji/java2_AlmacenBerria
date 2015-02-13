import java.util.ArrayList;
import java.util.Scanner;

public class Leche {

	//propiedades
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	public void setTipo (String tip){
		tipo = tip;
	}
	public String getTipo(){
		return tipo;
	}
	public void setProcedencia (String pro){
		procedencia = pro;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public void setEurosLitro (Double el){
		eurosLitro = el;
	}
	public Double getEurosLitro(){
		return eurosLitro;
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
	static ArrayList<Leche> leches = new ArrayList<Leche>();
    static ArrayList<String> distribuleche = new ArrayList<String>();
	
	
	public static void insertarLeche(){
				

		System.out.println("----> Datos de la leche ------------ ");
		Leche leche = new Leche();
		System.out.println("Introduce el tipo de leche: ");
		leche.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la leche: ");
		leche.setProcedencia(sc.next());
		System.out.println("Introduce la cantidad de litros de leche: ");
		leche.setEurosLitro(sc.nextDouble());
		System.out.println("Introduce el nombre del distribuidor de la leche: ");
		String dl = sc.next();
		System.out.println("Numero de codigo de barras: ");
		leche.setCod_Barras(sc.nextInt());
		distribuleche.add(dl);
		leches.add(leche);
	
	}
	
	static ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
	
	public static void imprimirLeche(){
		
	    System.out.println(" \n\n----------- LECHE --------------" );
				for (int m=0 ; m < leches.size(); m++){
					System.out.println(" \n\nTipo de leche: "+leches.get(m).getTipo() );
		            System.out.println(" \nProcedencia: "+leches.get(m).getProcedencia());
		            System.out.println(" \nEuros Litro: "+leches.get(m).getEurosLitro());
		           
			        for(int d=0; d<distribuleche.size(); d++)
		        	{
		        		if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
		            	System.out.println("  ------------- Distribuidor -----------");
		            	
		            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
		            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
		            		//---
		            		System.out.println(" \n 	Direccion:" );
		            		System.out.println(" \n     	- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
		            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
		            		System.out.println(" \n     	- Portal: "+ distribuidores.get(d).getDireccion().getNumero());
		            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getCP());
		            		//---
		            		System.out.println(" \n 	Contacto: " );
		            		System.out.println(" \n    		- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
		            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
		            		System.out.println(" \n     	- DNI: "+ distribuidores.get(d).getPersonaContacto().getDNI());
		            		System.out.println(" \n     	- Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
		            		}
		        	}	
			    }
	}
}