package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.userModel;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {

    @Override
    public boolean createUser(userModel usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NAME_USER + ","
                + env.SURNAME_USER + "," + env.EMAIL_USER + "," + env.PASSWORD_USER + ") VALUES (?, ?, ?,?)";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getUserName());
            ps.setString(2, usuario.getUserSurname());
            ps.setString(3, usuario.getUserEmail());
            ps.setString(4, usuario.getUserPassword());
            ps.executeUpdate();
            System.out.println("Creado con exito");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());

        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return false;
    }

    @Override

    //funcion de validación para el ingreso del usuario
    public boolean Dingreso(userModel usuario) {
        //query de la db
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE "+ env.EMAIL_USER+"='" 
                + usuario.getUserEmail() +
                "' and "+env.PASSWORD_USER+"='" + usuario.getUserPassword() + "'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                return true; // en tal caso de que los datos sean correctos retornara un datos boolean
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
        return false; // si no hay datos correcto retorna un dato boolean 
    }
}
