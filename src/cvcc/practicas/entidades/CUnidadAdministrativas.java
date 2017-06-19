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
public class CUnidadAdministrativas {

    private List<CUnidadAdministrativa> ListUnidadAdministrativa;

    public CUnidadAdministrativas() {
    }

    public List<CUnidadAdministrativa> getListUnidadAdministrativa() {
        return ListUnidadAdministrativa;
    }

    public void setListUnidadAdministrativa(List<CUnidadAdministrativa> ListUnidadAdministrativa) {
        this.ListUnidadAdministrativa = ListUnidadAdministrativa;
    }

    public void addUnidadAdministrativa(CUnidadAdministrativa OF) {
        try {
            if (this.ListUnidadAdministrativa == null) {
                this.ListUnidadAdministrativa = new ArrayList<>();
            }
            this.ListUnidadAdministrativa.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CUnidadAdministrativas").severe(e.getMessage());
        }
    }

}
