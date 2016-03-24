package AST;

import Traductor.*;

//<Expr> ::= <Expr> + <Expr>
public class Suma implements Exp {
  private Exp exp1, exp2;

  public Suma(Exp e1, Exp e2) {
    exp1=e1;
    exp2=e2;
  }

  public Exp getExp1() {
    return exp1;
  }

  public Exp getExp2() {
    return exp2;
  }

  public boolean calculaAS1CompruebaTipos() throws TraductorExc {
    if (!((exp1.calculaAS1CompruebaTipos() == Tipos.tint) &&
        (exp2.calculaAS1CompruebaTipos() == Tipos.tint))) {
      throw new TipoExc(4);
    }
    return Tipos.tint; 
  }

  public String generaCodigo() {
    return exp1.generaCodigo() + "+" + 
      exp2.generaCodigo();
  }
}


