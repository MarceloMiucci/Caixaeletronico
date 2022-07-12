package br.com.letscode.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Digite uma opção conforme abaixo...");
        System.out.println("Para finalizar digite 0");
        System.out.println("Para sacar digite 1");
        System.out.println("Para depositar digite 2");
        System.out.println("Para abrir uma nova conta, digite 3");
    }
}
