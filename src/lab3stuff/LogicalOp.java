package lab3stuff;

public class LogicalOp {
    //3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {

            return first;
        } else {
            return second;
        }
    }


    public String ex4(String text) {

        if (text.equals("FastTrackIt")) {
            return "Learning text comparison";
        }
        return "Got to try some more";


    }

    public String ex5(String text, int number) {

        if (text.equals("FastTrack") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + text);
        }


        return "";
    }

    public String ex6(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was " + number;
        }
        return "The forecast snow is " + number;


    }

    public String ex7(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "";

    }

    public String ex8(int number) {

        switch (number) {
            case 4:
                System.out.println("the number is 4");
                break;
            case 5:
                System.out.println("the number is 5");
                break;
            case 6:
                System.out.println("the number is 6");
                break;
            default:
                System.out.println("the number u selected is not in the interval");
        }
        return "";


    }

    public String isNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("true");
        }
        return "false";
    }

    public String isEligibleToVote(int number) {
        if (number > 18) {
            System.out.println("true");
        } else if (number < 18) {
            System.out.println("false");
        }
        return "";


    }

    public int ex11(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else
            return third;


    }

    public void print100() {
        int number = 1;
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

    }

    public void printMinus100() {
        int number = 1;
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void numberToNumber() {
        int first = 1;
        int second = 10;


        for (int i = first; i <= second; i++) {

            System.out.println(i);

        }
    }


    public void biggerNumer() {
        int first = 9;
        int second = 20;

        if (second > first) {
            for (int i = first; i <= second; i++) {
                System.out.println(i);
            }

        } else {
            for (int x = second; x <= first; x++) {
                System.out.println(x);

            }

        }

    }


    public void nrPar() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public void nrImpar() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


    }


    public int sumaNumere(int number) {
        int count = 0;

        for (int i = number; i <= 100; i++) {
            count += i;
        }
        return count;

    }


    public float mediaNumere(int number) {
        int count = 0;
        float media;
        for (int i = number; i <= 100; i++) {
            count += i;
        }
        media = count / (100f - number);
        return media;


    }

    public void stelutee() {

        int i = 8;

        for (int n = 1; n <= 8; n++) {

            for (int m = 1; m <= i; m++) {
                System.out.print("*");

            }
            i--;
            System.out.println("");
        }


    }

    //white loops
    public void printTo100W() {
        int x = 5;
        do {
            System.out.println(x);
            x++;
        } while (x <= 100);
    }

    public void printMinus100w() {
        int x = 1;
        do {
            System.out.println(x);
            x--;
        } while (x >= -100);

    }

    public void xToyW() {

        int x = 30;
        int y = 10;
        do {
            System.out.println(x);
            x--;
        }
        while (x >= y);
    }


    public void biggernumberMinusW() {
        int x = 7;
        int y = 17;

        if (x > y) {
            do {
                System.out.println(y);
                y++;
            } while (y <= x);

        } else {
            do {
                System.out.println(x);
                x++;
            } while (x <= y);

        }


    }

    public void nrParw() {
        int i = 6;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    public void nrImparw() {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    //Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
    // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumAndMediaw() {
        int count = 0;
        int x = 111;
        int summ = 0;
        float media;
        do {
            summ = summ + x;
            count++;
            x++;

        } while (x <= 8899);
        System.out.println("suma numerelor este " + summ);
        media = summ / count;
        System.out.println("media este " + media);

    }


    public void betweenNumbersW() {
        int x = 5;
        int y = 630;
        int count = 0;
        float media;
        int summ = 0;
        do {
            if (x % 7 == 0) {
                summ = x + summ;
                count++;

            }
            x++;
        } while (x <= y);
        media = (float) summ / (float) count;
        System.out.println(media);
    }

    public void fibonaci() {

        int x = 0;
        int i = 1;
        int fib = 1;
        int panaAjungLa20 = 1;
        System.out.println(x);
        do {
            System.out.println("numerele lui fibernaci sunt " + fib);
            fib = x + i;
            x = i;
            i = fib;
            panaAjungLa20++;
        }
        while (panaAjungLa20 < 20);
    }


    public void cozaLozaWoza() {
        int i = 1;
        int count = 0;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                
                System.out.print("CozaLozaWoza ");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            }
            else if (i % 7 == 0) {
                System.out.print("Woza ");
            }
            else if (i % 5 == 0) {
                System.out.print("Loza ");
            }
            else if (i % 3 == 0) {
                System.out.print("Coza ");
            }
            else {
                System.out.print(i + "  ");
            }
            if (count % 11 == 0) {
                System.out.println(" ");
            }


            count++;
            i++;


        }


    }
}











