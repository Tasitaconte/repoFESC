
package controladores;
import vista.VistaIngreso;
public class ControladorIngreso {
    
    public static VistaIngreso v = new VistaIngreso();
    
    public static void inicio(){
        v.setVisible(true);
    }
    public static void cerrar(){
        v.setVisible(false);
    }
    
}
