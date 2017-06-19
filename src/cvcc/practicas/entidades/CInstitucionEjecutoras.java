/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.util.List;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Paola_Cajilema
 */
public class CInstitucionEjecutoras {

    private List<CInstitucionEjecutora> LstInstitucionEjecutora;

    public CInstitucionEjecutoras() {
        this.LstInstitucionEjecutora = new ArrayList<>();
    }

    public void addInstitucionEjecutoras(CInstitucionEjecutora objeto) {
        try {
            if (this.LstInstitucionEjecutora == null) {
                this.LstInstitucionEjecutora = new ArrayList<>();
            }
            this.LstInstitucionEjecutora.add(objeto);
        } catch (Exception e) {
            Logger.getLogger("CinstitucionEjecutoras").severe(e.getMessage());
        }
    }

    public List<CInstitucionEjecutora> getLstInstitucionEjecutora() {
        return LstInstitucionEjecutora;
    }

    public void setLstInstitucionEjecutora(List<CInstitucionEjecutora> LstInstitucionEjecutora) {
        this.LstInstitucionEjecutora = LstInstitucionEjecutora;
    }

}
