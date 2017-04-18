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
public class CActividadesPlanificadas {

    private List<CActividadPlanificada> ActividadesPlanificadas;

    public CActividadesPlanificadas() {
        this.ActividadesPlanificadas = new ArrayList<>();
    }

    public CActividadesPlanificadas(List<CActividadPlanificada> ActividadesPlanificadas) {
        this.ActividadesPlanificadas = ActividadesPlanificadas;
    }

    public List<CActividadPlanificada> getActividadesPlanificadas() {
        return ActividadesPlanificadas;
    }

    public void setActividadesPlanificadas(List<CActividadPlanificada> ActividadesPlanificadas) {
        this.ActividadesPlanificadas = ActividadesPlanificadas;
    }

    public void addActividadesPlanificadas(CActividadPlanificada OF) {
        try {
            if (this.ActividadesPlanificadas == null) {
                this.ActividadesPlanificadas = new ArrayList<>();
            }
            this.ActividadesPlanificadas.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CActividadesPlanificadas").severe(e.getMessage());
        }
    }

}
