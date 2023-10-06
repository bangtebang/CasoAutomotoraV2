package vista;

import modelo.Automotora;
import controller.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAñadirCliente extends JFrame {

    private JTextField campoNombre;
    private JTextField campoRut;
    private JTextField campoDireccion;
    private JTextField campoCorreo;
    private JTextField campoTelefono;
    private JPanel AñadirClientePanel;
    private JButton volverButton;
    private JButton añadirButton;
    private Automotora automotora;

    public VentanaAñadirCliente(Automotora automotora){
        this.automotora = automotora;
        setContentPane(AñadirClientePanel);
        setTitle("Añadir Cliente");
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
                registrarCliente();
                new VentanaInicio(automotora);
                dispose();
            }
        });
    }
    private void registrarCliente(){
        Controlador.agregarCliente(automotora,this.campoNombre.getText(),this.campoRut.getText(),this.campoTelefono.getText(),this.campoDireccion.getText(),this.campoCorreo.getText());
    }

    }
