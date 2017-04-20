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
 * @author Paola_Cajilema
 */
public class CProyectos {

    private int id;
    private String nombre;
    private String fecha_inicio;
    private String fecha_fin;
    private String nombreInvestigadorRresponsable;
    private String descripcionTipoInvestigacion;
    private String descripcionTipoProyecto;
    private String descripcionEstadoProyecto;
    private List<String> nombreInstitucionEjecutora;

    /* public _CProyectos() {
     }*/
    public CProyectos() {

        this.id = -1;
        this.nombre = "";
        this.fecha_inicio = "";
        this.fecha_fin = "";
        this.nombreInvestigadorRresponsable = "";
        this.descripcionTipoInvestigacion = "";
        this.descripcionTipoProyecto = "";
        this.descripcionEstadoProyecto = "";
        this.nombreInstitucionEjecutora = new ArrayList<>();

    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreInvestigadorRresponsable() {
        return nombreInvestigadorRresponsable;
    }

    public void setNombreInvestigadorRresponsable(String nombreInvestigadorRresponsable) {
        this.nombreInvestigadorRresponsable = nombreInvestigadorRresponsable;
    }

    public String getDescripcionTipoInvestigacion() {
        return descripcionTipoInvestigacion;
    }

    public void setDescripcionTipoInvestigacion(String descripcionTipoInvestigacion) {
        this.descripcionTipoInvestigacion = descripcionTipoInvestigacion;
    }

    public String getDescripcionTipoProyecto() {
        return descripcionTipoProyecto;
    }

    public void setDescripcionTipoProyecto(String descripcionTipoProyecto) {
        this.descripcionTipoProyecto = descripcionTipoProyecto;
    }

    public String getDescripcionEstadoProyecto() {
        return descripcionEstadoProyecto;
    }

    public void setDescripcionEstadoProyecto(String descripcionEstadoProyecto) {
        this.descripcionEstadoProyecto = descripcionEstadoProyecto;
    }

    public List<String> getNombreInstitucionEjecutora() {
        return nombreInstitucionEjecutora;
    }

    public void setNombreInstitucionEjecutora(List<String> nombreInstitucionEjecutora) {
        this.nombreInstitucionEjecutora = nombreInstitucionEjecutora;
    }

}
