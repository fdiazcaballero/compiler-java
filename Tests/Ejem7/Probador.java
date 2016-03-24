import LibParaCodigoGenerado.*;
import java.util.*;

public class Probador {
  
  public static void main(String args[]) {
    Vector v= CEjem7.Ejem1(4,5,false,true);
    ImprimeResultados.imprimir(v);
    v= CEjem7.Ejem1(5,5,false,true);
    ImprimeResultados.imprimir(v);
    v= CEjem7.Ejem1(5,5,true,true);
    ImprimeResultados.imprimir(v);
  }
}

