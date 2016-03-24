package AST;

import Traductor.*;
import java.io.*;

/* <Prog> ::=PROG IDENT [<In>] OUT [<Local>] <Body> */
public interface Prog { 
  public void calculaAH1TipoVar() throws TraductorExc;
  public void calculaAS1CompruebaTipos() throws TraductorExc;
  public void generaCodigo(BufferedWriter w) throws IOException;
}


