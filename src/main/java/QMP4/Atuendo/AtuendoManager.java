package QMP4.Atuendo;

import QMP4.Clima.EstadoDelTiempo;
import QMP4.Clima.ServicioMeteorologicoAccuWeather;

import java.util.List;
import java.util.stream.Collectors;

public class AtuendoManager {
    private ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather;
    private Guardarropas guardarropas;

    public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarrpas) {

      EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologicoAccuWeather.obtenerCondicionesClimaticas(direccion);
      List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();

          return combinaciones.stream()
              .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.getTemperatura()))
              .filter(combinacion -> combinacion.aptaParaHumedad(estadoDelTiempo.getHumedad()))
              .collect(Collectors.toList()).get(0);

    }
}
