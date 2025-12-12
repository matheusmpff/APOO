package com.gesac.disciplinas;

import java.util.List;

public class Disciplina {
    private Integer id;
    private String nome;
    private String professor;
    private Integer cargaHoraria;
    private List<Atividade> atividades;

    public void adicionarAtividade(Atividade a) {
        throw new UnsupportedOperationException();
    }

    public void removerAtividade(Integer id) {
        throw new UnsupportedOperationException();
    }

    // How is this one going to work? 🤔 
    public void editarAtividade(Atividade a) {
        throw new UnsupportedOperationException();
    }
}
