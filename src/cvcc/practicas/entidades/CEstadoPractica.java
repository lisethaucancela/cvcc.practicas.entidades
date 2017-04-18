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
public class CEstadoPractica {

    private int IdEstadoPractica;
    private String Descripcion;

    public CEstadoPractica() {
    }

    public CEstadoPractica(int IdEstadoPractica, String Descripcion) {
        this.IdEstadoPractica = IdEstadoPractica;
        this.Descripcion = Descripcion;
    }

    public int getIdEstadoPractica() {
        return IdEstadoPractica;
    }

    public void setIdEstadoPractica(int IdEstadoPractica) {
        this.IdEstadoPractica = IdEstadoPractica;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
