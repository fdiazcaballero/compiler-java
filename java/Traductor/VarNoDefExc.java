package Traductor;

public class VarNoDefExc extends TraductorExc {
     
  private String msg;

  public VarNoDefExc(String s) {
     msg = "La variable " + s + " no ha sido declarada\n";
       }

  public String toString() {
     return msg;
       }
}
