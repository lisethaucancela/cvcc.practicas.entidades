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
public class CEscuelas {

    private List<CEscuela> Escuelas;

    public CEscuelas() {
        this.Escuelas = new ArrayList<>();
    }

    public List<CEscuela> getEscuelas() {
        return Escuelas;
    }

    public void setEscuelas(List<CEscuela> Escuelas) {
        this.Escuelas = Escuelas;
    }
    
     public void addFacultad(CEscuela OF) {
        try {
            if (this.Escuelas == null) {
                this.Escuelas = new ArrayList<>();
            }
            this.Escuelas.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CFacultades").severe(e.getMessage());
        }
    }

}
