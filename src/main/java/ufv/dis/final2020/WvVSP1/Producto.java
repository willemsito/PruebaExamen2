package ufv.dis.final2020.WvVSP1;

public class Producto {

	private String Nombre;
	private String Categoria;
	private float Precio;
	private String EAN13;
	
	public Producto(String nombre, String categoria, float precio, String eAN13) {
		super();
		Nombre = nombre;
		Categoria = categoria;
		Precio = precio;
		EAN13 = eAN13;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	public String getEAN13() {
		return EAN13;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
	
	
}
