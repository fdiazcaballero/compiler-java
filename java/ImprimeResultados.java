import LibParaCodigoGenerado.*;
import java.util.*;

public class ImprimeResultados {

  public static void imprimir(Vector v) {
    for (int i=0; i<v.size(); i++) {
      Variable var=(Variable) v.elementAt(i);
      if (var instanceof VariableInt) {
        VariableInt vari= (VariableInt) var;
        System.out.println("Variable: " + vari.getNombre() + "; tipo: int; valor: " +
          vari.getValor().toString());
      } else {
        VariableBool varb= (VariableBool) var;
        System.out.println("Variable: " + varb.getNombre() + "; tipo: bool; valor: " +
          varb.getValor().toString());
      }
    }
  }
}
  
