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
public class CPracticaConvenio {

    private int IdPracticaConvenio;
    private CPractica ObjPractica;
    private CConvenio ObjConvenio;
    private CUnidadAdministrativa ObjUnidadAdministrativa;
    private CFuncionario ObjFuncionario;

    public CPracticaConvenio() {
    }

    public CPracticaConvenio(int IdPracticaConvenio, CPractica ObjPractica, CConvenio ObjConvenio, CUnidadAdministrativa ObjUnidadAdministrativa, CFuncionario ObjFuncionario) {
        this.IdPracticaConvenio = IdPracticaConvenio;
        this.ObjPractica = ObjPractica;
        this.ObjConvenio = ObjConvenio;
        this.ObjUnidadAdministrativa = ObjUnidadAdministrativa;
        this.ObjFuncionario = ObjFuncionario;
    }

    public CPracticaConvenio(int IdPracticaConvenio, CPractica ObjPractica, CConvenio ObjConvenio) {
        this.IdPracticaConvenio = IdPracticaConvenio;
        this.ObjPractica = ObjPractica;
        this.ObjConvenio = ObjConvenio;
    }

    public int getIdPracticaConvenio() {
        return IdPracticaConvenio;
    }

    public void setIdPracticaConvenio(int IdPracticaConvenio) {
        this.IdPracticaConvenio = IdPracticaConvenio;
    }

    public CPractica getObjPractica() {
        return ObjPractica;
    }

    public void setObjPractica(CPractica ObjPractica) {
        this.ObjPractica = ObjPractica;
    }

    public CConvenio getObjConvenio() {
        return ObjConvenio;
    }

    public void setObjConvenio(CConvenio ObjConvenio) {
        this.ObjConvenio = ObjConvenio;
    }

    public CUnidadAdministrativa getObjUnidadAdministrativa() {
        return ObjUnidadAdministrativa;
    }

    public void setObjUnidadAdministrativa(CUnidadAdministrativa ObjUnidadAdministrativa) {
        this.ObjUnidadAdministrativa = ObjUnidadAdministrativa;
    }

    public CFuncionario getObjFuncionario() {
        return ObjFuncionario;
    }

    public void setObjFuncionario(CFuncionario ObjFuncionario) {
        this.ObjFuncionario = ObjFuncionario;
    }

}
