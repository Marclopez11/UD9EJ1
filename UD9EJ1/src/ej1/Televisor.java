package ej1;

public class Televisor extends Electrodomestico {

	protected int resolucion;
	protected boolean sintonizadortdt;
	private double plus = 0;

	protected static final int resolucioncn = 20;
	protected static final boolean sintonizadorcn = false;

	public Televisor() {
		super();
		this.resolucion = resolucioncn;
		this.sintonizadortdt = sintonizadorcn;
	}

	public Televisor(int base, Color micolor, Letras miconsumo, int peso, int resolucion, boolean sintonizador) {
		super(base, micolor, miconsumo, peso);
		// TODO Auto-generated constructor stub

		this.resolucion = resolucion;
		this.sintonizadortdt = sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getSintonizadortdt() {
		return sintonizadortdt;
	}

	public void setSintonizadortdt(boolean sintonizadortdt) {
		this.sintonizadortdt = sintonizadortdt;
	}

	// como uso el enum si o si sera correcta

	@Override
	public char comprobarConsumoEnergetico(String letra) {
		// TODO Auto-generated method stub
		return 0;
	}
	// como uso el enum si o si sera correcta

	@Override
	public String comprobarColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	public double precioFinal() {
		double plusResolucion = 0;
		double plusPeso = 0;
		double plusConsumo = 0;
		double plusSintonizador = 0;
		double precioTotal = 0;

		/*
		 * Según la resolución de la televisión incrementaremos su valor en un 30% o no.
		 */
		if (resolucion > 40) {
			plusResolucion = base * 1.30;
			this.plus += plusResolucion;
		}

		/* Si la televisión dispone de sintonizador incrementaremos su precio en 50€ */
		if (sintonizadortdt == true) {
			plusSintonizador += 50;
		}

		/* Según el consumo del electrodoméstico incrementaremos su precio. */
		switch (miconsumo.toString()) {
		case "A":
			plus += 100;
			break;
		case "B":
			plus += 80;
			break;
		case "C":
			plus += 60;
			break;
		case "D":
			plus += 50;
			break;
		case "E":
			plus += 30;
			break;
		case "F":
			plus += 10;
			break;

		default:
			break;
		}

		/* Según el peso del electrodomestico , incrementaremos su valor */
		if (peso >= 0 && peso <= 19) {
			plusPeso += 10;
		} else if (peso >= 20 && peso <= 49) {
			plusPeso += 50;
		} else if (peso >= 50 && peso <= 79) {
			plusPeso += 80;
		} else if (peso > 80) {
			plusPeso += 100;
		}

		precioTotal = plusConsumo + plusPeso + plusResolucion + plusSintonizador + base;

		return precioTotal;
	}

	@Override
	public String toString() {
		return "Televisor  de color " + micolor + ", tiene un precio de " + base + " ,letra de consumo " + miconsumo
				+ ", pesa " + peso + ", con sincronizador tdt " + sintonizadortdt;
	}

}
