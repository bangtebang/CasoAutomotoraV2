package vista;

import modelo.Automotora;
import controller.Controlador;
import modelo.Vehiculo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaBuscarVehiculo  extends JFrame{
    private JLabel jsBuscarVehiculo;
    private JTextField campoBuscarVehiculo;
    private JButton buscarButton;
    private JButton volverButton;
    private JPanel BuscarVehiculoPanel;
    private Automotora automotora;

    public VentanaBuscarVehiculo(Automotora automotora){
        this.automotora = automotora;
        setContentPane(BuscarVehiculoPanel);
        setTitle("Buscar Vehiculo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaInicio(automotora);
                dispose();
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (campoBuscarVehiculo.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Debe llenar el campo");
                    return;
                }
                String nombreBuscado = campoBuscarVehiculo.getText();
                ArrayList<Vehiculo> vehiculosEncontrados = Controlador.buscarVehiculo(automotora, nombreBuscado);
                if (vehiculosEncontrados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron vehículos con ese nombre.");
                    dispose();
                    new VentanaInicio(automotora);
                } else {
                    StringBuilder mensaje = new StringBuilder();
                    for (Vehiculo vehiculo : vehiculosEncontrados) {
                        mensaje.append("Nombre: ").append(vehiculo.getNombre()).append("\n");
                        mensaje.append("Año: ").append(vehiculo.getAno()).append("\n");
                        mensaje.append("Precio: ").append(vehiculo.getPrecio()).append("\n");
                        mensaje.append("Kilometraje: ").append(vehiculo.getKmRecorridos()).append("\n");
                        mensaje.append("Color: ").append(vehiculo.getColor()).append("\n");
                        mensaje.append("Marca: ").append(vehiculo.getMarca()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje.toString());
                    dispose();
                    new VentanaInicio(automotora);
                }
            }
        });
    }
}
