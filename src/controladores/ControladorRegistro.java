package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import javax.swing.JOptionPane;
import clases.encoder;
import clases.libPersonal;
import modelos.userModel;
import vista.VistaRegistro;

public class ControladorRegistro {

    static encoder mEnconder = new encoder();
    static VistaRegistro vista = new VistaRegistro();

    //función para visualizar la vista registro
    public static void inicio() {
         libPersonal.styleWindows();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    //función para ocultar la vista registro
    public static void cerrar() {
        vista.setVisible(false);
    }

    //Función del boton back de la app escritorio
    public static void btn_back() {
        ControladorRegistro.cerrar();
        ControladorApp.inicio();
    }

    //Función que captura los datos para el registro del usuario
    public static void btn_registrar() { 
        String nameUser = vista.getRname().getText();
        String surnameUser = vista.getRApellido().getText();
        String emailUser = vista.getRemail().getText();
        String passUser = mEnconder.ecnode(vista.getTpass().getText().trim());

        if (vista.getRname().getText().equals("") || (vista.getRApellido().getText().equals("")) || (vista.getRemail().getText().equals("")) || (vista.getTpass().getText().equals(""))) {
            JOptionPane.showMessageDialog(vista, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            userModel u = new userModel(nameUser, emailUser, surnameUser, passUser);
            IDaoUsuario iDaoUsuario = new DaoUsuario();
            if (iDaoUsuario.createUser(u)) {
                JOptionPane.showMessageDialog(vista, "Usuario Creado \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }
        }
    }

    //función para limipiar los textFild
    public static void limpiar() {
        vista.getTpass().setText("");
        vista.getRemail().setText("");
        vista.getRApellido().setText("");
        vista.getRname().setText("");
    }
}
