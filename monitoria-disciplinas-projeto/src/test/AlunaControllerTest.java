package test;

import controller.PessoaController;
import model.Aluna;
import model.Experiencia;
import model.Pessoa;
import model.TipoPessoa;
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

    private Pessoa pessoa;
    private PessoaController alunaController;

    @Before
    public void setUp(){

        alunaController = new PessoaController();

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

        pessoa = new Aluna(NOME, EMAIL, SENHA, TipoPessoa.ALUNA.name(), habilidades, experiencias);
    }

    @Test
    public void cadastra_aluna_com_sucesso() throws Exception {
        Pessoa alunaCadastrada = alunaController.cadastrarPessoa(pessoa);

        assertThat(alunaCadastrada, is(pessoa));
    }

    @Test
    public void aluna_cadastrada_deve_logar_com_sucesso() throws Exception {
        alunaController.cadastrarPessoa(pessoa);

        assertThat(alunaController.login(EMAIL, SENHA), is(pessoa));
    }

    @Test
    public void aluna_nao_cadastrada_nao_deve_conseguir_logar() throws Exception {
        alunaController.cadastrarPessoa(pessoa);

        assertNull(alunaController.login("invalido@gmail.com", "senha_invalida"));
    }
}