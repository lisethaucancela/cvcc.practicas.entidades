/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

/**
 *
 * @author Paola_Cajilema
 */
public class CInstitucionEjecutora {

    private int id;

    private String descripcion;
    private String codigo;

    public CInstitucionEjecutora() {
        this.id = -1;
        this.descripcion = "";
        this.codigo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
