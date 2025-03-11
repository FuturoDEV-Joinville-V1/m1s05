package br.senai.futurodev.banco.models;

public class Conta {
    private Cliente titular;
    private double saldo;
    private int numeroConta;
    private boolean ativa;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Conta() {
        System.out.println("Conta criada.");
    }

    public Conta(Cliente titular, double saldo) {
        this(titular);
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        }

        System.out.println("Saldo insuficiente.");
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }

        return false;
    }

    public void imprimeSaldo() {
        System.out.printf("O cliente %s %s possui R$%.2f de saldo.%n",
                this.titular.getNome(), this.titular.getSobrenome(), this.getSaldo());
    }

    @Override
    public String toString() {
        return String.format("Titular: %s %s.%nSaldo: R$%.2f.%nAtiva: %b.%n",
                titular.getNome(), titular.getSobrenome(),
                saldo, ativa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta obj = (Conta) o;

        return this.numeroConta == obj.getNumeroConta();
    }
}
