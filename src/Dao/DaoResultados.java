package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.PruebaModel;

public class DaoResultados extends conexionSQL implements IDaoResultados {

    @Override
    public ArrayList<PruebaModel> cliente(int x, int y) {
        ArrayList<PruebaModel> arrayListDatos = new ArrayList<>();
        String sql = "SELECT * FROM " + env.PRUEBA + " WHERE " + env.ID_TPRUEBA + "="
                + x + " and " + env.ID_PROGRAMA + "="
                + y;
        System.err.println(sql);
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                PruebaModel p = new PruebaModel();
                p.setNombre(resultSet.getString(env.NOMBRE));
                p.setComunicacion_escrita(resultSet.getInt(env.COMUNICACION_ESCRITA));
                p.setRazonamiento_cuantitativo(resultSet.getInt(env.RAZONAMIENTO_CUANTITATIVO));
                p.setLectura_critica(resultSet.getInt(env.LECTURA_CRITICA));
                p.setCompetencias_ciudadanas(resultSet.getInt(env.COMPETENCIAS_CIUDADANAS));
                p.setIngles(resultSet.getInt(env.INGLES));
                p.setNivel(resultSet.getString(env.NIVEL));
                arrayListDatos.add(p);
            }
            return arrayListDatos;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        }
        return arrayListDatos;
    }
}
