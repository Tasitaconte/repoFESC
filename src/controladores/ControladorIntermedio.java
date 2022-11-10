package controladores;

import Dao.DaoCarga;
import Dao.IDaoCarga;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void btnCargar() {
        IDaoCarga iDaoCarga = new DaoCarga();
        JFileChooser chooser = new JFileChooser();

        String path = btnObtencion();
        System.out.println(path);
        List<PruebaModel> importC = iDaoCarga.importarcsv(path);
        if (iDaoCarga.insertarMySQL(importC)) {
            JOptionPane.showMessageDialog(chooser, "Datos Cargados");
        } else {
            JOptionPane.showMessageDialog(chooser, "Fallo a la hora de guardar intente de nuevo");
        }

    }

    //obtiene la ruta del archivo
    public static String btnObtencion() {
        boolean activado = true;
        do {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(filter);

            int option = chooser.showOpenDialog(vista);
            if (option == JFileChooser.APPROVE_OPTION) {

                String fileName = chooser.getSelectedFile().getPath();
                String ext = getExtensione(fileName);
                if (compExt(ext) != activado) {
                    return fileName;
                }
            }
            if (option == JFileChooser.CANCEL_OPTION) {
                activado = !activado;
            }
        } while (activado);
        return null;
    }

    //comparacion de extension
    public static boolean compExt(String ext) {
        JFileChooser chooser = new JFileChooser();
        // chooser.setFileFilter(filter);
        if (!"csv".equals(ext)) { ///condición para solo ser seleccionados csv;
            JOptionPane.showMessageDialog(chooser, "Archivo incompatible porfavor elija un archivo .csv");
        } else {
            return false;
        }
        return true;
    }

    //Obtiene la extensión de los archivos
    public static String getExtensione(String ext) {
        String fileName = ext;
        String fe = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            fe = fileName.substring(i + 1);
        }
        return fe;
    }
}
