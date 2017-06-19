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
public class CMaterias {

    private List<CMateria> ListMaterias;

    public CMaterias() {
    }

    public List<CMateria> getListMaterias() {
        return ListMaterias;
    }

    public void setListMaterias(List<CMateria> ListMaterias) {
        this.ListMaterias = ListMaterias;
    }

    public void addListMaterias(CMateria OF) {
        try {
            if (this.ListMaterias == null) {
                this.ListMaterias = new ArrayList<>();
            }
            this.ListMaterias.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CMaterias").severe(e.getMessage());
        }
    }
}
