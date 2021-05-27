package QMP4.Prenda;

import QMP4.Clima.Humedad;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;
  private int temperaturaMaxima;
  private Humedad humedad;
  private Criterio criterio;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrincipal, Color colorSecundario,int temperaturaMaxima, Humedad humedad,Criterio criterio) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
    this.humedad = humedad;
    this.criterio = criterio;
  }

  public boolean esAptaPara(int temperatura){
    return this.temperaturaMaxima < temperatura && (this.temperaturaMaxima -15) > temperatura;
  }
  public boolean esAptaPara(Humedad humedad){
    return this.humedad == humedad;
  }
  public boolean tieneCriterio(Criterio criterio){
    return this.criterio == criterio;
  }

}
