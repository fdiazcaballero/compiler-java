package Traductor;

public class Tipos {
  public static final boolean tint=true;
  public static final boolean tbool=false;

  public static String tipoToString(boolean tipo) {
    if (tipo==tint) {
      return "int";
    } else {
      return "boolean";
    }
  }
}
 
