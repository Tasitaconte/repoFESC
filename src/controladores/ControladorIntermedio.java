package controladores;

import Dao.DaoCarga;
import Dao.DaoPrograma;
import Dao.DaoPrueba;
import Dao.IDaoPrueba;
import Dao.IDaoCarga;
import Dao.IDaoPrograma;
import clases.libPersonal;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.ProgramaModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        libPersonal.styleWindows();

        vista.setLocationRelativeTo(null);
        setPrueba();
        setPrograma();
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

    public static void setPrograma() {
        IDaoPrograma iDaoPrograma = new DaoPrograma();
        vista.getPruebaPrograma().removeAllItems();
        vista.getPruebaPrograma().addItem("Elija el programa");
        for (ProgramaModel p : iDaoPrograma.namePrograma()) {
            vista.getPruebaPrograma().addItem(p.getNamePrograma());
        }
    }

    public static int getPrueba() {
        return vista.getPruebaSeleccion().getSelectedIndex();
    }

    public static int getPrograma() {
        return vista.getPruebaPrograma().getSelectedIndex();
    }

    public static void limpiar() {
        vista.getPruebaSeleccion().setSelectedIndex(0);
        vista.getPruebaPrograma().setSelectedIndex(0);
    }

    public static void btnCargar() {
        IDaoCarga iDaoCarga = new DaoCarga();
        JFileChooser chooser = new JFileChooser();

        if (getPrueba() == 0 || getPrograma() == 0) {
            JOptionPane.showMessageDialog(chooser, "Seleccione el programa o prueba");
        } else {
            if (iDaoCarga.insertarMySQL(iDaoCarga.importarcsv(btnObtencion(), getPrueba(), getPrograma()))) {
                JOptionPane.showMessageDialog(chooser, "Datos Cargados");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(chooser, "Fallo a la hora de guardar intente de nuevo");
                limpiar();
            }
        }

    }

    public static void table() {

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
                limpiar();
                return null;
            }
        } while (true);
    }
}
