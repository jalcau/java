package com.ipartek.formacion.capitulo4;

public class Pedido {
	public static void main(String[] args) {

		Hamburguesa h1 = new Hamburguesa("lechuga", "pepino", "queso");
		Hamburguesa h2 = new Hamburguesa("pepino");
		Hamburguesa h3 = new Hamburguesa();
		h1.CalcularPrecio();
		h2.CalcularPrecio();
		h3.CalcularPrecio();
	}
}
