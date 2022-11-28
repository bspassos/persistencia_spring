package br.edu.infnet.applocacaoequipamento.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TImpressora")
public class Impressora extends Equipamento {

    private String tipo;
    private String marca;
    private boolean tanqueDeTinta;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTanqueDeTinta() {
        return tanqueDeTinta;
    }

    public void setTanqueDeTinta(boolean tanqueDeTinta) {
        this.tanqueDeTinta = tanqueDeTinta;
    }


    @Override
    public String toString() {
        return super.toString() + ";" + tipo + ";" + marca + ";" + tanqueDeTinta;
    }
}
