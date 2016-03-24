package AST;

import Traductor.*;
import java.io.*;

//<Decl> ::= <Tipo> <LVar>
public class Decl {
  private boolean tipo;
  private LVar lv;

  public Decl(boolean t, LVar lv1) {
    tipo=t;
    lv= lv1;
  }

  public boolean getTipo(){
    return tipo;
  }

  public LVar getLv(){
    return lv;
  }

  public void calculaAH1TipoVar() throws TraductorExc {
    lv.calculaAH1TipoVar(tipo);
  }


  public String generaArgumentos() {
    return lv.generaArgumentos();
  }

  public String generaVariablesLocales() {
    return Tipos.tipoToString(tipo) + " " + lv.generaVariablesLocales();
  }

  public void generaResultado(BufferedWriter w) throws IOException {
    lv.generaResultado(w);
  }

}

