package LibParaCodigoGenerado;

public class VariableBool extends Variable {
  private Boolean valor;

  public VariableBool(String n, Boolean v) {
    super(n);
    valor=v;
  }

  public Boolean getValor() {
    return valor;
  }
}
