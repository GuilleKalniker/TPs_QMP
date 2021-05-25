package QMP4.Atuendo;

import QMP4.Prenda.Prenda;

public class Sacar  implements Solicitud {
  private Prenda prenda;

  public Sacar(Prenda prenda) {
    this.prenda = prenda;
  }

  public void ejecutarEn(Guardarropas guardarropas){
    guardarropas.getPrendas().remove(prenda);
  }
  public void deshacerEn(Guardarropas guardarropas){guardarropas.getPrendas().add(prenda);}

}
