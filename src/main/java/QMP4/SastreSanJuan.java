package QMP4;

public class SastreSanJuan extends Sastre{
  @Override
  protected Prenda fabricarParteSuperior() {
    /*
    Borrador borrador = new Borrador(TipoDePrenda.CHOMBA)
    borrador.especificarColor(new Color(....))
    borrador.especificarMaterial(PIQUE)
    return borrador.crearPrenda()
    */
    return null;
  }

  @Override
  protected Prenda fabricarParteInferior() {
    /*
    borrador = new Borrador(PANTALON)
    borrador.especificarColor(new Color(....))
    borrador.especificarMaterial(ACETATO)
    return borrador.crearPrenda()
     */
    return null;
  }

  @Override
  protected Prenda fabricarCalzado() {
    return null;
  }
}
