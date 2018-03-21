package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		// fail("Not yet implemented");
		Mesa mesa = new Mesa();
		assertEquals("Patas deberían ser 4 por defecto", 4, mesa.getNumeroPatas());// Primer mensaje personalizado en
																					// caso de que falle
		assertEquals("blanco", mesa.getColor());
		assertEquals(1, mesa.getDimension());
		assertEquals(Mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testSetNumeroPatas() {
		Mesa mesa = new Mesa();
		mesa.setNumeroPatas(5);
		assertEquals(5, mesa.getNumeroPatas());
		mesa.setNumeroPatas(0);
		assertEquals(1, mesa.getNumeroPatas());
		mesa.setNumeroPatas(-5);
		assertEquals(1, mesa.getNumeroPatas());

	}

	@Test
	public void testGetPrecio() {
		int precio = 0;
		Mesa mesa = new Mesa();
		assertEquals(13, mesa.Suma());
		mesa.setMaterial(Mesa.MATERIAL_ACERO);
		precio = 13 - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.Suma());

	}

	@Test
	public void comparar() {

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa();// AL no apuntar al mismo espacio de memoria son distintos
	}

}
