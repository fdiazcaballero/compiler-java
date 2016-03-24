package AST;

import Traductor.*;
import java.io.*;

//No terminal <LDecl>
public interface LDecl { 
  public void calculaAH1TipoVar() throws TraductorExc;
  public String generaArgumentos();
  public void generaVariablesLocales(BufferedWriter w) throws IOException;
  public void generaResultado(BufferedWriter w) throws IOException;
}

