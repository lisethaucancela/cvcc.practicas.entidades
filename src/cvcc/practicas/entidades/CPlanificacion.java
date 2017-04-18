/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Liseth
 */
public class CPlanificacion {
    private int IdPlanificacion;
    private CPractica ObjPractica;
    private Date FechaInicio;
    private Date FechaFin;
    private int HorasPlanificadas;
    private List<CActividadPlanificada> LstActividadesPlanificadas;

    public CPlanificacion() {
    }

    public int getIdPlanificacion() {
        return IdPlanificacion;
    }

    public void setIdPlanificacion(int IdPlanificacion) {
        this.IdPlanificacion = IdPlanificacion;
    }

    public CPractica getObjPractica() {
        return ObjPractica;
    }

    public void setObjPractica(CPractica ObjPractica) {
        this.ObjPractica = ObjPractica;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public int getHorasPlanificadas() {
        return HorasPlanificadas;
    }

    public void setHorasPlanificadas(int HorasPlanificadas) {
        this.HorasPlanificadas = HorasPlanificadas;
    }

    public List<CActividadPlanificada> getLstActividadesPlanificadas() {
        return LstActividadesPlanificadas;
    }

    public void setLstActividadesPlanificadas(List<CActividadPlanificada> LstActividadesPlanificadas) {
        this.LstActividadesPlanificadas = LstActividadesPlanificadas;
    }

    
}
