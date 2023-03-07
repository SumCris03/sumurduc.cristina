package topic3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operations {


    static void printAritmeticOperations() {
        int num1 = 10;
        double num2 = 5;
        System.out.println("Suma numerelor va fi egala cu " + (num1 + num2));
        System.out.println("Diferenta numerelor va fi egala cu " + (num1 - num2));
        System.out.println("produsul numerelor va fi egala cu " + (num1 * num2));
        System.out.println("Citul numerelor va fi egal cu " + (num1 / num2));
        System.out.println("Restul impartirii numerelor va fi egal cu " + (num1 % num2));
        System.out.println("daca incrementam primul numar vom obtine " + (++num1));
        System.out.println("daca decrementam al doilea numar vom obtine " + (--num2));
    }

    static void printLogicOperations() {
        int pretCola = 25;
        int pretFanta = 30;
        int pretSprite = 20;
        System.out.println("Cola este mai scumpa de cit Fanta si Sprite? " + ((pretCola > pretFanta) && (pretCola > pretSprite)));
        System.out.println("Cu 30 de lei pot sa cumpar vre-un suc? " + ((30 > pretCola) || (30 > pretFanta) || (30 > pretSprite)));
        System.out.println("Preturile sunt diferite ? " + !(pretCola == pretFanta));
    }

    static void printrelationarOperations() {
        double inaltime = 10.5;
        double latime = 5.5;
        double lungime = 12;
        System.out.println("Lungimea este egala cu latimea ? : " + (lungime == latime));
        System.out.println("Inaltimea nu este egala cu lungimea ? :" + (inaltime != lungime));
        System.out.println("lungimea este mai mica de cit latimea ? : " + (lungime < latime));
        System.out.println("Inaltimea este mai mare de cit lungimea ? : " + (inaltime > lungime));
        System.out.println("Este latimea mai mica sau egala de cit inaltimea ? :" + (latime <= inaltime));
        System.out.println("Este latimea mai mare sau egala decit inaltimea ? :" + (latime >= inaltime));

    }

    static void useForAndWhile() {
        for (int i = 1; i < 5; i++) {
            System.out.println("numarul i este" + i);
        }


        int x = 6;
        while (x <= 40) {
            System.out.println("Numarul este" + x);
            x++;

        }
    }


}