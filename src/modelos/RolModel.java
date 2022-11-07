
package modelos;

public class RolModel {
    
    private int idRol;
    
    private String namePrograma;

    public RolModel(int idRol, String namePrograma) {
        this.idRol = idRol;
        this.namePrograma = namePrograma;
    }

    public int getIdRol() {
        return idRol;
    }

    public String getNamePrograma() {
        return namePrograma;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setNamePrograma(String namePrograma) {
        this.namePrograma = namePrograma;
    }
    
}
