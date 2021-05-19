package QMP4;

public class TipoDePrenda {
  private Categoria categoria;
  private AfinidadClima afinidadCLima;

  public TipoDePrenda(Categoria categoria, AfinidadClima afinidadCLima) {
    this.categoria = categoria;
    this.afinidadCLima = afinidadCLima;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public AfinidadClima getAfinidad() {
    return afinidadCLima;
  }


  //constant ZAPATO = new TipoDePrenda(CALZADO, FRIO)
  //constant REMERA = new TipoDePrenda(PARTE_SUPERIOR, CALOR)
  //constant PANTALON = new TipoDePrenda(PARTE_INFERIOR, TEMPLADO)
}
