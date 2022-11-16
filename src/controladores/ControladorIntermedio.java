package controladores;

import Dao.DaoPrograma;
import Dao.DaoPrueba;
import Dao.IDaoPrueba;
import Dao.IDaoPrograma;
import clases.libPersonal;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ProgramaModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorIntermedio {

    static ControladorTabla ct = new ControladorTabla();
    static ControladorCarga cC = new ControladorCarga();
    static VistaCarga vista = new VistaCarga();

    //función para visualizar la vista de carga y muestra de datos
    public static void inicio() {
        libPersonal.styleWindows();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        viewAllDItems();
    }
    //función para ocultar la vista de carga y muestra de datos
    public static void cerrar() {
        vista.setVisible(false);
    }

    //función  para inicializar los datos traidos de la db
    public static void viewAllDItems() {
        setPrueba();
        setPrograma();
        setProgramaFiltro();
        setPruebaFiltro();
    }

    //Funcion para traer y colocar los datos en los items de prueba
    public static void setPrueba() {
        IDaoPrueba iDaoPrueba = new DaoPrueba();
        vista.getPruebaSeleccion().removeAllItems();
        vista.getPruebaSeleccion().addItem("Elija tipo de prueba");
        for (PruebaModel p : iDaoPrueba.nameTest()) {
            vista.getPruebaSeleccion().addItem(p.getNameTest());
        }
    }
    //Funcion para traer y colocar los datos en los items de programa
    public static void setPrograma() {
        IDaoPrograma iDaoPrograma = new DaoPrograma();
        vista.getPruebaPrograma().removeAllItems();
        vista.getPruebaPrograma().addItem("Elija el programa");
        for (ProgramaModel p : iDaoPrograma.namePrograma()) {
            vista.getPruebaPrograma().addItem(p.getNamePrograma());
        }
    }
    //captura de la seleccion del item prueba
    public static int getPrueba() {
        return vista.getPruebaSeleccion().getSelectedIndex();
    }
    //captura de la seleccion del item programa
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
    //funcion para resetear los items seleccionados
    public static void limpiar() {
        vista.getPruebaSeleccion().setSelectedIndex(0);
        vista.getPruebaPrograma().setSelectedIndex(0);
    }  

    //Funcion de controlador para cargar los datos obtenidos por el csv
    public static void btnCargar() {
        JFileChooser chooser = new JFileChooser();
        if (getPrueba() == 0 || getPrograma() == 0) {
            JOptionPane.showMessageDialog(chooser, "Seleccione el programa o prueba");
        } else {
            cC.btnCarga(cC.btn_obtencion(vista), getPrueba(), getPrograma());
        }
    }

    //función para el controlador para la filtración de datos
    public static void btn_buscar() {
        if(getPruebaFiltro()== 0 && getProgramaFiltro()== 0){
            JOptionPane.showMessageDialog(vista, "Seleccione los datos para filtrar");
        }else{
            ct.btn_buscar(vista,getPruebaFiltro(),getProgramaFiltro());
        }
    }
    //función para el controlador de limpieza de la filtración de datos
    public static void btn_limpiarRows() {
        ct.limpiarRows(vista);
    }
}
