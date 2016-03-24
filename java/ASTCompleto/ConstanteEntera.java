package AST;

import Traductor.*;

//<Expr> ::= CENT 
public class ConstanteEntera implements Exp {
  public int c;
  
  public ConstanteEntera(int n) {
    c=n;
  }

  public int getC() {
    return c;
  }

  public boolean calculaAS1CompruebaTipos() throws TraductorExc {
    return Tipos.tint;
  }

  public String generaCodigo() {
    Integer i= new Integer(c);
    return i.toString();
  }
}

