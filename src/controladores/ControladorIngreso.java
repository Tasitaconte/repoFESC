package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import clases.encoder;
import static controladores.ControladorRegistro.vista;
import javax.swing.JOptionPane;
import modelos.userModel;
import vista.VistaIngreso;

public class ControladorIngreso {

    static VistaIngreso v = new VistaIngreso();
    static encoder mEnconder = new encoder();

    public static void inicio() {
        v.setVisible(true);
    }

    public static void cerrar() {
        v.dispose();
    }

    public static void btn_back() {
        ControladorIngreso.cerrar();
        ControladorApp.inicio();
    }

    //funcion de ingreso a la aplicación 
    public static void ingreso() {

        String correo = v.getiCorreo().getText();
        String Pass = mEnconder.ecnode(v.getiPass().getText());

        if (v.getiCorreo().getText().equals("") || v.getiPass().getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "RELLENE LOS DATOS");
        } else {
            if (!validacion(correo, Pass)) {
                limpiar();
                JOptionPane.showMessageDialog(vista, "DATOS INCORRECTOS VUELVA A INTENTAR \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                ControladorIngreso.cerrar();
                ControladorIntermedio.inicio();
            }
        }
    }

    // pregunta a la base de datos si son correctos los datos mandados a los parametros y retorna un 
    //dato booleano
    public static boolean validacion(String x, String y) {
        userModel u = new userModel(null, x, null, y);
        IDaoUsuario iDaoUsuario = new DaoUsuario();
        return iDaoUsuario.Dingreso(u);
    }

    public static void limpiar() {
        v.getiCorreo().setText("");
        v.getiPass().setText("");
    }

}
