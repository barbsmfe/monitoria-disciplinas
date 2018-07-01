package model;

import java.util.List;

public class Aluna extends Pessoa{

    private List<String> habilidades;

    private List<Experiencia> experiencias;

    public Aluna(String nome, String email, String senha, String tipo, List<String> habilidades, List<Experiencia> experiencias) {
        super(nome, email, senha, tipo);
        this.habilidades = habilidades;
        this.experiencias = experiencias;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

}