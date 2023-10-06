package principal;

import modelo.*;
import vista.VentanaInicio;

public class Principal {
    public static void main(String[] args) {
        Automotora automotora=new Automotora("sede1");
        new VentanaInicio(automotora);
    }


}