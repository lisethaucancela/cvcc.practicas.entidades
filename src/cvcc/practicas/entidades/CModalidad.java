/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

/**
 *
 * @author Liseth
 */
public class CModalidad {
    private int IdModalidad;
    private String Descripcion;

    public CModalidad() {
    }

    public CModalidad(int IdModalidad, String Descripcion) {
        this.IdModalidad = IdModalidad;
        this.Descripcion = Descripcion;
    }

    public int getIdModalidad() {
        return IdModalidad;
    }

    public void setIdModalidad(int IdModalidad) {
        this.IdModalidad = IdModalidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
