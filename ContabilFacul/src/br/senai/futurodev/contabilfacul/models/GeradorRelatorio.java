package br.senai.futurodev.contabilfacul.models;

public class GeradorRelatorio {
    public void adiciona(Funcionario func) {
        System.out.println(func.getInfo());
        System.out.println(func.getGastos());
        if (func instanceof Professor prof) {
            System.out.println("Qtd disciplinas: " + prof.getQtdDisciplinas());
        }
    }
}
