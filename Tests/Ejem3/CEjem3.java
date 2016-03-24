import LibParaCodigoGenerado.*;
import java.util.*;

public class CEjem3 {

public static Vector Ejem3(int a, int b) {

  Vector _v=new Vector();
  int c, d;
  boolean e;

  c= a+b;
  d= 0;
  e= false;
  if ((a == b)) {
    d= 1;
    e= true;
  }
  _v.addElement(new VariableInt("c",new Integer(c)));
  _v.addElement(new VariableInt("d",new Integer(d)));
  _v.addElement(new VariableBool("e",new Boolean(e)));
  return _v;
}
}
