package dds.monedero.model;

import java.time.LocalDate;

public class Extraccion extends Movimiento{
  public Extraccion(LocalDate fecha, double monto) {
    super(fecha, monto);
  }

  @Override
  protected boolean fueDepositado(LocalDate fecha) {
    return false;
  }

  @Override
  protected boolean esDeposito() {
    return false;
  }

  @Override
  protected double getMontoExtraido() {
    return getMonto();
  }
}
