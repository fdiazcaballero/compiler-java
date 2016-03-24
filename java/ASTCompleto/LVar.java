package AST;

import Traductor.*;
import java.io.*;

//No terminal <LVar>
public interface LVar { 
  public void calculaAH1TipoVar(boolean tipo) throws TraductorExc;
  public boolean getAH1TipoVar();

  public String generaArgumentos();

  public String generaVariablesLocales();

  public void generaResultado(BufferedWriter w) throws IOException;
}

