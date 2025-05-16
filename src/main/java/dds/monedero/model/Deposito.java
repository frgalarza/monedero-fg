package dds.monedero.model;

import java.time.LocalDate;

public class Deposito extends Movimiento{
  public Deposito(LocalDate fecha, double monto) {
    super(fecha, monto);
  }

  @Override
  protected boolean esDeposito() {
    return true;
  }

  @Override
  protected double getMontoExtraido() {
    return 0;
  }


}
