package principal;

import modelo.Automotora;
import vista.VentanaInicio;

public class Principal {
    public static void main(String[] args) {
        new VentanaInicio(new Automotora("Automotora"));
    }

}