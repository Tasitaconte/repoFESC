package controladores;

import Dao.DaoCarga;
import Dao.DaoPrueba;
import Dao.IDaoPrueba;
import Dao.IDaoCarga;
import clases.libPersonal;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        setPrueba();
        vista.setVisible(true);
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void setPrueba() {
        IDaoPrueba iDaoPrueba = new DaoPrueba();
        vista.getPruebaSeleccion().removeAllItems();
        vista.getPruebaSeleccion().addItem("Elija tipo de prueba");

        for (PruebaModel p : iDaoPrueba.nameTest()) {
            vista.getPruebaSeleccion().addItem(p.getNameTest());
        }
    }

    public static int getPrueba() {
        return vista.getPruebaSeleccion().getSelectedIndex();
    }

    public static void btnCargar() {
        IDaoCarga iDaoCarga = new DaoCarga();
        JFileChooser chooser = new JFileChooser();

        if (iDaoCarga.insertarMySQL(iDaoCarga.importarcsv(btnObtencion(), getPrueba()))) {
            JOptionPane.showMessageDialog(chooser, "Datos Cargados");
            vista.getPruebaSeleccion().setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(chooser, "Fallo a la hora de guardar intente de nuevo");
        }

    }

    //obtiene la ruta del archivoCSV
    public static String btnObtencion() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        do {
            int option = chooser.showOpenDialog(vista);

            if (option == JFileChooser.APPROVE_OPTION) {
                if (!libPersonal.compExt(libPersonal.getExtensione(chooser.getSelectedFile().getPath()))) {
                    return chooser.getSelectedFile().getPath();
                }
            }
            if (option == JFileChooser.CANCEL_OPTION) {
                return null;
            }
        } while (true);
    }
}
