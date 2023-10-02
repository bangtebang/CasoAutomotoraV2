package vista;
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


    public VentanaInicio(){
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
                new VentanaAñadirVehiculo();
                setVisible(false);
            }
        });
        AñadirClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaAñadirCliente();
                setVisible(false);
            }
        });
        BuscarVehiculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaBuscarVehiculo();
                setVisible(false);
            }
        });
    }
    public static void main(String[] args) {
        new VentanaInicio();
    }

}
