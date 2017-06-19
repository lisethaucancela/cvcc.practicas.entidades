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
public class CEvaluacionCualitativa {

    private int id;
    private int idParametro;
    private int idNivelSatisfaccion;

    public CEvaluacionCualitativa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdParametro() {
        return idParametro;
    }

    public void setIdParametro(int idParametro) {
        this.idParametro = idParametro;
    }

    public int getIdNivelSatisfaccion() {
        return idNivelSatisfaccion;
    }

    public void setIdNivelSatisfaccion(int idNivelSatisfaccion) {
        this.idNivelSatisfaccion = idNivelSatisfaccion;
    }

}
