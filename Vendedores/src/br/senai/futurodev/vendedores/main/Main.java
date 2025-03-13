package br.senai.futurodev.vendedores.main;

import br.senai.futurodev.vendedores.models.Vendedor;
import br.senai.futurodev.vendedores.models.VendedorComissionado;
import br.senai.futurodev.vendedores.relatorios.RelatorioVendas;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner entrada = new Scanner(System.in);
    Vendedor vendedor = new Vendedor();
    System.out.println("Digite nome do vendedor:");
    vendedor.setNome(entrada.nextLine());

    System.out.println("Digite sobrenome do vendedor:");
    vendedor.setSobrenome(entrada.nextLine());

    System.out.println("Digite salário do vendedor:");
    vendedor.setSalario(Double.parseDouble(entrada.nextLine()));

    System.out.println("Digite valor vendido no mês do vendedor em R$:");
    vendedor.setValorVendidoNoMes(Double.parseDouble(entrada.nextLine()));

    VendedorComissionado comissionado = new VendedorComissionado();
    System.out.println("Digite nome do vendedor:");
    comissionado.setNome(entrada.nextLine());

    System.out.println("Digite sobrenome do vendedor:");
    comissionado.setSobrenome(entrada.nextLine());

    System.out.println("Digite salário do vendedor:");
    comissionado.setSalario(Double.parseDouble(entrada.nextLine()));

    System.out.println("Digite valor vendido no mês do vendedor em R$:");
    comissionado.setValorVendidoNoMes(Double.parseDouble(entrada.nextLine()));

    do {
      System.out.println("Digite taxa de comissão do vendedor, entre 0.0 e 1.0:");
      comissionado.setTaxaComissao(Double.parseDouble(entrada.nextLine()));
    } while (comissionado.getTaxaComissao() == 0.0);

    RelatorioVendas.imprimeSalarioVendedor(vendedor);
    RelatorioVendas.imprimeSalarioVendedor(comissionado);
  }
}
