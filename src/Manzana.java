import java.util.*;
import java.io.*;

public class Manzana extends Producto{
	//propiedades
	private String tipoManzana;
	private String color;
	
	public Manzana(Distribuidor distribuidor, String marca, Double precio, String procedencia, String tipo, String color) {

		super(distribuidor,marca,precio,procedencia);
		this.tipoManzana = tipo;
		this.color = color;
	}
	
	public Manzana(Scanner sc) {

		super(sc);
		System.out.println("Tipo de manzana (DELICIOUS-GOLDEN-RED):");
		this.setTipoManzana(sc.next());
	    System.out.println("Color de la manzana:");
	    this.setColor(sc.next());
		
	}


	//métodos getter y setter
	public void setTipoManzana (String tm){
		tipoManzana = tm;
	}
	public String getTipoManzana(){
		return tipoManzana;
	}
	public void setProcedencia (String pro){
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
	public void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}
	
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
    static ArrayList<String> distribuman = new ArrayList<String>();
	
	public static void insertarManzana(){
		
		Manzana manzana = new Manzana();
		System.out.println("Tipo de manzana: ");
		manzana.setTipoManzana(sc.next());
		System.out.println("Procedencia de la manzana: ");
		manzana.setProcedencia(sc.next());
		System.out.println("Color de la manzana: ");
		manzana.setColor(sc.next());
		System.out.println("Cantidad de kilos de manzanas: ");
		manzana.setEurosKilo(sc.nextDouble());
		System.out.println("Nombre del distribuidor de la manzana: ");
		String di = sc.next();
		System.out.println("Numero de codigo de barras: ");
		manzana.setCod_Barras(sc.nextInt());
		distribuman.add(di);
		manzanas.add(manzana);
	}
	
	static ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
	
	public static void imprimirManzana(){
		
		System.out.println(" \n\n----------- MANZANA --------------" );
		for (int m=0 ; m < manzanas.size(); m++){
			System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipoManzana() );
            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
            System.out.println(" \nEuros Kilo: "+manzanas.get(m).getEurosKilo());
           
	        for(int d=0; d<distribuidores.size(); d++)
        	{
        		if (distribuman.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
            	System.out.println("  ------------ Distribuidor ------------");
            	
            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
            		//---
            		System.out.println(" \n 	Direccion:" );
            		System.out.println(" \n     	- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
            		System.out.println(" \n     	- Territorio: "+ distribuidores.get(d).getDireccion().getCP());
            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getNumero());
            		//---
            		System.out.println(" \n 	Contacto: " );
            		System.out.println(" \n    		- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
            		System.out.println(" \n    		- DNI: "+ distribuidores.get(d).getPersonaContacto().getDNI());
            		System.out.println(" \n     	- Mail: "+ distribuidores.get(d).getPersonaContacto().getEmail());
            		}
        	}
	}
	}
}