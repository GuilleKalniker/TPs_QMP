package QMP4.Conjuntos;

import QMP4.Prenda.Prenda;

import java.util.List;

public class Guardarropas {
  List<Prenda> prendas;

  public Guardarropas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Atuendo> todasLasPosiblesCombinaciones(){
    //TODO logica para que devuelva las combinaciones
  }
}
