//Hau nire programa da, Cesta gabe ina
import java.util.*;
import java.io.*;

public class Almacen {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);
		
		Distribuidores.leerDist(null);

		int seleccion;
		do {
			
			//Visualiza por terminal (stdout) las opciones del men�
			System.out.println("Mostrar distribuidores---------------------------1");
			System.out.println("Solicitar productos------------------------------2");
			System.out.println("Mostrar productos--------------------------------3");
			System.out.println("SALIR DEL PROGRAMA-------------------------------4");
			   
			seleccion = sc.nextInt();
			switch (seleccion) {
				
				case 1: //Mostrar distribuidores
					Distribuidores.mostrarDist();
					break;
					
				case 2: //Solicitar productos
					productos = new Productos(sc);
					break;
				case 3: //Mostrar productos
					if (productos == null) {
						System.out.println("No es posible mostrar productos sin haber sido solicitados");
					}
					Productos.mostrarProductos();
					break;
				case 4: //Salimos
					break;
				default:
					System.out.println("No ha insertado la opcion correcta");
			}
		} while (seleccion != 4);
		System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
		sc.close();

		
		
		 System.out.println("Introducir de productos: \n\n");
			        
	        //-----------------Introducccion de datos de las manzanas------------------
		 System.out.println("Cuantas manazanas quieres introducir: \n");
		 int cantman = sc.nextInt();
		 for ( int i=0; i<cantman; i++ ){
	      Manzana.insertarManzana();}
			//-----------------Introducccion de datos de la leche------------------
	      System.out.println("Cuantas leches quieres introducir: \n");
	      int cantleche = sc.nextInt();
	      for ( int x=0; x<cantleche; x++ ){
	      Leche.insertarLeche();
			//-----------------Introducccion de datos de las lechugas ------------------
	      System.out.println("Cuantas lechugas quieres introducir: \n");
	      int cantlechu = sc.nextInt();
	      for ( int z=0; z<cantlechu; z++ ){
	      Lechuga.insertarLechuga();}
			
			//---------impresion de las manzanas con sus respectivos distribuidores-------------
	      Manzana.imprimirManzana();
	        //---------impresion de la leche con sus respectivos distribuidores-------------
	      Leche.imprimirLeche();
			//---------impresion de las lechugas con sus respectivos distribuidores-------------
	    	  Lechuga.imprimirLechuga();

	    //-----------------clientes-------------------------------------------------------------------------------

	    //--lectura de fichero de clientes
	    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	    try{
			String ruta2 = "/home/zubiri/proyectojava/java2/java2_AlmacenBerria/src/clientes.txt";
 			File archivo3 = new File(ruta2);
			FileReader leer3 = new FileReader (archivo3);
			BufferedReader bf3 = new BufferedReader(leer3);
			String salida3 = bf3.readLine();

			

	       
	        while(salida3!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	String [] cortarString4 = salida3.split(";");
	         	

	       		Cliente cliente = new Cliente();
	       		String [] cortarString5 = cortarString4[0].split(",");
	       		cliente.setNombre (cortarString5[0]);
	       		cliente.setApellidos (cortarString5[1]);
	       		cliente.setDNI (cortarString5[2]);
	       		cliente.setNum_Socio (Double.parseDouble(cortarString5[3]));
	       		cliente.setDto (Double.parseDouble(cortarString5[4]));
	       		
	       		
	       		Direccion direccionc = new Direccion();
	       		String [] cortarString6 = cortarString4[1].split(",");
	       		direccionc.setCiudad  (cortarString6[0]);
	       		direccionc.setCalle  (cortarString6[1]);
	       		direccionc.setNumero  (Integer.parseInt(cortarString6[2]));
	       		direccionc.setCP  (Integer.parseInt(cortarString6[3]));
	       		cliente.setDireccion(direccionc);
	       		
	       		
	       		clientes.add(cliente);
	       		

	       		
	       		
	       		salida3 = bf3.readLine();
	        }
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
	    
	    //---------------Impresion de la lista de clientes-----------------
	    System.out.println("  -------------- CLIENTES -----------");
	    for (int cli=0 ; cli < clientes.size(); cli++){

				System.out.println(" \n\n- Nombre: "+clientes.get(cli).getNombre() );
	            System.out.println(" \n- Apellidos: "+clientes.get(cli).getApellidos());
	            System.out.println(" \n- DNI : "+clientes.get(cli).getDNI() );
	            System.out.println(" \n- Numero de socio: "+clientes.get(cli).getNum_Socio());
	            System.out.println(" \n- Descuento "+clientes.get(cli).getDto());
	    }
	}
}
}
/*
import java.util.*;
import java.io.*;

public class Almacen {
	public static void main(String[] args) throws IOException {
		try {
			
			Distribuidor.leerDist();
			Cliente.leerCli();
			
			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			
			//ArrayList<Producto> aproducto = new ArrayList<Producto>();
			ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			String nombred;
			Manzana manzana = new Manzana();
			//tipo de manzana
			manzana.setTipoManzana("Golden");
			//procedencia
			manzana.setProcedencia("EEUU");
			//color
			manzana.setColor("Verde");
			//precio
			manzana.setEurosKilo(3.0);
			//codigo de barras
			manzana.setCod_Barras(1001);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana);
			//System.out.println(manzana);

			Manzana manzana2 = new Manzana();
			//tipo de manzana
			manzana2.setTipoManzana("Red");
			//procedencia
			manzana2.setProcedencia("España");
			//color
			manzana2.setColor("Rojo");
			//precio
			manzana2.setEurosKilo(2.0);
			//codigo de barras
			manzana2.setCod_Barras(1002);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana2.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana2);
			//System.out.println(manzana);

			ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
			Lechuga lechuga = new Lechuga();
			//Tipo de lechuga
			lechuga.setTipoLechuga("Normal");
			//procedencia
			lechuga.setProcedencia("francia");
			//color
			lechuga.setColor("verde");
			//precio
			lechuga.setEurosUnidad(1.0);
			//codigo de barras
			lechuga.setCod_Barras(2001);
			//distribuidor
			nombred = "telmo";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					lechuga.setDistribuidor(distribuidores.get(i));
				}
			}
			alechuga.add(lechuga);


			ArrayList<Leche> aleche = new ArrayList<Leche>();
			Leche leche = new Leche();
			//Tipo de leche
			leche.setTipo("vaca");
			//Procedencia
			leche.setProcedencia("Asturias");
			//precio
			leche.setEurosLitro(1.0);
			//codigo de barras
			leche.setCod_Barras(3001);
			//distribuidor
			nombred = "jon";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					leche.setDistribuidor(distribuidores.get(i));
				}
			}
			aleche.add(leche);

			Scanner sc = new Scanner(System.in);
			int socio;
			int cant_prod;
			int cod_barras;
			Double ptotal = 0.0;
			Double mtotal = 0.0;
			Double lutotal = 0.0;
			Double letotal = 0.0;
			Double desc;
			Cesta cesta = new Cesta();
			System.out.println("Introduce tu número de socio: ");
			socio = sc.nextInt();
			System.out.println("¿Cuantos productos quieres añadir?");
			cant_prod = sc.nextInt();
			for (int c = 0; c < cant_prod; c++) {
				System.out.println("Introduce el código de barras del producto: ");
				cod_barras = sc.nextInt();
				ArrayList<Cesta> acesta = new ArrayList<Cesta>();
				for (int m = 0; m < amanzana.size(); m++) {
					if(cod_barras == amanzana.get(m).getCod_Barras()){
						cesta.setAmanzana(amanzana);
						acesta.add(cesta);
						mtotal = mtotal + amanzana.get(m).getEurosKilo();
						//System.out.println(mtotal);
					}
					//System.out.println(ptotal);
				}
				for (int le = 0; le < alechuga.size(); le++) {
					if(cod_barras == alechuga.get(le).getCod_Barras()){
						cesta.setAlechuga(alechuga);
						acesta.add(cesta);
						lutotal = lutotal + alechuga.get(le).getEurosUnidad();
						//System.out.println(lutotal);
					}
					//System.out.println(ptotal);
				}
				for (int lee = 0; lee < aleche.size(); lee++) {
					if(cod_barras == aleche.get(lee).getCod_Barras()){
						cesta.setAleche(aleche);
						acesta.add(cesta);
						letotal = letotal + aleche.get(lee).getEurosLitro();
						//System.out.println(letotal);
					}
				}	
				ptotal = mtotal + lutotal + letotal;
				//System.out.println(ptotal);			
			}
			System.out.println("El precio total sin el descuento es: " + ptotal);

			/*for (int so = 0; so < clientes.size(); so++){
				if(socio == clientes.get(so).getNum_Socio()){
					desc = clientes.get(so).getDto();
					ptotal = ptotal - ((ptotal*desc)/100);
					System.out.println("Tu descuento es del " + desc + "%");
				}
			}
		
			System.out.println("El precio total con el descuento es: " + ptotal);
			


			//EZ BORRATU EZER!!!! Odeiena da, Cesta biok egin genuen eta bere aldagaik dozte.

			
			//13 Ariketararte
			File archivo2 = new File("./clientes.txt");
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
				direccion.setPoblacion(partec2[0]);
				direccion.setLocalidad(partec2[1]);
				direccion.setCalle(partec2[2]);
				direccion.setNumero(Integer.parseInt(partec2[3]));
				cliente.setDireccion(direccion);
				clientes.add(cliente);
				linea2 = br2.readLine();
			}
			Iterator<Cliente> itrCliente = clientes.iterator();
			while(itrCliente.hasNext()){
				Cliente clien = itrCliente.next();
				
				System.out.println("********Cliente********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + clien.getNombre());
				System.out.println("Apellidos: " + clien.getApellidos());
				System.out.println("DNI: " + clien.getDNI());
				System.out.println("Número de socio: " + clien.getNum_Socio());
				System.out.println("Descuento: " + clien.getDto());
				System.out.println("--Direccion--");
				System.out.println("Población: " + clien.getDireccion().getPoblacion());
				System.out.println("Localidad: " + clien.getDireccion().getLocalidad());
				System.out.println("Calle: " + clien.getDireccion().getCalle());
				System.out.println("Número: " + clien.getDireccion().getNumero());
				System.out.println();
				
			}




			/*
			//12 ariketararte
			File archivo = new File("./distribuidores.txt");
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
				parte1 = parte[0].split(",");
				distribuidor.setNombre(parte1[0]);
				distribuidor.setCif(parte1[1]);
				parte2 = parte[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(parte2[0]);
				direccion.setLocalidad(parte2[1]);
				direccion.setCalle(parte2[2]);
				direccion.setNumero(Integer.parseInt(parte2[3]));
				distribuidor.setDireccion(direccion);
				parte3 = parte[2].split(",");
				Contacto contacto = new Contacto();
				contacto.setNombre(parte3[0]);
				contacto.setApellido(parte3[1]);
				contacto.setEmail(parte3[2]);
				contacto.setTelefono(Integer.parseInt(parte3[3]));
				distribuidor.setPersonaContacto(contacto);
				distribuidores.add(distribuidor);
				linea = br.readLine();
			}
			*/

			/*
			//12 ariketa
			ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			Scanner scm = new Scanner(System.in);
			String nombred;
			for (int m = 0; m < 2; m++) {
				Manzana manzana = new Manzana();
				System.out.println("Tipo de manzana:");
				manzana.setTipoManzana(scm.next());
				System.out.println("Procedencia: ");
				manzana.setProcedencia(scm.next());
				System.out.println("Color: ");
				manzana.setColor(scm.next());
				System.out.println("Precio (€ por Kg): ");
				manzana.setEurosKilo(scm.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = scm.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						manzana.setDistribuidor(distribuidores.get(i));
					}
				}
				amanzana.add(manzana);
			}
			ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
			Scanner sclu = new Scanner(System.in);
			for (int m = 0; m < 1; m++) {
				Lechuga lechuga = new Lechuga();
				System.out.println("Tipo de lechuga:");
				lechuga.setTipoLechuga(sclu.next());
				System.out.println("Procedencia: ");
				lechuga.setProcedencia(sclu.next());
				System.out.println("Color: ");
				lechuga.setColor(sclu.next());
				System.out.println("Precio (€ por unidad): ");
				lechuga.setEurosUnidad(sclu.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = sclu.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						lechuga.setDistribuidor(distribuidores.get(i));
					}
				}
				alechuga.add(lechuga);
			}
			ArrayList<Leche> aleche = new ArrayList<Leche>();
			Scanner scle = new Scanner(System.in);
			for (int m = 0; m < 2; m++) {
				Leche leche = new Leche();
				System.out.println("Tipo de leche:");
				leche.setTipo(scle.next());
				System.out.println("Procedencia: ");
				leche.setProcedencia(scle.next());
				System.out.println("Precio (€ por L): ");
				leche.setEurosLitro(scle.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = scle.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						leche.setDistribuidor(distribuidores.get(i));
					}
				}
				aleche.add(leche);
			}
			Iterator<Manzana> itrManzana = amanzana.iterator();
			while(itrManzana.hasNext()){
				Manzana manza = itrManzana.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de manzana: " + manza.getTipoManzana());
				System.out.println("Procedencia: " + manza.getProcedencia());
				System.out.println("Color: " + manza.getColor());
				System.out.println("Precio (€ por Kg): " + manza.getEurosKilo());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + manza.getDistribuidor().getNombre());
				System.out.println("CIF: " + manza.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + manza.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + manza.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + manza.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + manza.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + manza.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + manza.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + manza.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + manza.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			Iterator<Lechuga> itrLechuga = alechuga.iterator();
			while(itrLechuga.hasNext()){
				Lechuga lechu = itrLechuga.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de lechuga: " + lechu.getTipoLechuga());
				System.out.println("Procedencia: " + lechu.getProcedencia());
				System.out.println("Color: " + lechu.getColor());
				System.out.println("Precio (€ por unidad): " + lechu.getEurosUnidad());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getNombre());
				System.out.println("CIF: " + lechu.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + lechu.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + lechu.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + lechu.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + lechu.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + lechu.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + lechu.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + lechu.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			Iterator<Leche> itrLeche = aleche.iterator();
			while(itrLeche.hasNext()){
				Leche leche = itrLeche.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de leche: " + leche.getTipo());
				System.out.println("Procedencia: " + leche.getProcedencia());
				System.out.println("Precio (€ por L): " + leche.getEurosLitro());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + leche.getDistribuidor().getNombre());
				System.out.println("CIF: " + leche.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + leche.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + leche.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + leche.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + leche.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + leche.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + leche.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + leche.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + leche.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}*/


			/*
			//11 arriketa
			Iterator<Distribuidor> itrDistribuidor = distribuidores.iterator();
			while(itrDistribuidor.hasNext()){
				Distribuidor distri = itrDistribuidor.next();
				
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + distri.getNombre());
				System.out.println("CIF: " + distri.getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + distri.getDireccion().getPoblacion());
				System.out.println("Localidad: " + distri.getDireccion().getLocalidad());
				System.out.println("Calle: " + distri.getDireccion().getCalle());
				System.out.println("Número: " + distri.getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + distri.getPersonaContacto().getNombre());
				System.out.println("Apellido: " + distri.getPersonaContacto().getApellido());
				System.out.println("E-mail: " + distri.getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + distri.getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			


			 } catch (IOException ioe) {
			System.out.println("Error: " + ioe);
		}
	}
}*/
