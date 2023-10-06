package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.Controlador;
import modelo.*;


public class VentanaAñadirVehiculo extends JFrame {
    private JPanel AñadirVehiculoPanel;
    private JTextField campoNombre;
    private JTextField campoAno;
    private JTextField campoPrecio;
    private JTextField campoMarca;
    private JTextField campoColor;
    private JTextField campoKm;
    private JButton volverButton;
    private JButton añadirButton;
    private JLabel jsAño;
    private JLabel jsPrecio;
    private JLabel jsMarca;
    private JLabel jsColor;
    private JLabel jsKmRecorridos;
    private JLabel jsResgistroVehiculo;
    private JTextField textField7;
    private Automotora automotora;

    public VentanaAñadirVehiculo(Automotora automotora){
        this.automotora = automotora;
        setContentPane(AñadirVehiculoPanel);
        setTitle("Añadir Vehiculo");
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
        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (campoNombre.getText().isEmpty() || campoAno.getText().isEmpty() || campoPrecio.getText().isEmpty() || campoKm.getText().isEmpty() || campoColor.getText().isEmpty() || campoMarca.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                    return;
                }
                try {
                    int ano = Integer.parseInt(campoAno.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El año ingresado no es válido, debe ser un número entero.");
                    return;
                }
                try {
                    int precio = Integer.parseInt(campoPrecio.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El precio ingresado no es válido, debe ser un número entero.");
                    return;
                }
                try {
                    int km = Integer.parseInt(campoKm.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El kilometraje ingresado no es válido, debe ser un número entero.");
                    return;
                }
                Controlador.agregarVehiculo(automotora,campoNombre.getText(),Integer.parseInt(campoAno.getText()),Integer.parseInt(campoPrecio.getText()),Integer.parseInt(campoKm.getText()),campoColor.getText(),campoMarca.getText());
                JOptionPane.showMessageDialog(null, "Se agrego correctamente el vehiculo");
                dispose();
                new VentanaInicio(automotora);
                ;}
        });
    }
    }
