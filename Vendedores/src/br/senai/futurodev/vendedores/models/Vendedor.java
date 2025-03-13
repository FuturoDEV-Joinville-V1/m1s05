package br.senai.futurodev.vendedores.models;

public class Vendedor {
  private String nome;
  private String sobrenome;
  private double valorVendidoNoMes;
  private double salario;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public double getValorVendidoNoMes() {
    return valorVendidoNoMes;
  }

  public void setValorVendidoNoMes(double valorVendidoNoMes) {
    this.valorVendidoNoMes = valorVendidoNoMes;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
