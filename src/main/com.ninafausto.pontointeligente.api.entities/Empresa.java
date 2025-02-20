package com.ninafausto.pontointeligente.api.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity​
@Table​(name = "empresa")
public class Empresa implements serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
	private String razaoSocial;
	private String cnpj;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private List<Funcionario> funcionarios;
	
	public Empresa() {

    }

    @Id
    @GeneratedValue​(strategy=GenerationType​.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "razao_social", nullable = false)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Column(name = "data_criacao", nullable = false)
    public Date getDataCriacao() {
        return dataCriaca;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = datacriacao;
    }

    @Column(name = "data_atualização", nullable = false)
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }

    @OneToMany(mappedBy = "empresa" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @PreUpdate​
    public void preUpdate() {
        dataAtualizacao = new Date();
    }

    @PrePersist​
    public void prePersist(){
        final Date atual = new Date();
        dataCriacao = atual;
        dataAtualizacao = atual;
    }

    @Override
    public String toString() {
        return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + " , dataCriacao=" + dataCriacao + " , dataAtualizacao=" + dataAtualizacao + "]";
    }
}