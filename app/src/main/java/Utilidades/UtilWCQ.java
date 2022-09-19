package Utilidades;

public class UtilWCQ {
    public static final String TABLA_CURSO="tblCurso";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_DESCRIPCION="descripcion";
    public static final String CAMPO_DURACION="duracion";
    public static final String CAMPO_IMAGEN="imagen";
    public static final String CREAR_TABLA_CURSO="CREATE TABLE "+TABLA_CURSO+" ("+CAMPO_ID+" INTEGER, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_DESCRIPCION+" TEXT, "+CAMPO_DURACION+" INTEGER, "+CAMPO_IMAGEN+" TEXT)";
}
