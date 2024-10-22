package com.faculdade.faculdade.entities;
import jakarta.persistence.*;
import java.io.Serializable;


@Entity(name = "Alunos")
public class Alunos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "Nome")
    String nome;

    @Column(name = "RA")
    String ra;

    @Column(name = "CEP")
    String cep;

    @Column(name = "Numero")
    int numero;

    @Column(name = "Complemento")
    String complemento;

    @Column(name = "NotaAdo1")
    double notaAdo1;

    @Column(name = "NotaPI")
    double notaPI;

    @Column(name = "Ativo")
    private boolean ativo;

    public Alunos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alunos(String nome, String ra, String cep, int numero, String complemento, double notaAdo1, double notaPI, boolean ativo) {
        super();
        this.nome = nome;
        this.ra = ra;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.notaAdo1 = notaAdo1;
        this.notaPI = notaPI;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getNotaAdo1() {
        return notaAdo1;
    }

    public void setNotaAdo1(double notaAdo1) {
        this.notaAdo1 = notaAdo1;
    }

    public double getNotaPI() {
        return notaPI;
    }

    public void setNotaPI(double notaPI) {
        this.notaPI = notaPI;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", cep='" + cep + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", notaAdo1=" + notaAdo1 +
                ", notaPI=" + notaPI +
                '}';
    }
}
