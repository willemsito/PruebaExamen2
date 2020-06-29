package ufv.dis.final2020.WvVSP1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void creacionpro() {
		Producto u = new Producto("Zapatillas", "Calzado", (float)23.43, "8925921211552");
		Inventario inventario = new Inventario();
		inventario.addPro(u);
		
		assertEquals("Zapatillas", u.getNombre());
	}

	@org.junit.Test
	public void adicionpro() {
		Producto u = new Producto("Zapatillas", "Calzado", (float)23.43, "8925921211552");
		Inventario inventario = new Inventario();
		inventario.addPro(u);
		
		assertEquals(1, inventario.getListSize());
	}
	
	@org.junit.Test
	public void eliminarpro() {
		Producto u = new Producto("Zapatillas", "Calzado", (float)23.43, "8925921211552");
		Inventario inventario = new Inventario();
		inventario.addPro(u);
		inventario.deletePro(u);
		
		assertEquals(0, inventario.getListSize());
	}
	
}
