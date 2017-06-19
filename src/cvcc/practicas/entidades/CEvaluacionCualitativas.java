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
public class CEvaluacionCualitativas {

    private List<CEvaluacionCualitativa> EvaluacionCualitativas;

    public CEvaluacionCualitativas() {
    }

    public List<CEvaluacionCualitativa> getEvaluacionCualitativas() {
        return EvaluacionCualitativas;
    }

    public void setEvaluacionCualitativas(List<CEvaluacionCualitativa> EvaluacionCualitativas) {
        this.EvaluacionCualitativas = EvaluacionCualitativas;
    }

    public void addEvaluacionCualitativa(CEvaluacionCualitativa OF) {
        try {
            if (this.EvaluacionCualitativas == null) {
                this.EvaluacionCualitativas = new ArrayList<>();
            }
            this.EvaluacionCualitativas.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CEvaluacionCualitativas").severe(e.getMessage());
        }
    }
}
