package br.edu.infnet.applocacaoequipamento.model.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TEquipamento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private float mensalidade;
    private int codigo;
    @ManyToMany(mappedBy = "equipamentos")
    private List<Locacao> locacoes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + mensalidade + ";" + codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipamento)) return false;
        Equipamento that = (Equipamento) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
