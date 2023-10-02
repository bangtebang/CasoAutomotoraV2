package modelo;

import java.util.ArrayList;
import modelo.Vehiculo;
import modelo.Cliente;

public class Automotora {
	private String nombreSede;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getNombreSede() {
		return this.nombreSede;
	}

	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	public void buscarVehiculo(String nombre) {
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo.getNombre().equals(nombre)) {
				System.out.println("Vehiculo encontrado");
				System.out.println("Nombre: " + vehiculo.getNombre());
				System.out.println("Ano: " + vehiculo.getAno());
				System.out.println("Precio: " + vehiculo.getPrecio());
				System.out.println("Km recorridos: " + vehiculo.getKmRecorridos());
				System.out.println("Color: " + vehiculo.getColor());
				System.out.println("Marca: " + vehiculo.getMarca());
				System.out.println("Automotora: " + vehiculo.getAutomotora().getNombreSede());
				return;
			}
		}
		System.out.println("Vehiculo no encontrado");
	}

	public Automotora(String nombreSede) {
		this.nombreSede = nombreSede;
	}
}