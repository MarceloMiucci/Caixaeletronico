package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class EfetuarDepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public EfetuarDepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;

    }

    @Override
    public double execute(double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);

        System.out.println("Efetuando Depósito: " + valor);
        System.out.println("Numero da Conta: " + numeroDaConta);
        System.out.printf("O saldo atualizado é de R$ %.2f %n", conta.getSaldo());
        return valor;
    }
}
