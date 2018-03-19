//1 Definicion de paquete package

//2. Son los imports import => ahora mismo no tenemos ninguno

//3. Deficinion de la clase. Ejm. Class Mesa

//4. Atributos

//5. Metodos
//5.1 Constructores
//5.2 Getters & Setters
//5.3 Otros

package com.ipartek.formacion.capitulo3;

public class Mesa {
	int numeroPatas;

	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;

	public Mesa() {
		super();
		this.numeroPatas = 4;
	}

	public Mesa(int numeroPatas) {
		super();
		this.numeroPatas = numeroPatas;

	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

}
