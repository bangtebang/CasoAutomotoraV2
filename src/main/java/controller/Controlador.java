package controller;
import modelo.*;
import utils.*;


import java.util.ArrayList;

public class Controlador {
    public static ArrayList<Vehiculo> buscarVehiculo(Automotora automotora, String nombre){
        return automotora.buscarAutoNombre(nombre);
    }
    public static void agregarVehiculo(Automotora automotora,String nombre, int ano, int precio, int kmRecorridos, String color, String marca){
        automotora.agregarVehiculo(nombre,ano,precio,kmRecorridos,color,marca);
    }
    public static void agregarCliente(Automotora automotora,String nombre, String rut, String numeroTelefono, String direccion, String correoElectronico){
         automotora.agregarCliente(nombre,rut,numeroTelefono,direccion,correoElectronico);
    }
}
