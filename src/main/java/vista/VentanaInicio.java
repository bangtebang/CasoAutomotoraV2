package vista;

import modelo.Automotora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio extends JFrame {
    private JLabel jsPregunta;
    private JButton AñadirVehiculoButton;
    private JButton AñadirClienteButton;
    private JButton BuscarVehiculoButton;
    private JPanel AutomotoraPanel;
    private JButton salirButton;
    private  Automotora automotora;


    public VentanaInicio(Automotora automotora){
        this.automotora = automotora;
        setContentPane(AutomotoraPanel);
        setTitle("Automotora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        AñadirVehiculoButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaAñadirVehiculo(automotora);
                dispose();
            }
        });
        AñadirClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaAñadirCliente(automotora);
                dispose();
            }
        });
        BuscarVehiculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaBuscarVehiculo(automotora);
                dispose();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
    }}

