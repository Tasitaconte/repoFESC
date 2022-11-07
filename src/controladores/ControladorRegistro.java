package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import javax.swing.JOptionPane;
import Dao.conexionSQL;
import modelos.userModel;
import vista.VistaRegistro;

public class ControladorRegistro {

    static VistaRegistro vista = new VistaRegistro();

    public static void inicio() {
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void btn_back() {
        ControladorRegistro.cerrar();
        ControladorApp.inicio();
    }

    public static void btn_registrar() { //Logica de registro
        
        String nameUser = vista.getRname().getText();
        String surnameUser = vista.getRApellido().getText();
        String emailUser = vista.getRemail().getText();
        String passUser = vista.getTpass().getText();

      //  System.out.println(nameUser + " " + surnameUser + " " + emailUser + " " + passUser);

        if (vista.getRname().getText().equals("") || (vista.getRApellido().getText().equals("")) || (vista.getRemail().getText().equals("")) || (vista.getTpass().getText().equals(""))) {
            JOptionPane.showMessageDialog(vista, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            userModel u = new userModel(nameUser, emailUser, surnameUser, passUser);
            IDaoUsuario iDaoUsuario = new DaoUsuario();
            iDaoUsuario.createUser(u);
            JOptionPane.showMessageDialog(vista, "REGISTRADO CORRECTAMENTE \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }
    }
    
    public static void limpiar() {
        vista.getTpass().setText("");
        vista.getRemail().setText("");
        vista.getRApellido().setText("");
        vista.getRname().setText("");
    }
}
