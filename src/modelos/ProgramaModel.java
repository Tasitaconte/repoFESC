package modelos;

public class ProgramaModel {

    private int idPrograma;

    private String namePrograma;

    public ProgramaModel() {

    }

    public ProgramaModel(int idPrograma, String namePrograma) {
        this.idPrograma = idPrograma;
        this.namePrograma = namePrograma;

    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public String getNamePrograma() {
        return namePrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public void setNamePrograma(String namePrograma) {
        this.namePrograma = namePrograma;
    }

}
