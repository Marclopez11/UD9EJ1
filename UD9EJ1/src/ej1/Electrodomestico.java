package ej1;

public abstract class Electrodomestico {

	protected int base;
	protected String color;
	protected int peso;

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS, blanco, negro, rojo, azul, gris;

	}

	enum Letras {
		A, B, C, D, E, F;

	}

	Color micolor;
	Letras miconsumo;

	public Electrodomestico() {

		this.micolor = Color.blanco;
		this.miconsumo = Letras.F;
		this.base = 100;
		this.peso = 5;

	}

	public Electrodomestico(int base, int peso) {
		this.peso = peso;
		this.micolor = Color.blanco;
		this.miconsumo = Letras.F;
		this.base = base;

	}

	public Electrodomestico(int base, Color micolor, Letras miconsumo, int peso) {
		this.base = base;
		this.micolor = micolor;
		this.miconsumo = miconsumo;
		this.peso = peso;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Letras getConsumo() {
		return miconsumo;
	}

	public void setConsumo(Letras consumo) {
		this.miconsumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico" + ", base=" + base + ", color=" + micolor + ", consumo=" + miconsumo + ", peso="
				+ peso + "]";
	}

	// Métodos
	abstract public char comprobarConsumoEnergetico(String letra);
	abstract public String comprobarColor(String color);
	protected abstract boolean getSintonizadortdt();


	// TelevisorClass method
	public double precioFinal() {
		return 0;
	}


}
