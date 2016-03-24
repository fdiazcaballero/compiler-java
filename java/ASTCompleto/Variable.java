package AST;

import Traductor.*;

//<Expr> ::= IDENT
public class Variable implements Exp {
  private String ident;

  public Variable(String s) {
    ident=s;
  }

  public String getIdent() {
    return ident;
  }

  public boolean calculaAS1CompruebaTipos() throws TraductorExc {
    return TablaSimbolos.getTipo(ident);
  }

  public String generaCodigo() {
    return ident;
  }
}

