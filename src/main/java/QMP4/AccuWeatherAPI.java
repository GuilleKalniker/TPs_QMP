package QMP4;

import java.time.LocalDate;
import java.util.*;


public class AccuWeatherAPI {
  private int cantidadDeUsos = 0;
  private double costoPorLlamado = 0.05;
  private int cantidadLlamadosGratis = 10;
  private float dineroACobrar;
  private LocalDate fecha;

  public final List<Map<String, Object>> getWeather(String ciudad) {
    this.registrarUso();
    return Arrays.asList(new HashMap<String, Object>(){{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
          put("MobileLink", "https://m.accuweather.com/en/ar/villa-vil/7984/%22");
          put("Link", "https://www.accuweather.com/en/ar/villa-vil/7984%22");
              put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
              }});
    }});


  }

  public final void registrarUso(){
    if(LocalDate.now().isAfter(this.fecha)){
      this.setFechaActual();
      this.actualizarDineroACobrar();
      this.setcantidadDeUsos(0);
    } else {
      this.cantidadDeUsos++;
    }

  }

  public final void setFechaActual(){
    this.fecha = LocalDate.now();
  }

  public final void setcantidadDeUsos(int num){
    this.cantidadDeUsos = num;
  }

  public final void actualizarDineroACobrar(){
    if(this.getCantidadDeUsos() > this.getCantidadLlamadosGratis()){
      this.dineroACobrar += (this.getCantidadDeUsos() - this.getCantidadLlamadosGratis()) * this.getCostoPorLlamado();
    }
  }

  public int getCantidadDeUsos() {
    return cantidadDeUsos;
  }

  public double getCostoPorLlamado() {
    return costoPorLlamado;
  }

  public int getCantidadLlamadosGratis() {
    return cantidadLlamadosGratis;
  }
}
