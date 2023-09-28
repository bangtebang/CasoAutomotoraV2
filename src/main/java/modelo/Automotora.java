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

	public Automotora(String nombreSede) {
		this.nombreSede = nombreSede;
	}
}