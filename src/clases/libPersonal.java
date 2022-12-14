package clases;

import controladores.ControladorIntermedio;
import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class libPersonal  extends Object
        implements Serializable {

    public static boolean compExt(String ext) {
        JFileChooser chooser = new JFileChooser();
        if (!"csv".equals(ext)) { ///condición para solo ser seleccionados csv;
            JOptionPane.showMessageDialog(chooser, "Archivo incompatible porfavor elija un archivo .csv");
        } else {
            return false;
        }
        return true;
    }

    public static String getExtensione(String ext) {
        String fileName = ext;
        String fe = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            fe = fileName.substring(i + 1);
        }
        return fe;
    }

    public static String getNumber(String ext) {
        Pattern patron = Pattern.compile("-?\\d+");
        Matcher resultados = patron.matcher(ext);

        while (resultados.find()) {
            return resultados.group();
        }
        return resultados.group();
    }

    public static void CentrarJFrame() {
        JFrame j = new JFrame();
        j.setLocationRelativeTo(null);
    }
    
    public static void styleWindows(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ControladorIntermedio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
