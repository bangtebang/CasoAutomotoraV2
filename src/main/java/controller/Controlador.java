package controller;
import modelo.*;


import java.util.ArrayList;

public class Controlador {
    public static Automotora cargaMasivaDatos(Automotora automotora){
        return automotora;
    }
    public static void buscarVehiculo(Automotora automotora, String nombre){
        automotora.buscarVehiculo(nombre);
    }
    public static void agregarVehiculo(Automotora automotora, Vehiculo vehiculo){
        automotora.agregarVehiculo(vehiculo);
    }
}
