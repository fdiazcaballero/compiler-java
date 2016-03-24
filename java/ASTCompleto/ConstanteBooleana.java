package AST;

import Traductor.*;

//<Expr> ::= CLOG
public class ConstanteBooleana implements Exp {
  public boolean c;
  
  public ConstanteBooleana(boolean n) {
    c=n;
  }

  public boolean getC() {
    return c;
  }

  public boolean calculaAS1CompruebaTipos() throws TraductorExc {
    return Tipos.tbool;
  }

  public String generaCodigo() {
    Boolean b=new Boolean(c);
    return b.toString();
  }
}

