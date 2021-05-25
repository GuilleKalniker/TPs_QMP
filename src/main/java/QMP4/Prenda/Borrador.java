package QMP4.Prenda;

import QMP4.Clima.Humedad;

//Este va a ser mi builder
public class Borrador {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama = Trama.LISA;
  private Color colorPrincipal;
  private Color colorSecundario;
  private int temperaturaMaxima;
  private Humedad humedad;

  public Borrador(TipoDePrenda tipoDePrenda) {
    //TODO: validateNonNull
    this.tipoDePrenda = tipoDePrenda;
  }

  public void especificarColorPrincipal(Color colorPrincipal) {
    //TODO: validateNonNull
    this.colorPrincipal = colorPrincipal;
  }

  public void especificarMaterial(Material material) {
    //TODO: validateNonNull
    this.validarMaterialConsistenteConTipoDePrenda(material);
    this.material = material;
  }

  public void especificarTrama(Trama trama) {
    //TODO: validateNonNull y por defecto lisa
    this.trama = trama;
  }
  public void especificarTemperaturaMaxima(int temperaturaMaxima) {
    //TODO: validateNonNull y por defecto lisa
    this.temperaturaMaxima = temperaturaMaxima;
  }
  public void especificarHumedad(Humedad humedad) {
    //TODO: validateNonNull y por defecto lisa
    this.humedad = humedad;
  }

  public Prenda crearPrenda() {
    //TODO: validateNonNull
    return new Prenda(this.tipoDePrenda, this.material, this.trama, this.colorPrincipal, this.colorSecundario,this.temperaturaMaxima,this.humedad);
  }
  public boolean validarMaterialConsistenteConTipoDePrenda(Material material) {
    //TODO
    return true;
  }

}
