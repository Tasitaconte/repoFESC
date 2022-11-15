package controladores;

import Dao.DaoPrograma;
import Dao.DaoPrueba;
import Dao.IDaoPrueba;
import Dao.IDaoPrograma;
import clases.libPersonal;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelos.ProgramaModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    static ControladorTabla ct = new ControladorTabla();
    static ControladorCarga cC = new ControladorCarga();
    static VistaCarga vista = new VistaCarga();

    public static void inicio() {
        libPersonal.styleWindows();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        setAll();
    }

    public static void cerrar() {
        vista.setVisible(false);
    }

    public static void setAll() {
        setPrueba();
        setPrograma();
        setProgramaFiltro();
        setPruebaFiltro();
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
        JFileChooser chooser = new JFileChooser();
        if (getPrograma() == 0 || getPrueba() == 0) {
            JOptionPane.showMessageDialog(chooser, "Seleccione el programa o prueba");
        } else {
            cC.btnCarga(btnObtencion(), getPrograma(), getPrueba());
        }
    }

    public static String btnObtencion() {
        return cC.btn_obtencion(vista);
    }

    public static void btn_buscar() {
        ct.btn_buscar(vista);
    }

    public static void limpiarRows() {
        ct.limpiarRows(vista);
    }
}
