package controladores;

import Dao.DaoResultados;
import Dao.IDaoResultados;
import java.awt.Button;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.PruebaModel;
import vista.VistaCarga;

public class ControladorTabla extends JFrame{

    static DefaultTableModel modelo;
   
  //  private label1;
    // Esta función almacena los datos traidos de la db y los muestra en la jTable(table)
    public void btn_buscar(VistaCarga vista, int x, int y) {
       
    
        vista.getTable().setDefaultRenderer(Object.class, new imgTable());
        JLabel label1 = new JLabel("hola");
        
        JFileChooser chooser = new JFileChooser();
        IDaoResultados iDaoResultados = new DaoResultados();
        ArrayList<PruebaModel> p = iDaoResultados.cliente(x, y);
        modelo = (DefaultTableModel) vista.getTable().getModel();
        
        Object[] cl = new Object[p.size()];
        if (p.isEmpty()) {
            JOptionPane.showMessageDialog(chooser, "NO HAY DATOS CARGADOS");
        } else {
          /*  for (int i = 0; i < 20; i++) {
                 cl[0] = p.get(i).getNombre();
                cl[1] = p.get(i).getComunicacion_escrita();
                cl[2] = p.get(i).getRazonamiento_cuantitativo();
                cl[3] = p.get(i).getLectura_critica();
                cl[4] = p.get(i).getCompetencias_ciudadanas();
                cl[5] = p.get(i).getIngles();
                cl[6] = p.get(i).getNivel();*/
                
              // cl[0] = new JLabel(new ImageIcon(getClass().getResource("/resources/indice.png")));
               // impError(p.get(i).getIdentificacion());
                modelo.addRow(new Object[] {"thomas", label1
              
                });
            }
            vista.getTable().setModel(modelo);
        }
    }

    //Esta función limpia la Jtable(Table) dejando los rows en 0
   /* public void limpiarRows(VistaCarga vista) {
        modelo = (DefaultTableModel) vista.getTable().getModel();
        int coutRow = modelo.getRowCount();
        for (int i = 0; i < coutRow; i++) {
            modelo.removeRow(0);
        }
        vista.getTable().setModel(modelo);
    }

    //Funcion para evento del botón
    public void botonDatos() {
        Button btnDatos = new Button("Botón B1");
    }

    public void impError(String x) {
        System.err.println(x);
    }*/

//}
