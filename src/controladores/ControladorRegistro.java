package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.userModel;
import vista.VistaRegistro;

public class ControladorRegistro {

    private static JOptionPane j;
    private static IDaoUsuario iDaoUsuario;

    public ControladorRegistro() {
        this.j = new JOptionPane();
        this.iDaoUsuario = new DaoUsuario();
    }

    public static VistaRegistro vista = new VistaRegistro();

    public static void inicio() {
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void btn_back() {
        cerrar();
        ControladorApp.inicio();
    }

    public static void btn_registrar() {
        String userName = vista.getRname().getText();
        String userSurname = vista.getRApellido().getText();
        String userEmail = vista.getRemail().getText();
        String userPassword = vista.getTpass().getText();
        
        System.out.println(userName+ " "+ userSurname + " " + userEmail + " "+ userPassword);
        
        userModel usuario = new userModel(userName, userEmail, userSurname, userPassword);
        System.out.println(usuario);
        /*iDaoUsuario.createUser(usuario);*/
    }
}
