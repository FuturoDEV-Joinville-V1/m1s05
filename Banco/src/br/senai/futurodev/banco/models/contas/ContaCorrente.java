package br.senai.futurodev.banco.models.contas;

import br.senai.futurodev.banco.interfaces.Tributavel;
import br.senai.futurodev.banco.models.Cliente;
import br.senai.futurodev.banco.models.Conta;

public class ContaCorrente extends Conta implements Tributavel {
  private double limite;

  public ContaCorrente() {
    System.out.println("Conta Corrente criada");
  }

  public ContaCorrente(Cliente titular) {
    super(titular);
    System.out.println("Conta Corrente criada com titular");
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public double getSaldo() {
    return this.limite + super.getSaldo();
  }

  @Override
  public void imprimeSaldo() {
    super.imprimeSaldo();
    System.out.printf("E possui R$%.2f de limite.%n", this.limite);
  }

  @Override
  public String toString() {
    return String.format("%sLimite: R$%.2f.%n", super.toString(), this.limite);
  }

  public double getValorImposto() {
    return this.getSaldo() * 0.01;
  }
}
