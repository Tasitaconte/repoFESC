package controladores;

import clases.libPersonal;
import vista.VistaInicio;

public class ControladorApp {

    static VistaInicio vista = new VistaInicio();

    public static void inicio() {
         libPersonal.styleWindows();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void btnIngreso() {
        ControladorApp.cerrar();
        ControladorIngreso.inicio();
    }

    public static void btnRegister() {
        ControladorApp.cerrar();
        ControladorRegistro.inicio();
    }

}
