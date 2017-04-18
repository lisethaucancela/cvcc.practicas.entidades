/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Liseth
 */
public class CPractica {

    private int IdPractica;
    private String Descripcion;
    private CUsuario ObjUsuario;
    private CModalidad ObjModalidad;
    private CEstadoPractica ObjEstadoPractica;
    private CPeriodo ObjPeriodo;
    private CFuncionario ObjFuncionario;
    private CEmpresa ObjEmpresa;
    private List<CUsuario> lstTutores;
    private List<CObjetivo> ListObjetivos;
    private List<CPeriodo> ListPeriodo;
    private List<CPlanificacion> ListPlanificaciones;

    public CPractica(int IdPractica) {
        this.IdPractica = IdPractica;
    }

    public CPractica() {
        this.Descripcion = "";
        this.IdPractica = -1;

    }

    public CPractica(int IdPractica, CModalidad ObjModalidad, CEstadoPractica ObjEstadoPractica, String Descripcion) {
        this.IdPractica = IdPractica;
        this.ObjModalidad = ObjModalidad;
        this.ObjEstadoPractica = ObjEstadoPractica;
        this.Descripcion = Descripcion;
    }

    public List<CUsuario> getLstTutores() {
        return lstTutores;
    }

    public void setLstTutores(List<CUsuario> lstTutores) {
        this.lstTutores = lstTutores;
    }

    public CEmpresa getObjEmpresa() {
        return ObjEmpresa;
    }

    public void setObjEmpresa(CEmpresa ObjEmpresa) {
        this.ObjEmpresa = ObjEmpresa;
    }

    public CFuncionario getObjFuncionario() {
        return ObjFuncionario;
    }

    public void setObjFuncionario(CFuncionario ObjFuncionario) {
        this.ObjFuncionario = ObjFuncionario;
    }

    public int getIdPractica() {
        return IdPractica;
    }

    public void setIdPractica(int IdPractica) {
        this.IdPractica = IdPractica;
    }

    public CModalidad getObjModalidad() {
        return ObjModalidad;
    }

    public void setObjModalidad(CModalidad ObjModalidad) {
        this.ObjModalidad = ObjModalidad;
    }

    public CEstadoPractica getObjEstadoPractica() {
        return ObjEstadoPractica;
    }

    public void setObjEstadoPractica(CEstadoPractica ObjEstadoPractica) {
        this.ObjEstadoPractica = ObjEstadoPractica;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public CPeriodo getObjPeriodo() {
        return ObjPeriodo;
    }

    public void setObjPeriodo(CPeriodo ObjPeriodo) {
        this.ObjPeriodo = ObjPeriodo;
    }

    public CUsuario getObjUsuario() {
        return ObjUsuario;
    }

    public void setObjUsuario(CUsuario ObjUsuario) {
        this.ObjUsuario = ObjUsuario;
    }

    public List<CObjetivo> getListObjetivos() {
        return ListObjetivos;
    }

    public void setListObjetivos(List<CObjetivo> ListObjetivos) {
        this.ListObjetivos = ListObjetivos;
    }

    public List<CPeriodo> getListPeriodo() {
        return ListPeriodo;
    }

    public void setListPeriodo(List<CPeriodo> ListPeriodo) {
        this.ListPeriodo = ListPeriodo;
    }

    public void addObjetivos(CObjetivo OB) {
        try {
            if (this.ListObjetivos == null) {
                this.ListObjetivos = new ArrayList<>();
            }
            this.ListObjetivos.add(OB);
        } catch (Exception e) {
            Logger.getLogger("CObjetivos").severe(e.getMessage());
        }
    }

    public List<CPlanificacion> getListPlanificaciones() {
        return ListPlanificaciones;
    }

    public void setListPlanificaciones(List<CPlanificacion> ListPlanificaciones) {
        this.ListPlanificaciones = ListPlanificaciones;
    }

    
    public void addPeriodos(CPeriodo OP) {
        try {
            if (this.ListPeriodo == null) {
                this.ListPeriodo = new ArrayList<>();
            }
            this.ListPeriodo.add(OP);
        } catch (Exception e) {
            Logger.getLogger("CPeriodo").severe(e.getMessage());
        }
    }

    public void addTutores(CUsuario OP) {
        try {
            if (this.lstTutores == null) {
                this.lstTutores = new ArrayList<>();
            }
            this.lstTutores.add(OP);
        } catch (Exception e) {
            Logger.getLogger("CPeriodo").severe(e.getMessage());
        }
    }

    public void addPlanificaciones(CPlanificacion OP) {
        try {
            if (this.ListPlanificaciones == null) {
                this.ListPlanificaciones = new ArrayList<>();
            }
            this.ListPlanificaciones.add(OP);
        } catch (Exception e) {
            Logger.getLogger("CPeriodo").severe(e.getMessage());
        }
    }

}
