import java.util.*;
public class Cesta {

	//propiedades
	//Cliente
	//ArrayList de cada producto
	ArrayList<Manzana> amanzana;
	ArrayList<Lechuga> alechuga;
	ArrayList<Leche> aleche;

	//métodos getter y setter
	public void setAmanzana (ArrayList<Manzana> manza){
		amanzana = manza;
	}
	public ArrayList<Manzana> getAmanzana(){
		return amanzana;
	}
	public void setAlechuga (ArrayList<Lechuga> lechu){
		alechuga = lechu;
	}
	public ArrayList<Lechuga> getAlechuga(){
		return alechuga;
	}
	public void setAleche (ArrayList<Leche> leche){
		aleche = leche;
	}
	public ArrayList<Leche> getAleche(){
		return aleche;
	}

	//método calcular importe compra

}
