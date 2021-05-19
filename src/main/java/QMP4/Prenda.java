package QMP4;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrincipal, Color colorSecundario) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

}
