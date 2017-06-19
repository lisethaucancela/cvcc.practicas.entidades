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
public class CNivelSatisfaccions {

    private List<CNivelSatisfaccion> nivelesSatisfaccion;

    public CNivelSatisfaccions() {
    }

    public List<CNivelSatisfaccion> getNivelesSatisfaccion() {
        return nivelesSatisfaccion;
    }

    public void setNivelesSatisfaccion(List<CNivelSatisfaccion> nivelesSatisfaccion) {
        this.nivelesSatisfaccion = nivelesSatisfaccion;
    }

    public void addNivelSatisfaccion(CNivelSatisfaccion oP) {
        try {
            if (this.nivelesSatisfaccion == null) {
                this.nivelesSatisfaccion = new ArrayList<>();
            }
            this.nivelesSatisfaccion.add(oP);

        } catch (Exception e) {
            Logger.getLogger("CNivelSatisfaccions").severe(e.getMessage());
        }
    }

}
