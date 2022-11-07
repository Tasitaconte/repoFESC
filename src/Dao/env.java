package Dao;

public class env {

    //DATOS DATABASES
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String DATABASE = "vaar";
    public static final String HOST = "jdbc:mysql://localhost";

    //TABLA USER
    public static String T_USER;
    
    public static int ID_USER;
    public static String NAME_USER;
    public static String SURNAME_USER;
    public static String EMAIL_USER;

    //TABLA ROL
    public static String T_ROL;

    public static int ID_ROL;
    public static String NAME_ROL;

    //TABLA INSTITUCION
    public static String T_INSTITUCION;

    public static int ID_INSTITUCION;
    public static String NAME_INSTITUCION;

    //TABLA PROGRAMA
    public static String T_PROGRAMA;

    public static int ID_PROGRAMA;
    public static String NAME_PROGRAMA;
    public static String CODE_PROGRAMA;

    //TABLA PRUEBA
    public static String PRUEBA;

    public static int ID_PRUEBA;
    public static String NAME_PRUEBA;
    public static String DETAIL_PRUEBA;
}
