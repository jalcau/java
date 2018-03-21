package com.ipartek.formacion.capitulo4;

public class Hamburguesa {
	public static final float PRECIO_TOMATE = (float) 0.50;
	public static final float PRECIO_LECHUGA = (float) 0.30;
	public static final float PRECIO_PEPINO = (float) 0.50;
	public static final float PRECIO_QUESO = (float) 0.50;
	public static final float PRECIO_CARNE = (float) 0.70;
	public static final float PRECIO_PAN = (float) 0.30;
	public static final String[] aNombres = { "pan", "carne", "tomate", "lechuga", "pepino", "queso" };
	public static final float[] aPrecio = { 0.30f, 0.70f, PRECIO_TOMATE, PRECIO_LECHUGA, PRECIO_PEPINO, PRECIO_QUESO };

	public String[] aIngredientes;

	public Hamburguesa() {

		super();

		aIngredientes = new String[1];
		this.aIngredientes[0] = "sin ingredientes";

	}

	public Hamburguesa(String ingrediente1) {
		this();
		aIngredientes = new String[1];

		this.aIngredientes[0] = ingrediente1;

	}

	public Hamburguesa(String ingrediente1, String ingrediente2) {
		this();
		aIngredientes = new String[2];
		this.aIngredientes[0] = ingrediente1;
		this.aIngredientes[1] = ingrediente2;

	}

	public Hamburguesa(String ingrediente1, String ingrediente2, String ingrediente3) {
		this();
		aIngredientes = new String[3];
		this.aIngredientes[0] = ingrediente1;
		this.aIngredientes[1] = ingrediente2;
		this.aIngredientes[2] = ingrediente3;

	}

	public Hamburguesa(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4) {
		this();
		aIngredientes = new String[4];
		this.aIngredientes[0] = ingrediente1;
		this.aIngredientes[1] = ingrediente2;
		this.aIngredientes[2] = ingrediente3;
		this.aIngredientes[3] = ingrediente4;

	}

	public void CalcularPrecio() {
		float precioTotal;
		float precioIngrediente = 0;
		if (this.aIngredientes[0].equals("sin ingredientes")) {
			precioTotal = 1;
		} else {

			for (int i = 0; i < aIngredientes.length; i++) {
				if (this.aIngredientes[i].equals(aNombres[i]))

				{
					precioIngrediente = precioIngrediente + PRECIO_LECHUGA;

				}
				if (this.aIngredientes[i].equals("pepino"))

				{
					precioIngrediente = precioIngrediente + PRECIO_PEPINO;

				}
				if (this.aIngredientes[i].equals("queso"))

				{
					precioIngrediente = precioIngrediente + PRECIO_QUESO;

				}
				if (this.aIngredientes[i].equals("tomate"))

				{
					precioIngrediente = precioIngrediente + PRECIO_TOMATE;

				}

			}

			precioTotal = 1 + precioIngrediente;
		}
		System.out.println(precioTotal);

		// return precioTotal;
	}
}
