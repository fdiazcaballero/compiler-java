import LibParaCodigoGenerado.*;
import java.util.*;

public class CVarNoIni {

public static Vector Ejem5(int a, int b, boolean f, boolean g, int h) {

  Vector _v=new Vector();
  int c, d;
  boolean e;
  boolean i;

  c= a+b;
  d= b+h;
  if ((a == b)) {
    if (f) {
      d= 1;
      e= true;
    }
    i= (a+a == h+b);
    if ((g == i)) {
      d= 2;
      e= false;
    }
  }
  _v.addElement(new VariableInt("c",new Integer(c)));
  _v.addElement(new VariableInt("d",new Integer(d)));
  _v.addElement(new VariableBool("e",new Boolean(e)));
  return _v;
}
}
