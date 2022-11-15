package controladores;

import Dao.DaoResultados;
import Dao.IDaoResultados;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorTabla {

    static DefaultTableModel modelo;

    public void btn_buscar(VistaCarga vista) {
        JFileChooser chooser = new JFileChooser();
        IDaoResultados iDaoResultados = new DaoResultados();
        ArrayList<PruebaModel> p = iDaoResultados.cliente();
        modelo = (DefaultTableModel) vista.getTable().getModel();
        Object[] cl = new Object[iDaoResultados.cliente().size()];
        if (iDaoResultados.cliente().isEmpty()) {
             JOptionPane.showMessageDialog(chooser, "NO HAY DATOS CARGADOS");
        } else {
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
    }

    public void limpiarRows(VistaCarga vista) {
        modelo = (DefaultTableModel) vista.getTable().getModel();
        int coutRow = modelo.getRowCount();
        for (int i = 0; i < coutRow; i++) {
            modelo.removeRow(0);
        }
        vista.getTable().setModel(modelo);
    }
}
