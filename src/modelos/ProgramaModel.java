
package modelos;

public class ProgramaModel {

    private int idPrograma;
    
    private String namePrograma;
    
    private String codePrograma;

    public ProgramaModel(int idPrograma, String namePrograma, String codePrograma) {
        this.idPrograma = idPrograma;
        this.namePrograma = namePrograma;
        this.codePrograma = codePrograma;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public String getNamePrograma() {
        return namePrograma;
    }

    public String getCodePrograma() {
        return codePrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public void setNamePrograma(String namePrograma) {
        this.namePrograma = namePrograma;
    }

    public void setCodePrograma(String codePrograma) {
        this.codePrograma = codePrograma;
    }
    
}

