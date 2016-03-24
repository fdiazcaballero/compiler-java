package Traductor;

public class TipoExc extends TraductorExc {
     
  private String msg;

  private static final String msg0="Error de tipo indefinido: ";
  private static final String msg1=
"Error en asignación: el tipo del identificador y el de la expresión no coinciden\n";
  private static final String msg2=
"Error en sentencia if: el tipo de la condición es entero\n";
  private static final String msg4=
"Error de tipo en suma: se esperaba un operando de tipo entero\n";
  private static final String msg8=
"Error de tipo en operador igual: se esperaban operandos del mismo tipo\n";

  public TipoExc(int nErr) {
     switch(nErr) {
       case 1:
         msg = msg1;
         break;
       case 2:
         msg = msg2;
         break;
       case 4:
         msg = msg4;
         break;
       case 8:
         msg = msg8;
         break;
       default:
         msg= msg0 + nErr + "\n";
     }
  }  

  public String toString() {
     return msg;
       }
}
