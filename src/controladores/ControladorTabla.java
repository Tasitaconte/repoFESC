package controladores;

import Dao.DaoResultados;
import Dao.IDaoResultados;
import static controladores.ControladorIntermedio.modelo;
import static controladores.ControladorIntermedio.vista;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorTabla {

    static VistaCarga vista = new VistaCarga();

    public static void setRows() {
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
}
