package QMP4;

import java.util.List;
import java.util.Map;

public class AtuendoManager {

  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas;
  int cantLluvia = (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
  int temperatura =  condicionesClimaticas.get(0).get("Temperature").get("Value");

  public AtuendoManager(String ciudad) {
    this.condicionesClimaticas = apiClima.getWeather(ciudad);
  }

  public Prenda sugerirParteSuperior(List<Prenda> ropero){
    //TODO: Logica para seleccionar una parte sup acorde al clima
  }
  public Prenda sugerirParteInferior(List<Prenda> ropero){
    //TODO: Logica para seleccionar una parte sup acorde al clima
  }
  public Prenda sugerirAccesorio(List<Prenda> ropero){
    //TODO: Logica para seleccionar una parte sup acorde al clima
  }
  public Prenda sugerirCalzado(List<Prenda> ropero){
    //TODO: Logica para seleccionar una parte sup acorde al clima
  }

  public Atuendo crearAtuendo(List<Prenda> ropero) {
    //TODO: validateNonNull
    return new Atuendo(
            this.sugerirParteSuperior(ropero),
            this.sugerirParteInferior(ropero),
            this.sugerirAccesorio(ropero),
            this.sugerirCalzado(ropero)
        );
  }
}
