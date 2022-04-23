package ej1;

import ej1.Electrodomestico.Color;
import ej1.Electrodomestico.Letras;

public class main {

	public static void main(String[] args) {
		Color color = null;
		Letras miconsumo = null;
		int precioTotal = 0;
		int precio = 0;

		// Definimos un array de 10 lavadoras.
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		// la llenamos de 5 lavadoras y 5 televisores
		electrodomesticos[0] = new Lavadora(300, Color.BLANCO, Letras.A, 100, 30);
		electrodomesticos[1] = new Lavadora(100, Color.AZUL, Letras.B, 100, 30);
		electrodomesticos[2] = new Lavadora(100, Color.GRIS, Letras.C, 100, 30);
		electrodomesticos[3] = new Lavadora(100, Color.NEGRO, Letras.D, 100, 30);
		electrodomesticos[4] = new Lavadora(100, Color.ROJO, Letras.F, 100, 30);
		electrodomesticos[5] = new Televisor(100, Color.BLANCO, Letras.A, 100, 30, false);
		electrodomesticos[6] = new Televisor(100, Color.AZUL, Letras.B, 100, 30, true);
		electrodomesticos[7] = new Televisor(100, Color.GRIS, Letras.C, 100, 50, true);
		electrodomesticos[8] = new Televisor(100, Color.NEGRO, Letras.D, 100, 50, true);
		electrodomesticos[9] = new Televisor(100, Color.ROJO, Letras.F, 100, 30, true);

		
		//mostramos los productos sin el precio final
		System.out.println("Productos sin el precio final");
		System.out.println();

		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println(electrodomesticos[i]);
		}

		System.out.println();
		System.out.println("PRECIO FINAL DE LAS LAVADORAS");

		//mostramos el precio final de las primeras 5 posiciones que son de lavadora
		for (int i = 0; i < 5; i++) {

			precio = (int) electrodomesticos[i].precioFinal();
			System.out.println("El precio de la lavadora " + i + " es " + precio);
			precioTotal += precio;

		}
		System.out.println();
		System.out.println("PRECIO FINAL DE LAS TELEVISIONES");

		//mostramos el precio final de las  ultimsa  5 posiciones que son de television

		for (int i = 5; i < electrodomesticos.length; i++) {

			precio = (int) electrodomesticos[i].precioFinal();
			System.out.println("El precio de la television " + i + " es " + precio + " sincronizador "
					+ electrodomesticos[i].getSintonizadortdt());
			precioTotal += precio;

		}

		//suma total de los electrodomesticos
		System.out.println();
		System.out.println("Suma total de todos los electrodomesticos " + precioTotal);

	}

}
