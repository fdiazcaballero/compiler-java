package AST;

import Traductor.*;
import java.io.*;

//<Sentencia> ::= <Asignacion>
public class Asignacion implements Sentencia {
  private String ident;
  private Exp exp;

  public Asignacion(String s, Exp e) {
    ident=s;
    exp=e;
  }

  public String getIdent() {
    return ident;
  }

  public Exp getExp() {
    return exp;
  }

  public void calculaAS1CompruebaTipos() throws TraductorExc {
    if (TablaSimbolos.getTipo(ident) != exp.calculaAS1CompruebaTipos()) {
      throw new TipoExc(1);
    }
  }

  public void generaCodigo(BufferedWriter w, String indent) throws IOException {
    w.write(indent + ident + "= " + exp.generaCodigo() + ";");
  }
}

