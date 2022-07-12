package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;

public interface Transferencia {


    void transferir(double valor, Conta favorecido, Conta origem);
}
