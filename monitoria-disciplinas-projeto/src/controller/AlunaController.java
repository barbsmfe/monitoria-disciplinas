package controller;

import model.Aluna;

import java.util.ArrayList;
import java.util.List;

public class AlunaController {

    private List<Aluna> alunas;

    public Aluna cadastrarAluna(Aluna aluna){
        alunas = new ArrayList<>();
        alunas.add(aluna);

        return aluna;
    }

    public boolean login(String email, String senha){
        for (Aluna aluna : alunas) {
            if(ehUmaAlunaValida(email, senha, aluna)){

                return true;
            }
        }

        return false;
    }

    private boolean ehUmaAlunaValida(String email, String senha, Aluna aluna) {
        return aluna.getEmail().equals(email) && aluna.getSenha().equals(senha);
    }
}