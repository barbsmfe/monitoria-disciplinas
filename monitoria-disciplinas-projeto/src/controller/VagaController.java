package controller;

import model.Aluna;
import model.Pessoa;
import model.Professora;
import model.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaController {

    private List<Vaga> vagas;

    public Vaga cadastraVaga(Vaga vaga, Pessoa pessoa){
        if(pessoa instanceof Professora){
            vagas = new ArrayList<>();
            vagas.add(vaga);

            return vaga;
        }

        return null;
    }

    public List<Vaga> buscaVaga(String palavra){

        List<Vaga> vagasQueContemApalavra = new ArrayList<>();

        for(Vaga vaga : vagas){
            if(vaga.getTitulo().contains(palavra)){
                vagasQueContemApalavra.add(vaga);
            }
        }

        return vagasQueContemApalavra;
    }

    public List<Aluna> candidatar(Vaga vaga, Pessoa pessoa){
        if(pessoa instanceof Aluna){
            vaga.getCandidatas().add((Aluna) pessoa);
        }

        return vaga.getCandidatas();
    }
}