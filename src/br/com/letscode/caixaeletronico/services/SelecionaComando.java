package br.com.letscode.caixaeletronico.services;

import java.util.Scanner;

public class SelecionaComando {

    ListarComandos listarComandos;

    ObtemComando obtemComando;

    ComandoEspecifico comandoEspecifico;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.comandoEspecifico = new ComandoEspecificoImpl();
    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return comandoEspecifico.execute(comando);
    }
}