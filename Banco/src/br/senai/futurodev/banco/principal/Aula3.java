package br.senai.futurodev.banco.principal;

import br.senai.futurodev.banco.helpers.ManipuladorTributaveis;
import br.senai.futurodev.banco.interfaces.Tributavel;
import br.senai.futurodev.banco.models.SeguroDeVida;
import br.senai.futurodev.banco.models.contas.ContaCorrente;
import br.senai.futurodev.banco.models.contas.ContaInvestimento;

public class Aula3 {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    ContaInvestimento ci = new ContaInvestimento();

    cc.depositar(100);
    ci.depositar(200);

    SeguroDeVida seguro = new SeguroDeVida();

    seguro.setValor(50);

    ManipuladorTributaveis manipuladorTributaveis = new ManipuladorTributaveis();

    Tributavel[] tributaveis = {cc, ci, seguro};

    manipuladorTributaveis.calculaImpostos(tributaveis);
  }
}
