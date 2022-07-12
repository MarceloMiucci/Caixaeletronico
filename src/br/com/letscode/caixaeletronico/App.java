package br.com.letscode.caixaeletronico;

import br.com.letscode.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletronico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Caixa eletronico executando um novo comando!");
        }

        System.out.println("Caixa eletronico desligando!");
    }
}
