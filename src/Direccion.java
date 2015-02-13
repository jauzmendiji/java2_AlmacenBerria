public class Direccion {

	//añadid las propiedades convenientes
	private String ciudad;
	private int cp;
	private String calle;
	private int numero;

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
	

}