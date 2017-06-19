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
public class CUnidadAdministrativa {

    private int IdUnidadAdministrativa;
    private CEmpresa ObjEmpresa;
    private String nombre;
    private String Descripcion;

    public CUnidadAdministrativa() {
    }

    public CUnidadAdministrativa(int IdUnidadAdministrativa, CEmpresa ObjEmpresa, String Descripcion) {
        this.IdUnidadAdministrativa = IdUnidadAdministrativa;
        this.ObjEmpresa = ObjEmpresa;
        this.Descripcion = Descripcion;
    }

    public int getIdUnidadAdministrativa() {
        return IdUnidadAdministrativa;
    }

    public void setIdUnidadAdministrativa(int IdUnidadAdministrativa) {
        this.IdUnidadAdministrativa = IdUnidadAdministrativa;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
