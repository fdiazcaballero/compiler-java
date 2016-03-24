package Traductor;

public class EntradaTabla {
  private String nombre;
  private boolean tipo;

  public EntradaTabla(String n, boolean t) {
    nombre=n;
    tipo=t;
  }

  public String getNombre() {
    return nombre;
  }

  public boolean getTipo() {
    return tipo;
  }
}
