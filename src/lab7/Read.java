package lab7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public int numerFromKeyboard() {

        Scanner scan = new Scanner(System.in);
        int numerFromKeyboard = scan.nextInt();
        return numerFromKeyboard;
    }

    public float floatFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        float floatFromKeyboard = scan.nextFloat();
        return floatFromKeyboard;
    }

    public double doubleFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        double numerFromKeyboard = scan.nextDouble();
        return doubleFromKeyboard();
    }


    public long longFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        long numerFromKeyboard = scan.nextLong();
        return numerFromKeyboard;
    }

    public int returnAray(int index) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter numbers to array  " + i + " ");
            array[i] = scan.nextInt();
        }
        System.out.println("Array:" + Arrays.toString(array));
        return array[scan.nextInt()];
    }

    //. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu v-a primii parametru lungimea.In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar,
    // sa se intrerupa citirea)

    public int numbersInAList(List<Integer> list) {
        int num = 0;

        boolean dotheThing = false;
        do {
            System.out.println("verifying number,,, ");

            try {

                Scanner scan = new Scanner(System.in);
                num = scan.nextInt();
                dotheThing = false;

            } catch (InputMismatchException tt) {
                dotheThing = true;

                System.err.println("incorect");


            }

        }while(dotheThing == false);

            return numbersInAList(list);

    }



    }