package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {

    private final MemoriaContaRepository repository;

    public AbrirContaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Conta conta;

        conta = new Conta();

        repository.adiciona(conta);

        System.out.printf("Conta número %d o saldo atual é de R$ %.2f %n", conta.getNumeroDaConta(), conta.getSaldo());
        return conta;
    }
}
