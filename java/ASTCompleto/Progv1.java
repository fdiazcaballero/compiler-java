package AST;

import Traductor.*;
import java.io.*;

//<Prog> ::= PROG IDENT <In> <Out> <Local> <Body>
public class Progv1 implements Prog {
  private String nombrePrograma;
  private LDecl declIn;
  private LDecl declOut;
  private LDecl declLocal;
  private Sentencia sent;

  public Progv1(String n, LDecl di, LDecl dou, LDecl dl, Sentencia s) {
    nombrePrograma=n;
    declIn=di;
    declOut=dou;
    declLocal=dl;
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

  public LDecl getDeclLocal() {
    return declLocal;
  }

  public Sentencia getSent() {
    return sent;
  }

  public void calculaAH1TipoVar() throws TraductorExc {
    declIn.calculaAH1TipoVar();  
    declOut.calculaAH1TipoVar();  
    declLocal.calculaAH1TipoVar();  
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
    declLocal.generaVariablesLocales(w);
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

