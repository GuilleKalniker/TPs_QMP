package QMP4.Atuendo;

import QMP4.Clima.Humedad;
import QMP4.Prenda.Prenda;

public class Atuendo {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda accesorio;
  Prenda calzado;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda accesorio, Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.accesorio = accesorio;
    this.calzado = calzado;
  }

  public boolean aptaParaTemperatura(int temperatura){
    return parteInferior.esAptaPara(temperatura) && accesorio.esAptaPara(temperatura) && calzado.esAptaPara(temperatura) && parteSuperior.esAptaPara(temperatura);
  }
  public boolean aptaParaHumedad(Humedad humedad){
    return parteInferior.esAptaPara(humedad) && accesorio.esAptaPara(humedad) && calzado.esAptaPara(humedad) && parteSuperior.esAptaPara(humedad);
  }

}
