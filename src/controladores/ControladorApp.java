package controladores;

import vista.VistaInicio;

public class ControladorApp {
    
    public VistaInicio vista = new VistaInicio();
    
    public ControladorApp() {
        
    }
    
    public void inicio() {
        vista.setVisible(true);
    }
    
}
