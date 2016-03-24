import AST.*;
import Parser.*;
import Lexer.*;
import java_cup.runtime.*;
import java.io.*;

public class Main {

  public static void main(String args[]) throws Exception {
    Prog p= null;
    boolean error= false;
    boolean hayPackage= false;
    String nombrePackage="";

    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 2) {
      System.out.println(
        "Uso: java Main <nombre_fichero> <nombre_clase_generada> [<opciones>]");
      System.out.println("Opciones:");
      System.out.println("-p para incluir la clase generada en un package");
      error= true;
    }

    //Realizando el parsing
    if (!error)
      try {
	parser par;
	BufferedReader br= new BufferedReader(new FileReader(args[0]));
	par= new parser(new Yylex(br));
	p= (Prog) par.parse().value;
        br.close();
	System.out.println("Analisis sintactico correcto");
      }
      catch(IOException e) {
	System.out.println("Error abriendo fichero: " + args[0]);
	error= true;
      }

    //Comprobación de tipos y creación de la tabla de símbolos
    if (!error) {
      p.calculaAH1TipoVar();
      p.calculaAS1CompruebaTipos();
      System.out.println("Analisis semantico correcto");
    }
         
    //Obteniendo los parametros de entrada
    if (!error)
      for (int i= 2; i<args.length; i++) {
	if (args[i].equals("-p")  && i < args.length-1) { 
	  hayPackage= true;
          nombrePackage=args[i+1];
          break;
	}
      }

    //GenerarCodigo
    if (!error)
      try {
        String nombreFicheroJava= args[1] + ".java";
	BufferedWriter w= new BufferedWriter(new FileWriter(nombreFicheroJava));
        if (hayPackage) {
          w.write("package " + nombrePackage + ";");
          w.newLine();
          w.newLine();
        }
        w.write("import LibParaCodigoGenerado.*;");  
        w.newLine();
        w.write("import java.util.*;");  
        w.newLine();
        w.newLine(); 
        w.write("public class " + args[1] + " {");
        w.newLine();
        w.newLine(); 
        p.generaCodigo(w);    
        w.newLine(); 
        w.write("}");
        w.newLine(); 
        w.close();
        System.out.println("Codigo generado en fichero " + nombreFicheroJava);
      } catch(IOException e) {
	System.out.println("Error abriendo fichero: " + args[1] + ".java");
	error= true;
      } 
  }   
}

	
