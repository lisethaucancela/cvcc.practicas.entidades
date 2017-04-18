/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Liseth
 */
public class CActividadPlanificada {

    private int IdActividadPlanificada;
    // private CPlanificacion ObjPlanificacion;
    private String Descripcion;
    private String FechaInicio;
    private String FechaFin;
    private int horas;
    private boolean estado;
    private List<CActividadPlanificada> LstActividades;
    private int id;

    public CActividadPlanificada() {
    }

    public CActividadPlanificada(CActividadPlanificada objActividad) {
        this.IdActividadPlanificada = objActividad.getIdActividadPlanificada();
        this.Descripcion = objActividad.getDescripcion();
        this.FechaInicio = objActividad.getFechaInicio();
        this.FechaFin = objActividad.getFechaFin();
        this.horas = objActividad.getHoras();
        this.estado = objActividad.isEstado();
        this.LstActividades = objActividad.getLstActividades();
    }

    public CActividadPlanificada(int IdActividadPlanificada, String Descripcion, String FechaInicio, String FechaFin, int horas, boolean estado, List<CActividadPlanificada> LstActividades, int id) {
        this.IdActividadPlanificada = IdActividadPlanificada;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.horas = horas;
        this.estado = estado;
        this.LstActividades = LstActividades;
        this.id = id;
    }

    public CActividadPlanificada(int IdActividadPlanificada, String Descripcion, String FechaInicio, String FechaFin, int horas, boolean estado, List<CActividadPlanificada> LstActividades) {
        this.IdActividadPlanificada = IdActividadPlanificada;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.horas = horas;
        this.estado = estado;
        this.LstActividades = LstActividades;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getIdActividadPlanificada() {
        return IdActividadPlanificada;
    }

    public void setIdActividadPlanificada(int IdActividadPlanificada) {
        this.IdActividadPlanificada = IdActividadPlanificada;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<CActividadPlanificada> getLstActividades() {
        return LstActividades;
    }

    public void setLstActividades(List<CActividadPlanificada> LstActividades) {
        this.LstActividades = LstActividades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addLstActividadesPlanificadas(CActividadPlanificada AP) {
        try {
            if (this.LstActividades == null) {
                this.LstActividades = new ArrayList<>();
            }
            this.LstActividades.add(AP);
        } catch (Exception e) {
            Logger.getLogger("CActividadesPlanificadas").severe(e.getMessage());
        }
    }

}
