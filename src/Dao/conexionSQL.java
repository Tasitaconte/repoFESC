package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Dao.env;
import java.sql.PreparedStatement;
import modelos.userModel;

public class conexionSQL {

    Connection conn = null;

    //Conexion y captura de errores en la conexión
    public conexionSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(env.HOST + env.DATABASE, env.USER, env.PASSWORD);
            if (conn != null) {
                System.out.println("conexion exitosa");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public Connection getConnection() {
        return conn;
    }

    public void crearUsuario(userModel usuario) {

        String sql = "INSERT INTO user(name_user,surname_user,email_user,password_user) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);

            ps.setString(1, usuario.getUserName());
            ps.setString(2, usuario.getUserSurname());
            ps.setString(3, usuario.getUserPassword());
            ps.setString(4, usuario.getUserEmail());
            ps.executeUpdate();

            System.out.println("Creado con exito");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
