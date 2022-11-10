package modelos;

public class PruebaModel {

    private int idPrueba;
    private String registro;
    private String periodo;
    private String identificacion;
    private String nombre;
    private String comEscrita;

    public PruebaModel(String registro, String periodo, String identificacion, String nombre, String comEscrita) {
        this.registro = registro;
        this.periodo = periodo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.comEscrita = comEscrita;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComEscrita() {
        return comEscrita;
    }

    public void setComEscrita(String comEscrita) {
        this.comEscrita = comEscrita;
    }

}
