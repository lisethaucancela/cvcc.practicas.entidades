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
public class CUsuarios {

    private List<CUsuario> usuarios;

    public CUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void addUsuario(CUsuario OF) {
        try {
            if (this.usuarios == null) {
                this.usuarios = new ArrayList<>();
            }
            this.usuarios.add(OF);
        } catch (Exception e) {
            Logger.getLogger("CUsuarios").severe(e.getMessage());
        }
    }

    public List<CUsuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<CUsuario> usuarios) {
        this.usuarios = usuarios;
    }

}
