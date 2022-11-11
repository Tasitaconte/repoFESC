package Dao;

import java.util.List;
import modelos.PruebaModel;

public interface IDaoCarga {

    List<PruebaModel> importarcsv(String x, int y);

    boolean insertarMySQL(List<PruebaModel> pruebas);
}
