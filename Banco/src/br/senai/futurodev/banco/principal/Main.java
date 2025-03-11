package br.senai.futurodev.banco.principal;

import br.senai.futurodev.banco.models.Cliente;
import br.senai.futurodev.banco.models.Conta;
import br.senai.futurodev.banco.models.contas.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("João");
        cli.setSobrenome("Oliveira");

        ContaCorrente cc = new ContaCorrente(cli);

        cc.depositar(75);

        cc.getSaldo();

        cc.imprimeSaldo();

        System.out.println(cc);

        ContaCorrente outraCc = new ContaCorrente(cli);

        cc.depositar(75);

        System.out.println(cc.equals(outraCc));
  }
}