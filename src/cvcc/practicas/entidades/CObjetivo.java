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
public class CObjetivo {

    private int IdObjetivo;
    private int IdPractica;
    private String Descripcion;

    public CObjetivo() {
        IdObjetivo = -1;
        Descripcion = "";
    }

    public CObjetivo(int IdPractica, String Descripcion) {
        this.IdPractica = IdPractica;
        this.Descripcion = Descripcion;
    }

    public CObjetivo(int IdObjetivo, int IdPractica, String Descripcion) {
        this.IdObjetivo = IdObjetivo;
        this.IdPractica = IdPractica;
        this.Descripcion = Descripcion;
    }

    public int getIdObjetivo() {
        return IdObjetivo;
    }

    public void setIdObjetivo(int IdObjetivo) {
        this.IdObjetivo = IdObjetivo;
    }

    public int getIdPractica() {
        return IdPractica;
    }

    public void setIdPractica(int IdPractica) {
        this.IdPractica = IdPractica;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
