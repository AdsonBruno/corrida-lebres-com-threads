import controller.LebreController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("QUAL SUA APOSTA? ");
        System.out.println("1 para apostar na lebre 1");
        System.out.println("2 para apostar na lebre 2");
        System.out.println("3 para apostar na lebre 3");
        System.out.println("4 para apostar na lebre 4");
        System.out.println("5 para apostar na lebre 5");

        int opcao = entradaUsuario.nextInt();

        LebreController lebre1 = new LebreController("Lebre 1 ");
        Thread thread1 = new Thread(lebre1);
        thread1.start();

        LebreController lebre2 = new LebreController("Lebre 2 ");
        Thread thread2 = new Thread(lebre2);
        thread2.start();

        LebreController lebre3 = new LebreController("Lebre 3 ");
        Thread thread3 = new Thread(lebre3);
        thread3.start();

        LebreController lebre4 = new LebreController("Lebre 4 ");
        Thread thread4 = new Thread(lebre4);
        thread4.start();

        LebreController lebre5 = new LebreController("Lebre 5 ");
        Thread thread5 = new Thread(lebre5);
        thread5.start();
    }
}