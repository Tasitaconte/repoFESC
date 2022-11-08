package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.userModel;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {

    @Override
    public void createUser(userModel usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NAME_USER + ","
                + env.SURNAME_USER + ","
                + env.EMAIL_USER + "," + env.PASSWORD_USER + ") VALUES(?,?,?,MD5(?))";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getUserName());
            ps.setString(2, usuario.getUserSurname());
            ps.setString(3, usuario.getUserEmail());
            ps.setString(4, usuario.getUserPassword());
            ps.executeUpdate();

            System.out.println("Creado con exito");

        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());

        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
    }

    @Override
    public boolean Dingreso(userModel usuario) {
        //ArrayList<userModel> arrayListDingreso = new ArrayList<>();
        String sql = "SELECT user.email_user, user.password_user FROM `user` WHERE user.email_user ='" + usuario.getUserEmail() + "' and user.password_user='" + usuario.getUserPassword() + "'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                return true;
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
        return false;
    }
}
