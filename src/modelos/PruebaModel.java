package modelos;

public class PruebaModel {

    private int idPrueba, idTest, idPrograma, comunicacion_escrita,
            razonamiento_cuantitativo,
            lectura_critica,
            competencias_ciudadanas,
            ingles;
    private String nivel, nameTest, registro,
            periodo,
            identificacion,
            nombre;

    public PruebaModel() {

    }

    public PruebaModel(int idTest, int idPrograma,String registro, String periodo, String identificacion, String nombre ,int comunicacion_escrita, int razonamiento_cuantitativo, int lectura_critica, int competencias_ciudadanas, int ingles, String nivel) {
        this.idTest = idTest;
        this.idPrograma = idPrograma;
        this.registro = registro;
        this.periodo = periodo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.comunicacion_escrita = comunicacion_escrita;
        this.razonamiento_cuantitativo = razonamiento_cuantitativo;
        this.lectura_critica = lectura_critica;
        this.competencias_ciudadanas = competencias_ciudadanas;
        this.ingles = ingles;
        this.nivel = nivel;
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

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public int getComunicacion_escrita() {
        return comunicacion_escrita;
    }

    public void setComunicacion_escrita(int comunicacion_escrita) {
        this.comunicacion_escrita = comunicacion_escrita;
    }

    public int getRazonamiento_cuantitativo() {
        return razonamiento_cuantitativo;
    }

    public void setRazonamiento_cuantitativo(int razonamiento_cuantitativo) {
        this.razonamiento_cuantitativo = razonamiento_cuantitativo;
    }

    public int getLectura_critica() {
        return lectura_critica;
    }

    public void setLectura_critica(int lectura_critica) {
        this.lectura_critica = lectura_critica;
    }

    public int getCompetencias_ciudadanas() {
        return competencias_ciudadanas;
    }

    public void setCompetencias_ciudadanas(int competencias_ciudadanas) {
        this.competencias_ciudadanas = competencias_ciudadanas;
    }

    public int getIngles() {
        return ingles;
    }

    public void setIngles(int ingles) {
        this.ingles = ingles;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
