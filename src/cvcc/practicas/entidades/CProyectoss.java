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
public class CProyectoss {

    private List<CProyectos> proyectos;


    /* public _CProyectos() {
     }*/
    public CProyectoss() {
        this.proyectos = new ArrayList<>();
    }

    public List<CProyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<CProyectos> proyectos) {
        this.proyectos = proyectos;
    }

    public void addProyectos(CProyectos oP) {
        try {
            if (this.proyectos == null) {
                this.proyectos = new ArrayList<>();
            }
            this.proyectos.add(oP);

        } catch (Exception e) {
            Logger.getLogger("CProyectos").severe(e.getMessage());
        }
    }

}
