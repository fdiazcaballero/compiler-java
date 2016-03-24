import LibParaCodigoGenerado.*;
import java.util.*;

public class Probador {
  
  public static void main(String args[]) {
    Vector v= CEjem4.Ejem4(5,5, true, false, 4);
    ImprimeResultados.imprimir(v);
    v= CEjem4.Ejem4(5,5, false, true, 4);
    ImprimeResultados.imprimir(v);
    v= CEjem4.Ejem4(5,4, true, false, 4);
    ImprimeResultados.imprimir(v);
  }
}

