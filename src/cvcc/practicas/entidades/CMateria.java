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
public class CMateria {

    private int id;
    private String codigo;
    private String nombre;
    private String nivel;
    private String area;
    private double creditos;
    private int horasTeoricas;
    private int horasPracticas;
    // private List<CUsuario> listUsuario;
    private CUsuarios listUsuario;

    public CMateria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    /*
     public List<CUsuario> getListUsuario() {
     return listUsuario;
     }

     public void setListUsuario(List<CUsuario> listUsuario) {
     this.listUsuario = listUsuario;
     }

     public void addUsuario(CUsuario OF) {
     try {
     if (this.listUsuario == null) {
     this.listUsuario = new ArrayList<>();
     }
     this.listUsuario.add(OF);
     } catch (Exception e) {
     Logger.getLogger("CUsuarios").severe(e.getMessage());
     }
     }*/
    public CUsuarios getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(CUsuarios listUsuario) {
        this.listUsuario = listUsuario;
    }

}
