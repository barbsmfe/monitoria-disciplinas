package model;

import java.util.List;

public class Experiencia {

    private String nomeEmpresa;

    private String cargo;

    private int duracao;

    private List<String> atividades;

    public Experiencia(String nomeEmpresa, String cargo, int duracao, List<String> atividades) {
        this.nomeEmpresa = nomeEmpresa;
        this.cargo = cargo;
        this.duracao = duracao;
        this.atividades = atividades;
    }
}