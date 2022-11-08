package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import modelos.userModel;
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

    public static void ingreso() {

        String correo = v.getiCorreo().getText();
        String Pass = v.getiPass().getText();
        
        if(!validacion(correo, Pass)){
            System.out.println("intente de nuevo");
        }else{
            System.out.println("entra");
        }
    }
    
    public static boolean validacion(String x, String y){
        userModel u = new userModel(null, x,null, y);
        IDaoUsuario iDaoUsuario = new DaoUsuario();
        return iDaoUsuario.Dingreso(u);
    }

}
