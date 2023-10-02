package vista;

import javax.swing.*;


public class VentanaAñadirVehiculo extends JFrame {
    private JPanel AñadirVehiculoPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton volverButton;
    private JButton añadirButton;
    private JLabel jsModelo;
    private JLabel jsAño;
    private JLabel jsPrecio;
    private JLabel jsMarca;
    private JLabel jsColor;
    private JLabel jsKmRecorridos;
    private JLabel jsResgistroVehiculo;

    public VentanaAñadirVehiculo(){
        setContentPane(AñadirVehiculoPanel);
        setTitle("Añadir Vehiculo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    }
