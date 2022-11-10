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
        String sql = " INSERT INTO " + env.PRUEBA + "(" + env.REGISTRO + ","
                + env.PERIODO + "," + env.IDENTIFICACION + "," + env.NOMBRE + ","
                + env.COMUNICACION_ESCRITA + ") VALUES (?, ?, ?, ?, ?)";
        try {
            try ( PreparedStatement ps = getConnection().prepareStatement(sql)) {
                for (int i = 0; i < pruebas.size(); i++) {
                    ps.setString(1, pruebas.get(i).getRegistro());
                    ps.setString(2, pruebas.get(i).getPeriodo());
                    ps.setString(3, pruebas.get(i).getIdentificacion());
                    ps.setString(4, pruebas.get(i).getNombre());
                    ps.setString(5, pruebas.get(i).getComEscrita());
                    ps.executeUpdate();
                }
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
    public List<PruebaModel> importarcsv(String x) {
        List<PruebaModel> usuarios = new ArrayList<>();
        try {
            CsvReader leerDatos = new CsvReader(x);
            leerDatos.readHeaders();
            while (leerDatos.readRecord()) {
                String registro = leerDatos.get(0);
                String periodo = leerDatos.get(1);
                String identificacion = leerDatos.get(2);
                String nombre = leerDatos.get(3);
                String comEscrita = leerDatos.get(4);

                usuarios.add(new PruebaModel(registro, periodo, identificacion, nombre, comEscrita));
            }
            leerDatos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return usuarios;
    }
}
