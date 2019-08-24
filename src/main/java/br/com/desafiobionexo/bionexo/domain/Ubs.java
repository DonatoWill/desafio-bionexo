package br.com.desafiobionexo.bionexo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "UBS")
public class Ubs implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String codCnes;
    private String vlrLatitude;
    private String vlrLongitude;
    private String codMunic;
    private String nomEstab;
    private String dscEndereco;
    private String dscBairro;
    private String dscCidade;
    private String dscTelefone;
    private String dscEstrutFisicAmbiencia;
    private String dscAdapDeficFisicIdosos;
    private String dscEquipamentos;


    public Ubs(){

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(int id) {
        this.codCnes = codCnes;
    }

    public String getVlrLatitude() {
        return vlrLatitude;
    }

    public void setVlrLatitude(String vlrLatitude) {
        this.vlrLatitude = vlrLatitude;
    }

    public String getVlrLongitude() {
        return vlrLongitude;
    }

    public void setVlrLongitude(String vlrLongitude) {
        this.vlrLongitude = vlrLongitude;
    }

    public String getCodMunic() {
        return codMunic;
    }

    public void setCodMunic(String codMunic) {
        this.codMunic = codMunic;
    }

    public String getNomEstab() {
        return nomEstab;
    }

    public void setNomEstab(String nomEstab) {
        this.nomEstab = nomEstab;
    }

    public String getDscEndereco() {
        return dscEndereco;
    }

    public void setDscEndereco(String dscEndereco) {
        this.dscEndereco = dscEndereco;
    }

    public String getDscBairro() {
        return dscBairro;
    }

    public void setDscBairro(String dscBairro) {
        this.dscBairro = dscBairro;
    }

    public String getDscCidade() {
        return dscCidade;
    }

    public void setDscCidade(String dscCidade) {
        this.dscCidade = dscCidade;
    }

    public String getDscTelefone() {
        return dscTelefone;
    }

    public void setDscTelefone(String dscTelefone) {
        this.dscTelefone = dscTelefone;
    }

    public String getDscEstrutFisicAmbiencia() {
        return dscEstrutFisicAmbiencia;
    }

    public void setDscEstrutFisicAmbiencia(String dscEstrutFisicAmbiencia) {
        this.dscEstrutFisicAmbiencia = dscEstrutFisicAmbiencia;
    }

    public String getDscAdapDeficFisicIdosos() {
        return dscAdapDeficFisicIdosos;
    }

    public void setDscAdapDeficFisicIdosos(String dscAdapDeficFisicIdosos) {
        this.dscAdapDeficFisicIdosos = dscAdapDeficFisicIdosos;
    }

    public String getDscEquipamentos() {
        return dscEquipamentos;
    }

    public void setDscEquipamentos(String dscEquipamentos) {
        this.dscEquipamentos = dscEquipamentos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubs ubs = (Ubs) o;
        return codCnes == ubs.codCnes;
    }

    @Override
    public int hashCode() {

        return Objects.hash(codCnes, vlrLatitude, vlrLongitude);
    }

    @Override
    public String toString() {
        return "Ubs{" +
                "id=" + codCnes +
                ", vlrLatitude=" + vlrLatitude +
                ", vlrLongitude=" + vlrLongitude +
                ", codMunic=" + codMunic +
                ", nomEstab='" + nomEstab + '\'' +
                ", dscEndereco='" + dscEndereco + '\'' +
                ", dscBairro='" + dscBairro + '\'' +
                ", dscCidade='" + dscCidade + '\'' +
                ", dscTelefone='" + dscTelefone + '\'' +
                ", dscEstrutFisicAmbiencia='" + dscEstrutFisicAmbiencia + '\'' +
                ", dscAdapDeficFisicIdosos='" + dscAdapDeficFisicIdosos + '\'' +
                ", dscEquipamentos='" + dscEquipamentos + '\'' +
                '}';
    }
}
