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
public class CConvenios {

    private List<CConvenio> Convenios;

    public CConvenios() {
    }

    public CConvenios(List<CConvenio> Convenios) {
        this.Convenios = Convenios;
    }

    public List<CConvenio> getConvenios() {
        return Convenios;
    }

    public void setConvenios(List<CConvenio> Convenios) {
        this.Convenios = Convenios;
    }

    public void addConvenios(CConvenio oP) {
        try {
            if (this.Convenios == null) {
                this.Convenios = new ArrayList<>();
            }
            this.Convenios.add(oP);

        } catch (Exception e) {
            Logger.getLogger("CConvenios").severe(e.getMessage());
        }
    }

}
