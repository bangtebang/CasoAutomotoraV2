package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.Controlador;
import modelo.*;


public class VentanaAñadirVehiculo extends JFrame {
    private JPanel AñadirVehiculoPanel;
    private JTextField textField1;
    private JTextField campoAno;
    private JTextField campoPrecio;
    private JTextField campoMarca;
    private JTextField campoColor;
    private JTextField campoKm;
    private JButton volverButton;
    private JButton añadirButton;
    private JLabel jsModelo;
    private JLabel jsAño;
    private JLabel jsPrecio;
    private JLabel jsMarca;
    private JLabel jsColor;
    private JLabel jsKmRecorridos;
    private JLabel jsResgistroVehiculo;
    private JTextField campoModelo;
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
                Controlador.agregarVehiculo(automotora,campoModelo.getText(),Integer.parseInt(campoAno.getText()),Integer.parseInt(campoPrecio.getText()),Integer.parseInt(campoKm.getText()),campoColor.getText(),campoMarca.getText());}
        });
    }
    }
