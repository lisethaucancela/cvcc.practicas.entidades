/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.sql.Date;

/**
 *
 * @author Liseth
 */
public class CConvenio {

    private int IdConvenio;
    private CEntidad ObjEntidad;
    private CEmpresa ObjEmpresa;
    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    private boolean estado;

    public CConvenio() {
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

    public int getIdConvenio() {
        return IdConvenio;
    }

    public void setIdConvenio(int IdConvenio) {
        this.IdConvenio = IdConvenio;
    }

    public CEntidad getObjEntidad() {
        return ObjEntidad;
    }

    public void setObjEntidad(CEntidad ObjEntidad) {
        this.ObjEntidad = ObjEntidad;
    }

    public CEmpresa getObjEmpresa() {
        return ObjEmpresa;
    }

    public void setObjEmpresa(CEmpresa ObjEmpresa) {
        this.ObjEmpresa = ObjEmpresa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
