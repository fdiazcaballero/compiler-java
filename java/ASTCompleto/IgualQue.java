package AST;

import Traductor.*;

//<Expr> ::= <Expr> = <Expr>
public class IgualQue implements Exp {
  private Exp exp1, exp2;

  public IgualQue(Exp e1, Exp e2) {
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

    if (exp1.calculaAS1CompruebaTipos() != exp2.calculaAS1CompruebaTipos()) {
      throw new TipoExc(8);
    }
    return Tipos.tbool; 
  }

  public String generaCodigo() {
    String abreP="(";
    String cierraP=")";

    return abreP + exp1.generaCodigo() + " == " + 
      exp2.generaCodigo() + cierraP;
  }
}


