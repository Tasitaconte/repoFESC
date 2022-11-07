package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.userModel;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {

    public class conexionSQL {

        public boolean createUser(userModel user) {
            String sql = "INSERT INTO " + env.T_USER + "("
                    + env.NAME_USER + ","
                    + env.SURNAME_USER + ","
                    + env.PASSWORD + "," + env.EMAIL_USER + ") VALUES(?,?,MD5(?),?)";
            try {
                PreparedStatement ps = getConnection().prepareStatement(sql);
                ps.setString(1, user.getUserName());
                ps.setString(2, user.getUserSurname());
                ps.setString(3, user.getUserPassword());
                ps.setString(4, user.getUserEmail());
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
}
