package modelo;

public class Vehiculo {
	private String nombre;
	private int ano;
	private int precio;
	private double kmRecorridos;
	private String color;
	private String marca;
	private Automotora automotora;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Vehiculo(String nombre, int ano, int precio, double kmRecorridos, String color, String marca) {
		this.nombre = nombre;
		this.ano = ano;
		this.precio = precio;
		this.kmRecorridos = kmRecorridos;
		this.color = color;
		this.marca = marca;
	}
}