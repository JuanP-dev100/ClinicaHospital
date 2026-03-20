/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ESTUDIANTE
 */
public class Consulta {
  private String fecha;
  private String motivo;
  private String diagnostico;

    public Consulta() {
    }

    public Consulta(String fecha, String motivo, String diagnostico) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Consulta{" + "fecha=" + fecha + ", motivo=" + motivo + ", diagnostico=" + diagnostico + '}';
    }
  
  
    
}
