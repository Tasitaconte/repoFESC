package controladores;

import Dao.DaoCarga;
import Dao.IDaoCarga;
import clases.libPersonal;
import static controladores.ControladorIntermedio.limpiar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.VistaCarga;

public class ControladorCarga {

    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");

    public void btnCarga(String btn_obtencion, int x, int y) {
        IDaoCarga iDaoCarga = new DaoCarga();
        JFileChooser chooser = new JFileChooser();

        if (iDaoCarga.insertarMySQL(iDaoCarga.importarcsv(btn_obtencion, x, y))) {
            JOptionPane.showMessageDialog(chooser, "Datos Cargados");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(chooser, "Fallo a la hora de guardar intente de nuevo");
            limpiar();
        }

    }

    public String btn_obtencion(VistaCarga vista) {
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
