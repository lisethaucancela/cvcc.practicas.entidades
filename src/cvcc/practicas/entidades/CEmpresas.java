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
public class CEmpresas {

    private List<CEmpresa> Empresas;

    public CEmpresas() {
        this.Empresas = new ArrayList<>();
    }

    public List<CEmpresa> getEmpresas() {
        return Empresas;
    }

    public void setEmpresas(List<CEmpresa> Empresas) {
        this.Empresas = Empresas;
    }

    public void addEmpresas(CEmpresa OE) {
        try {
            if (this.Empresas == null) {
                this.Empresas = new ArrayList<>();
            }
            this.Empresas.add(OE);
        } catch (Exception e) {
            Logger.getLogger("CEmpresas").severe(e.getMessage());
        }
    }
}
