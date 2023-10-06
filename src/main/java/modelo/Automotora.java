package modelo;

import java.util.ArrayList;
import modelo.Vehiculo;
import modelo.Cliente;
import utils.*;

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
	public boolean agregarCliente(String nombre, String rut, String numeroTelefono, String direccion, String correoElectronico) {
		if (ValidadorRut.validarDigito(rut)&&ValidadorCorreo.validarCorreo(correoElectronico)) {
			Cliente cliente= new Cliente(nombre,direccion,numeroTelefono,correoElectronico,rut);
			this.clientes.add(cliente);
			return true;
		} else {
			return false;
		}
	}
	public void agregarVehiculo(String nombre, int ano, int precio, int kmRecorridos, String color, String marca) {
		Vehiculo vehiculo=new  Vehiculo(nombre, ano, precio, kmRecorridos, color, marca);
		this.vehiculos.add(vehiculo);
	}
	public ArrayList<Vehiculo> buscarAutoNombre(String nombre) {
		ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
		for (Vehiculo auto : this.vehiculos) {
			if (auto.getNombre().equalsIgnoreCase(nombre)) {
				vehiculosEncontrados.add(auto);
			}
		}
		return vehiculosEncontrados;
	}

	public Automotora(String nombreSede) {
		this.nombreSede = nombreSede;
	}
}