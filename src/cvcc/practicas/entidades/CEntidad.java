/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liseth
 */
public class CEntidad {

    private int IdEntidad;
    private CTipoEntidad ObjTipoEntidad;
    private CEntidad ObjPadre;
    private String Descripcion;
    private List<CConvenio> ListConvenios;

    public CEntidad() {
    }

    public CEntidad(int IdEntidad, CTipoEntidad ObjTipoEntidad, CEntidad ObjPadre, String Descripcion) {
        this.IdEntidad = IdEntidad;
        this.ObjTipoEntidad = ObjTipoEntidad;
        this.ObjPadre = ObjPadre;
        this.Descripcion = Descripcion;
    }

    public CEntidad(int IdEntidad, CTipoEntidad ObjTipoEntidad, CEntidad ObjPadre, String Descripcion, List<CConvenio> ListConvenios) {
        this.IdEntidad = IdEntidad;
        this.ObjTipoEntidad = ObjTipoEntidad;
        this.ObjPadre = ObjPadre;
        this.Descripcion = Descripcion;
        this.ListConvenios = ListConvenios;
    }

    public CEntidad(String Descripcion, CTipoEntidad objTipoEntidad) {
        this.Descripcion = Descripcion;
        this.ObjTipoEntidad = objTipoEntidad;
    }

    public int getIdEntidad() {
        return IdEntidad;
    }

    public void setIdEntidad(int IdEntidad) {
        this.IdEntidad = IdEntidad;
    }

    public CTipoEntidad getObjTipoEntidad() {
        return ObjTipoEntidad;
    }

    public void setObjTipoEntidad(CTipoEntidad ObjTipoEntidad) {
        this.ObjTipoEntidad = ObjTipoEntidad;
    }

    public CEntidad getObjPadre() {
        return ObjPadre;
    }

    public void setObjPadre(CEntidad ObjPadre) {
        this.ObjPadre = ObjPadre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public List<CConvenio> getListConvenios() {
        return ListConvenios;
    }

    public void setListConvenios(List<CConvenio> ListConvenios) {
        this.ListConvenios = ListConvenios;
    }

    public void addConvenios(CConvenio OP) {
        try {
            if (this.ListConvenios == null) {
                this.ListConvenios = new ArrayList<>();
            }
            this.ListConvenios.add(OP);
        } catch (Exception e) {
            System.out.println("e:" + e.getMessage());
        }
    }

}
