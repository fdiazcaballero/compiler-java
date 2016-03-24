package LibParaCodigoGenerado;

public class VariableInt extends Variable {
  private Integer valor;

  public VariableInt(String n, Integer v) {
    super(n);
    valor=v;
  }

  public Integer getValor() {
    return valor;
  }
}
