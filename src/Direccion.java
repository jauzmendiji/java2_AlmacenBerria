public class Direccion {

	//añadid las propiedades convenientes
	private String ciudad;
	private int cp;
	private String calle;
	private int numero;
	
public Direccion(String linedDireccion, String separator) {
		
		String[] strArray = linedDireccion.split(separator);
		
		this.setCiudad(strArray[1]);
		this.setCP(Integer.parseInt(strArray[2]));
		this.setCalle(strArray[3]);
		this.setNumero(Integer.parseInt(strArray[4]));
	}

	//métodos getter y setter
	public void setCiudad (String ciu){
		ciudad = ciu;
	}
	public String getCiudad(){
		return ciudad;
	}
	public void setCP (int cpc){
		cp = cpc;
	}
	public int getCP(){
		return cp;
	}
	public void setCalle (String parte2){
		calle = parte2;
	}
	public String getCalle(){
		return calle;
	}
	public void setNumero (int num){
		numero = num;
	}
	public int getNumero(){
		return numero;
	}
	public String formattedDireccion() {
		String formattedDireccion = 
				"DIRECCION:\n" +
				this.ciudad + " " + 
				this.cp + " " + 
				this.calle + " " +
				this.numero + " ";
				
				return formattedDireccion;
	}
	

}