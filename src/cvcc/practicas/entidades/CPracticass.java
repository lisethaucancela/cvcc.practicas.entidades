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
 * @author Paola_Cajilema
 */
public class CPracticass {

    private List<CPractica> practicas;

    public List<CPractica> getPracticas() {
        return practicas;
    }

    public void setPracticas(List<CPractica> practicas) {
        this.practicas = practicas;
    }

    public void addPracticas(CPractica oP) {
        try {
            if (this.practicas == null) {
                this.practicas = new ArrayList<>();
            }
            this.practicas.add(oP);

        } catch (Exception e) {
            Logger.getLogger("CPracticass").severe(e.getMessage());
        }
    }

    public CPracticass() {
        this.practicas = new ArrayList<>();
    }

}
