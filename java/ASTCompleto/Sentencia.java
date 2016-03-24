package AST;

import Traductor.*;
import java.io.*;

//No terminal <Sentencia>
public interface Sentencia { 
  public void calculaAS1CompruebaTipos() throws TraductorExc;
  public void generaCodigo(BufferedWriter w, String indent) throws IOException;
}


