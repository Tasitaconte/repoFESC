package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.userModel;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {
    @Override
    public boolean createUser(userModel usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NAME_USER + ","
                + env.SURNAME_USER + ","
                +env.EMAIL_USER + "," + env.PASSWORD  + ") VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getUserName());
            ps.setString(2, usuario.getUserSurname());
            ps.setString(3, usuario.getUserPassword());
            ps.setString(4, usuario.getUserEmail());
            ps.executeUpdate();

            System.out.println("Creado con exito");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());
            return false;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
    }
}
