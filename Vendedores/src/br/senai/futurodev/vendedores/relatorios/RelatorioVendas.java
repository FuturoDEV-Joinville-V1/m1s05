package br.senai.futurodev.vendedores.relatorios;

import br.senai.futurodev.vendedores.models.Vendedor;

public class RelatorioVendas {
  public static void imprimeSalarioVendedor(Vendedor vendedor) {
    System.out.printf(
        "Salário do vendedor %s %s: R$%.2f.%n",
        vendedor.getNome(), vendedor.getSobrenome(), vendedor.getSalario());
  }
}
