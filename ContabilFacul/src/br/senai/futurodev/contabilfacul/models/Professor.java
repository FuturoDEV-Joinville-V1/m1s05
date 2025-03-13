package br.senai.futurodev.contabilfacul.models;

public class Professor extends Funcionario {
    private int horasAula;
    private int qtdDisciplinas;

    @Override
    public double getGastos() {
        return super.getGastos() + (10 * this.horasAula);
    }

    @Override
    public String getInfo() {
        return String.format("%sHoras Aula: %d", super.getInfo(), this.horasAula);
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }

    public void setQtdDisciplinas(int qtdDisciplinas) {
        this.qtdDisciplinas = qtdDisciplinas;
    }
}
