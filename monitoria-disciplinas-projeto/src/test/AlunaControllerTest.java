package test;

import controller.AlunaController;
import model.Aluna;
import model.Experiencia;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AlunaControllerTest {

    public static final String NOME = "andri";
    public static final String EMAIL = "andri@gmail.com";
    public static final String SENHA = "123";

    private Aluna aluna;
    private AlunaController alunaController;

    @Before
    public void setUp(){

        alunaController = new AlunaController();

        List<String> habilidades = new ArrayList<>();

        habilidades.add("TDD");
        habilidades.add("teste unitario");
        habilidades.add("scrum");
        habilidades.add("java");

        List<String> atividades = new ArrayList<>();
        atividades.add("atividade 1");
        atividades.add("atividade 2");
        atividades.add("atividade 3");


        Experiencia experiencia = new Experiencia("Dell", "desenvolvedora", 12, atividades);

        List<Experiencia> experiencias = new ArrayList<>();
        experiencias.add(experiencia);

        aluna = new Aluna(NOME, EMAIL, SENHA, habilidades, experiencias);
    }

    @Test
    public void cadastra_aluna_com_sucesso() throws Exception {
        Aluna alunaCadastrada = alunaController.cadastrarAluna(aluna);

        assertThat(alunaCadastrada, is(aluna));
    }

    @Test
    public void aluna_cadastrada_deve_logar_com_sucesso() throws Exception {
        alunaController.cadastrarAluna(aluna);

        assertTrue(alunaController.login(EMAIL, SENHA));
    }

    @Test
    public void aluna_nao_cadastrada_nao_deve_conseguir_logar() throws Exception {
        alunaController.cadastrarAluna(aluna);

        assertFalse(alunaController.login("invalido@gmail.com", "senha_invalida"));
    }
}