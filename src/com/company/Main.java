package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(piedra());

    }

    public static Integer piedra() {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("¿Piedra, papel, Tijera o spock?");
        String uno = input.nextLine();
        System.out.println("participante dos: ¿Piedra, papel, Tijera o spock?");
        String dos = input.nextLine();

        if ((uno.equals("Papel") && dos.equals("Piedra")) || (uno.equals("Tijera") && dos.equals("Papel")) || (uno.equals("Piedra") && dos.equals("Tijera")) || (uno.equals("Spock") && dos.equals("Tijera")) || (uno.equals("Spock") && dos.equals("Piedra"))) {
            return 1;
        } else if (uno.equals(dos)) {
            return 0;
        } else {
            return 2;
        }

    }

public static Integer primos(int n) {
        for(int i = 0 ; i<n; i++) {

            if((i%i) == 0){

            }
        }
        return 1;
}
}