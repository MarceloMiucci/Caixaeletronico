package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ComandoEspecificoImpl implements ComandoEspecifico {


    private final Deposito deposito;

    private final Saque saque;

    private final AbrirConta abrirConta;

    public ComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new EfetuarDepositoImpl(repository);
        this.saque = new EfetuarSaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
    }


    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Finalizando o programa");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Digite o número da Conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor de saque!");
            double valor = entrada.nextInt();

            this.saque.execute(valor, numero);
            System.out.println("Realizando saque");

        } else if (comando == 2) {
            System.out.println("Digite o número da Conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado: ");
            double valor = entrada.nextInt();

            this.deposito.execute(valor, numero);
            System.out.println("Realizando Depósito");

        } else if (comando == 3) {
            abrirConta.execute();

        } else {
            System.out.println("Comando Inválido!");
        }
        return resultado;
    }
}
