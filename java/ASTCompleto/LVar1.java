package AST;

import Traductor.*;
import java.io.*;

//<LVar> ::= IDENT , <LVar>
public class LVar1 implements LVar {
  private String ident;
  private LVar lv;
  private boolean AH1TipoVar;

  public LVar1(String i, LVar l) {
    ident=i;
    lv= l;
  }

  public String getIdent(){
    return ident;
  }

  public LVar getLv(){
    return lv;
  }

  public void calculaAH1TipoVar(boolean tipo) throws TraductorExc {
    AH1TipoVar=tipo;
    TablaSimbolos.creaEntrada(ident,tipo);
    lv.calculaAH1TipoVar(tipo);
  }    

  public boolean getAH1TipoVar(){
    return AH1TipoVar;
  }    

  public String generaArgumentos() {
    return Tipos.tipoToString(AH1TipoVar) + " " + ident + ", " + lv.generaArgumentos();
  }

  public String generaVariablesLocales() {
    return ident + ", " + lv.generaVariablesLocales();
  }

  public void generaResultado(BufferedWriter w) throws IOException {
    if (AH1TipoVar==Tipos.tint) {
      w.write("  " + "_v.addElement(new VariableInt(\"" + ident + "\",new Integer(" +
              ident + ")));");
      w.newLine();
    } else {
      w.write("  " + "_v.addElement(new VariableBool(\"" + ident + "\",new Boolean(" +
              ident + ")));");
      w.newLine();
    }
    lv.generaResultado(w);
  }    
}

