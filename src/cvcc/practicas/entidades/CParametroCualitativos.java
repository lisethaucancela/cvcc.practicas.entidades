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
public class CParametroCualitativos {

    private List<CParametroCualitativo> parametrosCualitativos;

    public CParametroCualitativos() {
    }

    public List<CParametroCualitativo> getParametrosCualitativos() {
        return parametrosCualitativos;
    }

    public void setParametrosCualitativos(List<CParametroCualitativo> parametrosCualitativos) {
        this.parametrosCualitativos = parametrosCualitativos;
    }

    public void addParametrosCualitativos(CParametroCualitativo oP) {
        try {
            if (this.parametrosCualitativos == null) {
                this.parametrosCualitativos = new ArrayList<>();
            }
            this.parametrosCualitativos.add(oP);

        } catch (Exception e) {
            Logger.getLogger("CParametroCualitativos").severe(e.getMessage());
        }
    }

}
