package QMP4.Atuendo;

import QMP4.Prenda.Prenda;

public class Agregar implements Solicitud {
  private Prenda prenda;

  public Agregar(Prenda prenda) {
    this.prenda = prenda;
  }

  public void ejecutarEn(Guardarropas guardarropas){
    guardarropas.getPrendas().add(prenda);
  }

  public void deshacerEn(Guardarropas guardarropas){guardarropas.getPrendas().remove(prenda);}
}
