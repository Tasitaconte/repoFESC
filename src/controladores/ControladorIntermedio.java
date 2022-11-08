package controladores;

import vista.VistaCarga;

public class ControladorIntermedio {

    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }
    
}
