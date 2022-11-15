package Dao;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.PruebaModel;

public class DaoCarga extends conexionSQL implements IDaoCarga {

    @Override
    public boolean insertarMySQL(List<PruebaModel> pruebas) {
        System.out.println("\nSE VAN A INSERTA: " + pruebas.size() + " REGISTROS\n");
        String sql = " INSERT INTO " + env.PRUEBA + "(" + env.ID_TPRUEBA + "," + env.ID_PROGRAMA + "," + env.REGISTRO + "," + env.PERIODO + ","
                + env.IDENTIFICACION + "," + env.NOMBRE + "," + env.COMUNICACION_ESCRITA + ","
                + env.RAZONAMIENTO_CUANTITATIVO + "," + env.LECTURA_CRITICA + "," + env.COMPETENCIAS_CIUDADANAS + ","
                + env.INGLES + "," + env.NIVEL + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        if (pruebas.size() > 1) {
            for (int i = 2; i <= pruebas.size(); i++) {
                sql += ", (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            }
        }
        int parameterNumber = 1;
        try {
            try ( PreparedStatement ps = getConnection().prepareStatement(sql)) {
                for (int i = 0; i < pruebas.size(); i++) {
                    ps.setInt(parameterNumber++, pruebas.get(i).getIdTest());
                    ps.setInt(parameterNumber++, pruebas.get(i).getIdPrograma());
                    System.err.println(pruebas.get(i).getIdPrograma());
                    ps.setString(parameterNumber++, pruebas.get(i).getRegistro());
                    ps.setString(parameterNumber++, pruebas.get(i).getPeriodo());
                    ps.setString(parameterNumber++, pruebas.get(i).getIdentificacion());
                    ps.setString(parameterNumber++, pruebas.get(i).getNombre());
                    ps.setInt(parameterNumber++, pruebas.get(i).getComunicacion_escrita());
                    ps.setInt(parameterNumber++, pruebas.get(i).getRazonamiento_cuantitativo());
                    ps.setInt(parameterNumber++, pruebas.get(i).getLectura_critica());
                    ps.setInt(parameterNumber++, pruebas.get(i).getCompetencias_ciudadanas());
                    ps.setInt(parameterNumber++, pruebas.get(i).getIngles());
                    ps.setString(parameterNumber++, pruebas.get(i).getNivel());
                }
                ps.executeUpdate();
            }
            getConnection().close();
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
    public List<PruebaModel> importarcsv(String x, int y, int z) {
        List<PruebaModel> usuarios = new ArrayList<>();
        try {
            CsvReader leerDatos = new CsvReader(x);
            leerDatos.readHeaders();

            while (leerDatos.readRecord()) {
                int idTest = y;
                int idPrograma = z;
                String registro = leerDatos.get(0);
                String periodo = leerDatos.get(1);
                String identificacion = leerDatos.get(2);
                String nombre = leerDatos.get(3);
                int comunicacion_escrita = Integer.parseInt(leerDatos.get(4));
                int razonamiento_cuantitativo = Integer.parseInt(leerDatos.get(5));
                int lectura_critica = Integer.parseInt(leerDatos.get(6));
                int competencias_ciudadanas = Integer.parseInt(leerDatos.get(7));
                int ingles = Integer.parseInt(leerDatos.get(8));

                String nivel = leerDatos.get(9);
                usuarios.add(new PruebaModel(idTest, idPrograma, registro, periodo, identificacion, nombre,
                        comunicacion_escrita, razonamiento_cuantitativo, lectura_critica,
                        competencias_ciudadanas, ingles,
                        nivel));
            }
            leerDatos.close();
            System.out.println("LISTA DE USUARIOS DEL CSV\n");
            for (PruebaModel user : usuarios) {
                System.out.println(
                       "idTest"+ user.getIdTest()+"/ " + "idPrueba "+
                        user.getIdPrograma()
                );
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return usuarios;
    }
}
