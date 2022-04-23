package ej1;

public class Lavadora extends Electrodomestico {
	private int carga;
	private static final int fcarga = 5;
	private double plus = 0;

	
	public Lavadora() {
		super();
		this.carga = fcarga;

	}

	public Lavadora(int base, int peso) {
		super(base, peso);
		this.carga = fcarga;

	}

	public Lavadora(int base, Color micolor, Letras miconsumo, int peso, int carga) {
		super(base, micolor, miconsumo, peso);

		this.carga = carga;

	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public double precioFinal() {
		double precioTotal = 0;
		double plusCarga = 0;

		if (carga > 30) {
			plusCarga = base + 50;
		}
		// Según el consumo de la lavadora incrementaremos el precio del plus.
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

		precioTotal = plus + plusCarga + base;

		return precioTotal;
	}

	// como uso el enum si o si sera correcta
	@Override
	public char comprobarConsumoEnergetico(String letra) {
		// TODO Auto-generated method stub
		return 0;
	}

	// como uso el enum si o si sera correcto

	@Override
	public String comprobarColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	// Generamos el método toString
	@Override
	public String toString() {
		return "La lavadora de color " + micolor + ", tiene un precio de " + base + " ,letra de consumo " + miconsumo
				+ ", pesa " + peso + ", con carga de " + carga;
	}

	@Override
	protected boolean getSintonizadortdt() {
		// TODO Auto-generated method stub
		return false;
	}

}
