package br.senai.futurodev.contabilfacul.models;

public class Reitor extends Funcionario {
    @Override
    public String getInfo() {
        return String.format("Reitor. %s", super.getInfo());
    }
}
