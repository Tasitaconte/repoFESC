package controladores;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.VistaRegistro;

public class ControladorRegistro {

    private static JOptionPane j;

    public ControladorRegistro() {
       this.j = new JOptionPane();
    }

    public static VistaRegistro vista = new VistaRegistro();

    public static void inicio() {
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void btn_registrar() {
        
         j.showMessageDialog(vista, "rellenar todos los campos");
       
    }

}
