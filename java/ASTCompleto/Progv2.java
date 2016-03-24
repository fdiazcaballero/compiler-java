package AST;

import Traductor.*;
import java.io.*;

//<Prog> ::= PROG IDENT <In> <Out> <Body>
public class Progv2 implements Prog {
  private String nombrePrograma;
  private LDecl declIn;
  private LDecl declOut;
  private Sentencia sent;

  public Progv2(String n, LDecl di, LDecl dou, Sentencia s) {
    nombrePrograma=n;
    declIn=di;
    declOut=dou;
    sent= s;
  }

  public String getNombrePrograma() {
    return nombrePrograma;
  }

  public LDecl getDeclIn() {
    return declIn;
  }

  public LDecl getDeclOut() {
    return declOut;
  }

  public Sentencia getSent() {
    return sent;
  }

  public void calculaAH1TipoVar() throws TraductorExc {
    declIn.calculaAH1TipoVar();  
    declOut.calculaAH1TipoVar();  
  }

  public void calculaAS1CompruebaTipos() throws TraductorExc {
    sent.calculaAS1CompruebaTipos();
  }

  public void generaCodigo(BufferedWriter w) throws IOException {
    w.write("public static Vector " + nombrePrograma + "(" + 
            declIn.generaArgumentos() + ") {");
    w.newLine();
    w.newLine();
    w.write("  Vector _v=new Vector();");
    w.newLine();
    declOut.generaVariablesLocales(w);
    w.newLine();
    sent.generaCodigo(w, "  ");
    w.newLine();
    declOut.generaResultado(w);
    w.newLine();
    w.write("  return _v;");
    w.newLine();
    w.write("}");
  }
}

