package br.senai.futurodev.banco.models;

import br.senai.futurodev.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
  private double valor;
  private Cliente titular;
  private int numeroApolice;

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public int getNumeroApolice() {
    return numeroApolice;
  }

  public void setNumeroApolice(int numeroApolice) {
    this.numeroApolice = numeroApolice;
  }

  public double getValorImposto() {
    return 42 + (this.valor * 0.02);
  }
}
