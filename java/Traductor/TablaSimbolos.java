package Traductor;

import java.util.Vector;

public class TablaSimbolos {
  private static Vector tabla=new Vector();

  public TablaSimbolos() {
  }

  public static void creaEntrada(String nombre, boolean tipo) throws DoubleDefExc {
    EntradaTabla e=TablaSimbolos.busca(nombre);

    if (e==null) {
      e=new EntradaTabla(nombre,tipo);
      tabla.addElement(e);
    } else {
      throw  new DoubleDefExc(nombre);
    }
  }

  public static boolean getTipo(String nombre) throws VarNoDefExc {
    EntradaTabla e=TablaSimbolos.busca(nombre);

    if (e==null) {
      throw new VarNoDefExc(nombre);
    } 
    return e.getTipo();
  }

  private static EntradaTabla busca(String nombre) {
    EntradaTabla e=null;
    int i=0;

    while(i<tabla.size()) {
      e= (EntradaTabla) tabla.elementAt(i);
      if (e.getNombre().equals(nombre)) break;
      e= null;
      i++;
    }
    return e;
  } 
}  
