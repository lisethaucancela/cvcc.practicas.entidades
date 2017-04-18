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
public class CFacultades {

    List<CFacultad> Facultades;

    public CFacultades() {
        this.Facultades = new ArrayList<>();
    }

    public CFacultades(List<CFacultad> Facultades) {
        this.Facultades = Facultades;
    }

    public List<CFacultad> getFacultades() {
        return Facultades;
    }

    public void setFacultades(List<CFacultad> Facultades) {
        this.Facultades = Facultades;
    }

    public void addFacultad(CFacultad OF) {
        try {
            if (this.Facultades == null) {
                this.Facultades = new ArrayList<>();
            }
            this.Facultades.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CFacultades").severe(e.getMessage());
        }
    }

}
