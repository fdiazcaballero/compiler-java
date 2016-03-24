package AST;

import Traductor.*;
import java.io.*;

//<LDecl> ::= <Decl>
public class LDecl2 implements LDecl {
  private Decl d;

  public LDecl2(Decl d1) {
    d=d1;
  }

  public Decl getD(){
    return d;
  }

  public void calculaAH1TipoVar() throws TraductorExc {
    d.calculaAH1TipoVar();
  }

  public String generaArgumentos() {
    return d.generaArgumentos();
  }

  public void generaVariablesLocales(BufferedWriter w) throws IOException {
    w.write("  " + d.generaVariablesLocales() + ";");
    w.newLine();
  }

  public void generaResultado(BufferedWriter w) throws IOException {
    d.generaResultado(w);
  }
}

