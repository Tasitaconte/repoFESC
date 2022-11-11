package Dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelos.PruebaModel;

public class DaoPrueba extends conexionSQL implements IDaoPrueba {

    @Override
    public ArrayList<PruebaModel> nameTest() {

        ArrayList<PruebaModel> arrayListPrueba = new ArrayList<>();

        String sql = "SELECT * FROM " + env.T_TPRUEBA
                + " ORDER BY " + env.ID_TPRUEBA + " DESC";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                PruebaModel p = new PruebaModel();
                p.setIdTest(resultSet.getInt(env.ID_TPRUEBA));
                p.setNameTest(resultSet.getString(env.NAME_TPRUEBA));
                arrayListPrueba.add(p);
            }

            return arrayListPrueba;

        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
            return arrayListPrueba;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
    }
}
