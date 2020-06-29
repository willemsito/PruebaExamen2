package ufv.dis.final2020.WvVSP1;

import java.io.IOException;
import java.util.ArrayList;

import com.google.zxing.WriterException;

public class Inventario {

	private ArrayList <Producto> productos;
	
	public Inventario() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void addPro (Producto u) {
		this.productos.add(u);
		try {
			GeneradorEAN13.generarEAN(u);
		} catch (WriterException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void deletePro (Producto u) {
		this.productos.remove(u);
	}
	
	public boolean checkExiste (Producto u) {
		return this.productos.contains(u);
	}
	
	public int getListSize() {
		return productos.size();
	}
	
}
