package controladores;

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

    public static void btn_registrar() {
        String nameUser = vista.getRname().getText();
        String surnameUser = vista.getRApellido().getText();
        String emailUser = vista.getRemail().getText();
        String passUser = vista.getTpass().getText();

        System.out.println(nameUser + " " + surnameUser + " " + emailUser + " " + passUser + " se registro");

        userModel u = new userModel();

        u.setUserName(nameUser);
        u.setUserSurname(surnameUser);
        u.setUserEmail(emailUser);
        u.setUserPassword(passUser);
        
        conexionSQL db = new conexionSQL();
        
        db.crearUsuario(u);

    }
}
