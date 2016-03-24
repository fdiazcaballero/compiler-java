package AST;

import Traductor.*;
import java.io.*;

//<LDecl> ::= <Decl> ; <LDecl>
public class LDecl1 implements LDecl {
  private Decl d;
  private LDecl ld;

  public LDecl1(Decl d1, LDecl ld1) {
    d=d1;
    ld=ld1;
  }

  public Decl getD(){
    return d;
  }

  public LDecl getLd(){
    return ld;
  }

  public void calculaAH1TipoVar() throws TraductorExc {
    d.calculaAH1TipoVar();
    ld.calculaAH1TipoVar();
  }

  public String generaArgumentos() {
    return d.generaArgumentos() + ", " + ld.generaArgumentos();
  }

  public void generaVariablesLocales(BufferedWriter w) throws IOException {
    w.write("  " + d.generaVariablesLocales() + ";");
    w.newLine();
    ld.generaVariablesLocales(w);
  }

  public void generaResultado(BufferedWriter w) throws IOException {
    d.generaResultado(w);
    w.newLine();
    ld.generaResultado(w);
  }
}

