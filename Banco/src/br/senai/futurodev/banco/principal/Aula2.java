package br.senai.futurodev.banco.principal;

import br.senai.futurodev.banco.models.Conta;
import br.senai.futurodev.banco.models.contas.ContaCorrente;
import br.senai.futurodev.banco.models.contas.ContaPoupanca;
import java.util.Scanner;

public class Aula2 {
  public static void main(String[] args) {
    // exemplos aula 2
    Scanner entrada = new Scanner(System.in);

    System.out.println("Você deseja criar uma conta corrente ou poupança? 1- Corrente 2- Poupança");
    int decisao = Integer.parseInt(entrada.nextLine());

    Conta conta = decisao == 1 ? new ContaCorrente() : new ContaPoupanca();
    Conta poupanca = new ContaPoupanca();

    conta.depositar(10);

    poupanca.depositar(20);

    System.out.println("Saldo da conta corrente: R$" + conta.getSaldo());
    System.out.println("Saldo da conta poupança: R$" + poupanca.getSaldo());

    /*Object objeto = new String();
    objeto = new Conta();
    objeto = new ContaCorrente();
    objeto = new Scanner(System.in);*/

    /*
    // ERRO!
    ContaCorrente cc = new Conta();
    cc.getLimite();
    */

  }
}
