package model;

import java.util.List;

public class Aluna {

    private String nome;

    private String email;

    private String senha;

    private List<String> habilidades;

    private List<Experiencia> experiencias;

    public Aluna(String nome, String email, String senha, List<String> habilidades, List<Experiencia> experiencias) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.habilidades = habilidades;
        this.experiencias = experiencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}