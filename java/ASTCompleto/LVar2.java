package AST;

import Traductor.*;
import java.io.*;

//<LVar> ::= IDENT
public class LVar2 implements LVar {
  private String ident;
  private boolean AH1TipoVar;

  public LVar2(String i) {
    ident=i;
  }

  public String getIdent(){
    return ident;
  }

  public void calculaAH1TipoVar(boolean tipo) throws TraductorExc {
    AH1TipoVar=tipo;
    TablaSimbolos.creaEntrada(ident,tipo);
  }    

  public boolean getAH1TipoVar(){
    return AH1TipoVar;
  }    

  public String generaArgumentos() {
    return Tipos.tipoToString(AH1TipoVar) + " " + ident;
  }

  public String generaVariablesLocales() {
    return ident;
  }

  public void generaResultado(BufferedWriter w) throws IOException {
    if (AH1TipoVar==Tipos.tint) {
      w.write("  " + "_v.addElement(new VariableInt(\"" + ident + "\",new Integer(" +
              ident + ")));");
    } else {
      w.write("  " + "_v.addElement(new VariableBool(\"" + ident + "\",new Boolean(" +
              ident + ")));");
    }
  }    
}

