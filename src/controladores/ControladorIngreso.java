package controladores;

import vista.VistaIngreso;

public class ControladorIngreso {

    static VistaIngreso v = new VistaIngreso();

    public static void inicio() {
        v.setVisible(true);
    }
    public static void cerrar() {
        v.setVisible(false);
    }
    public static void btn_back() {
        ControladorIngreso.cerrar();
        ControladorApp.inicio();
    }
}
