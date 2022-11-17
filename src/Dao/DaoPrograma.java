package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.ProgramaModel;

public class DaoPrograma extends conexionSQL implements IDaoPrograma {

    /**
     *
     * @return
     */
    @Override
    public ArrayList<ProgramaModel> namePrograma() {

        ArrayList<ProgramaModel> arrayListPrograma = new ArrayList<>();

        //query de traida de dato de la db
        String sql = "SELECT * FROM " + env.T_PROGRAMA
                + " ORDER BY " + env.ID_PROGRAMA + " ASC";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {  //Captura de datos de la db
                ProgramaModel p = new ProgramaModel();
                p.setIdPrograma(resultSet.getInt(env.ID_PROGRAMA));
                p.setNamePrograma(resultSet.getString(env.NAME_PROGRAMA));
                arrayListPrograma.add(p);
            }

            return arrayListPrograma;

        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
            return arrayListPrograma;
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
    }

}
