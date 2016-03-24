package AST;

import Traductor.*;
import java.io.*;

//<Sentencia> ::= <Sentencia> ; <Sentencia>
public class SentenciaCompuesta implements Sentencia {
  private Sentencia sent1, sent2;

  public SentenciaCompuesta(Sentencia s1, Sentencia s2) {
    sent1= s1;
    sent2= s2;
  }

  public Sentencia getSent1(){
    return sent1;
  }

  public Sentencia getSent2(){
    return sent2;
  }

  public void calculaAS1CompruebaTipos() throws TraductorExc {
    sent1.calculaAS1CompruebaTipos();
    sent2.calculaAS1CompruebaTipos();
  }

  public void generaCodigo(BufferedWriter w, String indent) throws IOException {
    sent1.generaCodigo(w, indent);
    w.newLine();
    sent2.generaCodigo(w, indent);
  }
}

