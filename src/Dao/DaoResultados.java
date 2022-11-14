package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.PruebaModel;

public class DaoResultados extends conexionSQL implements IDaoResultados {

    @Override
    public ArrayList<PruebaModel> cliente() {
        ArrayList<PruebaModel> arrayListDatos = new ArrayList<>();
        String sql = "SELECT * FROM " + env.PRUEBA;
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                PruebaModel p = new PruebaModel();
                p.setNombre(resultSet.getString(env.NOMBRE));
                p.setCompetencias_ciudadanas(resultSet.getInt(env.COMPETENCIAS_CIUDADANAS));
                arrayListDatos.add(p);
            }
            return arrayListDatos;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        }
        return arrayListDatos;
    }
}
