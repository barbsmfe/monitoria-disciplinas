package model;

import java.util.ArrayList;
import java.util.List;

public class Vaga {

    private String titulo;

    private String descricao;

    private List<String> habilidades;

    private int cargaHoraria;

    private List<Aluna> candidatas;

    public Vaga(String titulo, String descricao, List<String> habilidades, int cargaHoraria) {
        candidatas = new ArrayList<>();

        this.titulo = titulo;
        this.descricao = descricao;
        this.habilidades = habilidades;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluna> getCandidatas() {
        return candidatas;
    }

    public void setCandidatas(List<Aluna> candidatas) {
        this.candidatas = candidatas;
    }
}