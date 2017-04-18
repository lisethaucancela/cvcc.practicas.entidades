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
public class LObjetivos {

    private List<CObjetivo> Objetivos;

    public LObjetivos() {
        this.Objetivos = new ArrayList<>();
    }

    public LObjetivos(List<CObjetivo> Objetivos) {
        this.Objetivos = Objetivos;
    }

    public List<CObjetivo> getObjetivos() {
        return Objetivos;
    }

    public void setObjetivos(List<CObjetivo> Objetivos) {
        this.Objetivos = Objetivos;
    }

    public void addObjetivos(CObjetivo OB) {
        try {
            if (this.Objetivos == null) {
                this.Objetivos = new ArrayList<>();
            }
            this.Objetivos.add(OB);
        } catch (Exception e) {
            Logger.getLogger("CObjetivos").severe(e.getMessage());
        }
    }

}
