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
public class CFuncionarios {

    private List<CFuncionario> funcionarios;

    public List<CFuncionario> getFuncionario() {
        return funcionarios;
    }

    public void addFuncionario(CFuncionario OF) {
        try {
            if (this.funcionarios == null) {
                this.funcionarios = new ArrayList<>();
            }
            this.funcionarios.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CFuncionarios").severe(e.getMessage());
        }
    }

    public CFuncionarios() {

        this.funcionarios = new ArrayList<>();
    }

}
