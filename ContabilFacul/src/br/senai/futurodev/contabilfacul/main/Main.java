package br.senai.futurodev.contabilfacul.main;

import br.senai.futurodev.contabilfacul.models.Funcionario;
import br.senai.futurodev.contabilfacul.models.GeradorRelatorio;
import br.senai.futurodev.contabilfacul.models.Professor;
import br.senai.futurodev.contabilfacul.models.Reitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Professor professor = new Professor();
        professor.setNome("João");
        professor.setSalario(1000);
        professor.setHorasAula(5);
        professor.setQtdDisciplinas(1);

        Funcionario func = new Funcionario();
        func.setNome("Israel");
        func.setSalario(1000);

        GeradorRelatorio relatorio = new GeradorRelatorio();

        Reitor reitor = new Reitor();
        reitor.setNome("Louise");
        reitor.setSalario(2000);

        relatorio.adiciona(func);
        relatorio.adiciona(reitor);
        relatorio.adiciona(professor);
    }
}