package controller;

import model.Aluna;
import model.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaController {

    private List<Vaga> vagas;

    public Vaga cadastraVaga(Vaga vaga){
        vagas = new ArrayList<>();
        vagas.add(vaga);

        return vaga;
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

    public List<Aluna> candidatar(Vaga vaga, Aluna aluna){
        vaga.getCandidatas().add(aluna);

        return vaga.getCandidatas();
    }
}