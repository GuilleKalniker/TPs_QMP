package QMP4.Atuendo;

import QMP4.Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
  private List<Prenda> prendas;
  private List<Solicitud> solicitudesPendientes;
  private List<Solicitud> solicitudesAceptadas;


  public Guardarropas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void solicitarAgregar(Prenda prenda){
    this.solicitudesPendientes.add(new Agregar(prenda));
  }
  public void solicitarSacar(Prenda prenda){
    this.solicitudesPendientes.add(new Sacar(prenda));
  }

  public void aceptarSolicitud(Solicitud solicitud){
    this.validarSolicitudPendiente(solicitud);
    solicitud.ejecutarEn(this);
    solicitudesPendientes.remove(solicitud);
    solicitudesAceptadas.add(solicitud);
  }
  public void rechazarSolicitud(Solicitud solicitud){
    this.validarSolicitudPendiente(solicitud);
    solicitudesPendientes.remove(solicitud);
  }

  public void deshacerSolicitudAceptada(Solicitud solicitud){
    if(!solicitudesAceptadas.contains(solicitud)){
      throw new RuntimeException("No era una solicitud aceptada");
    }
    solicitud.deshacerEn(this);
  }


  public void validarSolicitudPendiente(Solicitud solicitud){
    if(!solicitudesPendientes.contains(solicitud)){
      throw new RuntimeException("No era una solicitud pendiente");
    }
  }

  public List<Atuendo> todasLasPosiblesCombinaciones(){
    //TODO logica para que devuelva todas las posibles combinaciones de atuendos para el criterio del guardarropa
  }
}
