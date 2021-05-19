package QMP4;

public class AfinidadClima {
  String descripcion;
  int minTemp;
  int maxTemp;
  boolean lluvia;

  public AfinidadClima(String descripcion, int minTemp, int maxTemp, boolean lluvia) {
    this.descripcion = descripcion;
    this.minTemp = minTemp;
    this.maxTemp = maxTemp;
    this.lluvia = lluvia;
  }

  public int getMinTemp() {
    return minTemp;
  }

  public int getMaxTemp() {
    return maxTemp;
  }

  public boolean isLluvia() {
    return lluvia;
  }
}
