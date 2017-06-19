/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liseth
 */
public class CUsuario {

    private int IdUsuario;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private int numeroPractica;
    private boolean estado;
    private CPracticass ListaPracticas;

//    public CUsuario() {
//    }
    public CUsuario() {
        this.IdUsuario = -1;
        this.Cedula = "";
        this.Nombres = "";
        this.Apellidos = "";
        this.Email = "";
        this.numeroPractica = -1;
        this.ListaPracticas = new CPracticass();
    }

    public CUsuario(int IdUsuario, String Cedula) {
        this.IdUsuario = IdUsuario;
        this.Cedula = Cedula;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumeroPractica() {
        return numeroPractica;
    }

    public void setNumeroPractica(int numeroPractica) {
        this.numeroPractica = numeroPractica;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public CPracticass getListaPracticas() {
        return ListaPracticas;
    }

    public void setListaPracticas(CPracticass ListaPracticas) {
        this.ListaPracticas = ListaPracticas;
    }

}
