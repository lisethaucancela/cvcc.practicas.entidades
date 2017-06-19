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
public class CModalidades {

    private List<CModalidad> ListModalidades;

    public CModalidades(List<CModalidad> ListModalidades) {
        this.ListModalidades = ListModalidades;
    }

    public CModalidades() {
        this.ListModalidades = new ArrayList<>();
    }

    public List<CModalidad> getListModalidades() {
        return ListModalidades;
    }

    public void setListModalidades(List<CModalidad> ListModalidades) {
        this.ListModalidades = ListModalidades;
    }

    public void addListModalidades(CModalidad OF) {
        try {
            if (this.ListModalidades == null) {
                this.ListModalidades = new ArrayList<>();
            }
            this.ListModalidades.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CModalidades").severe(e.getMessage());
        }
    }

}
