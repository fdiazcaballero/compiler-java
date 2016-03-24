package AST;

import Traductor.*;
import java.io.*;

//<Sentencia> ::= <Condicional>
public class Condicional implements Sentencia {
  private Exp expL;
  private Sentencia sentThen;

  //if-then
  public Condicional(Exp e, Sentencia s1) {
    expL=e;
    sentThen=s1;
  }

  public Exp getExpL() {
    return expL;
  }

  public Sentencia getSentThen() {
    return sentThen;
  }

  public void calculaAS1CompruebaTipos() throws TraductorExc {
    if (expL.calculaAS1CompruebaTipos() != Tipos.tbool) {
      throw new TipoExc(2);
    }
    sentThen.calculaAS1CompruebaTipos();
  }

  public void generaCodigo(BufferedWriter w, String indent) throws IOException {
    w.write(indent + "if (" + expL.generaCodigo() + ") {");
    w.newLine();
    sentThen.generaCodigo(w, indent + "  ");
    w.newLine();
    w.write(indent + "}");
  }
}

