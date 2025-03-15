package br.senai.futurodev.banco.helpers;

import br.senai.futurodev.banco.interfaces.Tributavel;

public class ManipuladorTributaveis {
  private double total;

  public void calculaImpostos(Tributavel[] tributaveis) {
    for (Tributavel tributavel : tributaveis) {
      this.total += tributavel.getValorImposto();
    }
  }

  /*  public void calculaImpostos(SeguroDeVida[] seguros) {
    for (SeguroDeVida seguro : seguros) {
      this.total += seguro.getValorImposto();
    }
  }*/

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
