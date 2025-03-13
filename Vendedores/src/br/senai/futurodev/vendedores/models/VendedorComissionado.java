package br.senai.futurodev.vendedores.models;

public class VendedorComissionado extends Vendedor {
  private double taxaComissao;

  public VendedorComissionado() {}

  public VendedorComissionado(double taxaComissao) {
    this.setTaxaComissao(taxaComissao);
  }

  public double getTaxaComissao() {
    return taxaComissao;
  }

  public void setTaxaComissao(double taxaComissao) {
    if (taxaComissao > 0.0 && taxaComissao <= 1.0) {
      System.out.println("Setada a taxa corretamente: " + taxaComissao);
      this.taxaComissao = taxaComissao;
    } else {
      System.out.printf("Taxa inválida: %.2f. Deve ser entre 0.0 e 1.0.%n", taxaComissao);
    }
  }

  @Override
  public double getSalario() {
    return super.getSalario() + (taxaComissao * getValorVendidoNoMes());
  }

  /*private boolean validaTaxa(double taxaComissao) {
    return taxaComissao >= 0.0 && taxaComissao <= 1.0;
  }*/
}
