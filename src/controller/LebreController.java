package controller;

import java.util.Random;

public class LebreController implements Runnable{

    private final String nomeLebre;
    private static int opcaoEscolha;

    public LebreController(String nomeLebre) {
        this.nomeLebre = nomeLebre;
    }

    Random aleatorio = new Random();
    int pulos;
    String p = " ";
    private static int somaPulos = 0;
    int qtd_pulos = 0;
    private static int verificaVencedorCorrida = 1;

    @Override
    public void run() {
        do {
            pulos = aleatorio.nextInt(3);

            if ((pulos >= 1 && pulos <= 3)) {
                somaPulos += pulos;
                qtd_pulos++;
                p += " -> ";
                System.out.println("Pulos em metros "+pulos+ " - Distância percorrida - " + somaPulos + " metros");

                System.out.println(nomeLebre + p + "\n\n");
                if ((somaPulos >= 20) && (somaPulos <= 23)) {
                    System.out.println(nomeLebre + " ganhou com " + qtd_pulos + "pulos!");
                    verificaAposta();

                }
                verificaVencedorCorrida++;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("Ops, interrompido!");
                }
            }
        } while (somaPulos < 21);
            Thread.yield();
    }

    public void verificaAposta() {
        switch (opcaoEscolha) {
            case 1:
                if (verificaVencedorCorrida % 2 == 1) {
                    System.out.println("Você é o vencedor");
                } else {
                    System.out.println("Você é perdedor");
                } System.exit(0);
            case 2:
                if (verificaVencedorCorrida % 2 == 0) {
                    System.out.println("Você é o vencedor");
                } else {
                    System.out.println("Você é perdedor");
                } System.exit(0);
            case 3:
                if (verificaVencedorCorrida % 3 == 1) {
                    System.out.println("Você é o vencedor");
                } else {
                    System.out.println("Você é perdedor");
                } System.exit(0);
            case 4:
                if (verificaVencedorCorrida % 4 == 1) {
                    System.out.println("Você é o vencedor");
                } else {
                    System.out.println("Você é perdedor");
                } System.exit(0);
            case 5:
                if (verificaVencedorCorrida % 5 == 1) {
                    System.out.println("Você é o vencedor");
                } else {
                    System.out.println("Você é perdedor");
                } System.exit(0);
        }
        System.exit(0);
    }
}
