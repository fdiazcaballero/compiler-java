package Traductor;

public class DoubleDefExc extends TraductorExc {
     
  private String msg;

  public DoubleDefExc(String s) {
     msg = "La variable " + s + " ha sido declarada dos veces\n";
       }

  public String toString() {
     return msg;
       }
}
