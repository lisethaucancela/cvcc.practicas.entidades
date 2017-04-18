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
public class CFacultad {

    private String Codigo;
    private String Nombre;
    private List<CEscuela> Escuelas;

    public CFacultad() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<CEscuela> getEscuelas() {
        return Escuelas;
    }

    public void setEscuelas(List<CEscuela> Escuelas) {
        this.Escuelas = Escuelas;
    }

    public void addEscuelas(CEscuela ES) {
        try {
            if (this.Escuelas == null) {
                this.Escuelas = new ArrayList<>();
            }
            this.Escuelas.add(ES);
        } catch (Exception e) {
            Logger.getLogger("Escuelas").severe(e.getMessage());
        }
    }

}
