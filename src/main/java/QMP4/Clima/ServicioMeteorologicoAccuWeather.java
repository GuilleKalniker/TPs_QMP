package QMP4.Clima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico{
    private  AccuWeatherAPI api;
    private  Duration periodoDeValidez;
    private  String direccion;
    private Map<String, EstadoDelTiempo> ultimasRespuestas;
    private LocalDateTime proximaExpiracion;

    public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez) {
      this.api = api;
      this.periodoDeValidez = periodoDeValidez;
      this.ultimasRespuestas = new HashMap<String, EstadoDelTiempo>();
    }

    public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
      if (this.ultimasRespuestas == null || this.expiro()) {
        this.ultimasRespuestas = consultarApi();
        this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
      }
      return this.ultimasRespuestas.get(direccion);
    }

  private EstadoDelTiempo consultarApi(String direccion) {
    Map<String, Object> respuesta = this.api.getWeather(direccion).get(0);
    int temperatura = (int) respuesta.get();
    Humedad humedad = (double) respuesta.get() > 0.8 ? Humedad.LLUVIOSO : Humedad.SECO;
    return new EstadoDelTiempo(temperatura, humedad);
  }

    private boolean expiro() {
      return proximaExpiracion.isAfter(LocalDateTime.now());
    }
  }




