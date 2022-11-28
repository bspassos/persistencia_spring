package br.edu.infnet.applocacaoequipamento.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "TLocacao")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private int meses;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Equipamento> equipamentos;

    public Locacao(Cliente cliente, Set<Equipamento> equipamentos) {

        this.data = LocalDateTime.now();
        this.cliente = cliente;
        this.equipamentos = equipamentos;
    }

    public Locacao() {
        this.data = LocalDateTime.now();
    }

    public LocalDateTime getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Set<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        System.out.println(descricao);
        System.out.println(data);
        System.out.println(meses);
        System.out.println(cliente);
        System.out.println(equipamentos);
        return descricao + ";" + data + ";" + meses + ";" + cliente + ";" + equipamentos.size();
    }

}
