package test;

import controller.VagaController;
import model.Aluna;
import model.Experiencia;
import model.Vaga;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class VagaControllerTest {

    private static final String NOME = "Andri";
    private static final String EMAIL = "andri@gmail.com";
    private static final String SENHA = "123";

    private VagaController vagaController;
    private Vaga vaga;
    private List<String> habilidades;

    @Before
    public void setUp(){

        vagaController = new VagaController();

        habilidades = new ArrayList<>();

        habilidades.add("TDD");
        habilidades.add("teste unitario");
        habilidades.add("scrum");
        habilidades.add("java");

        vaga = new Vaga("Analista de sistemas", "alguma descricao", habilidades, 30);
    }

    @Test
    public void cadastra_vaga_com_sucesso(){
        assertThat(vagaController.cadastraVaga(vaga), is(vaga));
    }

    @Test
    public void deve_encontrar_vaga(){
        vagaController.cadastraVaga(vaga);

        assert(vagaController.buscaVaga("sistemas").contains(vaga));
    }

    @Test
    public void nao_deve_encontrar_vaga_que_nao_existe(){
        vagaController.cadastraVaga(vaga);

        assert(vagaController.buscaVaga("qualidade").isEmpty());
    }

    @Test
    public void deve_candidatar_com_sucesso(){
        List<String> atividades = new ArrayList<>();
        atividades.add("atividade 1");
        atividades.add("atividade 2");
        atividades.add("atividade 3");

        Experiencia experiencia = new Experiencia("Dell", "desenvolvedora", 12, atividades);

        List<Experiencia> experiencias = new ArrayList<>();
        experiencias.add(experiencia);

        Aluna aluna = new Aluna(NOME, EMAIL, SENHA, habilidades, experiencias);

        vagaController.cadastraVaga(vaga);

        assert(vagaController.candidatar(vaga, aluna).contains(aluna));
    }
}