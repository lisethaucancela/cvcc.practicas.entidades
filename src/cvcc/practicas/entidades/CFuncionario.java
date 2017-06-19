/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcc.practicas.entidades;

/**
 *
 * @author Liseth
 */
public class CFuncionario {

    private long IdFuncionario;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Email;
    private String Cargo;
    private boolean Estado;

    public CFuncionario() {
        this.IdFuncionario = 0;
        this.Cedula = "";
        this.Nombres = "";
        this.Apellidos = "";
        this.Telefono = "";
        this.Email = "";
        this.Cargo = "";
        this.Estado = false;
    }

    public CFuncionario(int IdFuncionario, CEmpresa ObjEmpresa, String Nombres, String Telefono, String Cargo) {
        this.IdFuncionario = IdFuncionario;

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

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

}
