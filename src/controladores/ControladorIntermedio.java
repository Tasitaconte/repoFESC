package controladores;

import Dao.DaoCarga;
import Dao.DaoPrograma;
import Dao.DaoPrueba;
import Dao.DaoResultados;
import Dao.IDaoPrueba;
import Dao.IDaoCarga;
import Dao.IDaoPrograma;
import Dao.IDaoResultados;
import clases.libPersonal;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.ProgramaModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    static DefaultTableModel modelo;
    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        libPersonal.styleWindows();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        setPrueba();
        setPrograma();
        setProgramaFiltro();
        setPruebaFiltro();
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

    public static void setPruebaFiltro() {
        IDaoPrueba iDaoPrueba = new DaoPrueba();
        vista.getFiltroPrueba().removeAllItems();
        vista.getFiltroPrueba().addItem("Elija tipo de prueba");
        for (PruebaModel p : iDaoPrueba.nameTest()) {
            vista.getFiltroPrueba().addItem(p.getNameTest());
        }
    }

    public static void setProgramaFiltro() {
        IDaoPrograma iDaoPrograma = new DaoPrograma();
        vista.getFiltroPrograma().removeAllItems();
        vista.getFiltroPrograma().addItem("Elija el programa");
        for (ProgramaModel p : iDaoPrograma.namePrograma()) {
            vista.getFiltroPrograma().addItem(p.getNamePrograma());
        }
    }

    public static int getPruebaFiltro() {
        return vista.getFiltroPrueba().getSelectedIndex();
    }

    public static int getProgramaFiltro() {
        return vista.getFiltroPrograma().getSelectedIndex();
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

    public static void btn_buscar() {

        IDaoResultados iDaoResultados = new DaoResultados();
        ArrayList<PruebaModel> p = iDaoResultados.cliente();
        modelo = (DefaultTableModel) vista.getTable().getModel();
        Object[] cl = new Object[iDaoResultados.cliente().size()];
        for (int i = 0; i < 20; i++) {
            cl[0] = p.get(i).getNombre();
            cl[1] = p.get(i).getCompetencias_ciudadanas();
            cl[2] = p.get(i).getCompetencias_ciudadanas();
            cl[3] = p.get(i).getCompetencias_ciudadanas();
            cl[4] = p.get(i).getCompetencias_ciudadanas();
            modelo.addRow(cl);
        }
        vista.getTable().setModel(modelo);
    }

    public static void limpiarRows() {
        modelo = (DefaultTableModel) vista.getTable().getModel();
        int coutRow = modelo.getRowCount();
        for (int i = 0; i < coutRow; i++) {
            modelo.removeRow(0);
        }
        vista.getTable().setModel(modelo);
    }

}
