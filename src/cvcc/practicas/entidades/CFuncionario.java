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
public class CFuncionario {

    private long IdFuncionario;
    private CEmpresa ObjEmpresa;
    private String Nombres;
    private String Telefono;
    private String Cargo;
    private boolean Estado;

    public CFuncionario() {
        this.IdFuncionario = 0;
        this.Nombres = "";
        this.Telefono = "";
        this.Cargo = "";
        this.ObjEmpresa = null;
        this.Estado = false;
    }

    public CFuncionario(int IdFuncionario, CEmpresa ObjEmpresa, String Nombres, String Telefono, String Cargo) {
        this.IdFuncionario = IdFuncionario;
        this.ObjEmpresa = ObjEmpresa;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Cargo = Cargo;
    }

    public long getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(long IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public CEmpresa getObjEmpresa() {
        return ObjEmpresa;
    }

    public void setObjEmpresa(CEmpresa ObjEmpresa) {
        this.ObjEmpresa = ObjEmpresa;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

}
