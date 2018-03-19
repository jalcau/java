package com.ipartek.formacion.capitulo3;

public class ComprarMesas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Listado de mesas");
		System.out.println("----------------");

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa(1);
		m1.numeroPatas = 8;

		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}

}
