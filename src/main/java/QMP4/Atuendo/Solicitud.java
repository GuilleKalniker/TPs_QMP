package QMP4.Atuendo;

import QMP4.Prenda.Prenda;

public interface Solicitud {
  public void ejecutarEn(Guardarropas guardarropas);
  public void deshacerEn(Guardarropas guardarropas);
}
