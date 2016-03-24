package AST;

import Traductor.*;

//No terminal <Expr>
public interface Exp { 
  public boolean calculaAS1CompruebaTipos() throws TraductorExc;
  public String generaCodigo();
}

