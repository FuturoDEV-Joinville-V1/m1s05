package br.senai.futurodev.banco.models.contas;

import br.senai.futurodev.banco.interfaces.Tributavel;
import br.senai.futurodev.banco.models.Cliente;
import br.senai.futurodev.banco.models.Conta;

public class ContaInvestimento extends Conta implements Tributavel {
  public ContaInvestimento() {}

  public ContaInvestimento(Cliente titular) {
    super(titular);
  }

  public double getValorImposto() {
    return this.getSaldo() * 0.02;
  }
}
