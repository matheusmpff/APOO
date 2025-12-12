package com.gesac.disciplinas;

import java.util.List;
import java.util.Map;

public class DisciplinaController {
    DisciplinaRepository repositorio = new DisciplinaRepository();
    Validador validador = new Validador();
    Mensagens mensagens = new Mensagens();

    public void criarDisciplina(Map dados) {
        throw new UnsupportedOperationException();
    }

    public void editarDisciplina(Integer id, Map dados) {
        throw new UnsupportedOperationException();
    }

    public void removerDisciplina(Integer id) {
        throw new UnsupportedOperationException();
    }

    public List<Disciplina> listarDisciplinas() {
        throw new UnsupportedOperationException();
    }

    public Disciplina visualizarDisciplina(Integer id) {
        throw new UnsupportedOperationException();
    }

    public List<Atividade> checarAtividadesPendentes() {
        throw new UnsupportedOperationException();
    }

    public void adicionarAtividade(Integer idDisciplina, Integer idAtividade, Map dados) {
        throw new UnsupportedOperationException();
    }

    public void editarAtividade(Integer idDisciplina, Integer idAtividade, Map dados) {
        throw new UnsupportedOperationException();
    }

    public void removerAtividade(Integer idDisciplina, Integer idAtividade) {
        throw new UnsupportedOperationException();
    }
}
