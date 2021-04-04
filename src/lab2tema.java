public class lab2tema {


    //tema lab 2
    public static void main(String[] args) {
        printMyName();
        float i = devide( +10f, 5f);
        System.out.println(("rezultatul impartirii este ") + i);
        double ii = multiplied( 5d, 6d);
        System.out.println(("rezultatul inmultirii este ") + ii);
        int iii = summ(  10, 5);
        System.out.println(("rezultatul adunarii este ")+iii);
        int iiii = subb(15, 5);
        System.out.println(("rezultatul scaderii este ") +iiii);
        printJavaExercitiu3();
        float iiiii = media(2f, 5f, 6f);
        System.out.println(("media numerelor este ") + iiiii);
        printRobotelJava();
        float rez2Nume = rest2(19f, 7f);
        System.out.println(("restul impartirii acestor 2 numere este ")+ rez2Nume);
        float fahrenheit = fahrenheit(97f);
        System.out.println(("celsius is ") + fahrenheit);
        double disInInch = calcmeters(300d);
        System.out.println(("distanta in metri este de ") + disInInch);
        // exercitiul 9
        viteza(80000, 1, 6, 40);


    }


    public static void printMyName() {

        System.out.println("Hello \n Antonio");

    }

    public static float devide(float first, float second) {
        float devide = first / second;
        return devide;
    }

    public static double multiplied(double first, double second) {
        double multiplied = second * first;
        return multiplied;
    }

    public static int summ(int first, int second) {
        int summ = first + second;
        return summ;
    }

    public static int subb(int first, int second) {
        int subb = first - second;
        return subb;
    }

    public static void printJavaExercitiu3() {
        System.out.println("   j    a     v     v    a");
        System.out.println("   j   a a     v   v    a a");
        System.out.println("j  j  aaaaa     v v    aaaaa");
        System.out.println(" jj  a     a     v    a     a");
    }

    public static float media(float first, float second, float third) {
        float media = (first + second + third) / 3;
        return media;
    }

    public static void printRobotelJava() {
        System.out.println("  +＂＂＂＂＂＂＂+");
        System.out.println("[ |   ○  ○   | ]");
        System.out.println("  |     ^     |");
        System.out.println("  |   ' _ '   |");
        System.out.println("  +__________ +");
    }

    public static float rest2(float first, float second) {
        float rest2 = first % second;
        return rest2;
    }

    public static float fahrenheit(float first) {
        float fahrenheit = (5f / 9f) * (first - 32f);
        return fahrenheit;
    }

    public static double calcmeters(double inch) {

        double calcmeters = 5d * inch;
        return calcmeters;

    }             //                 80000         1         6       40

    public static void viteza(float distanta, int ore, int min, int sec) {
        float timp = sec + min * 60 + ore * 60 * 60;
        float mps = distanta / timp;
        float kmph = (distanta / 1000) / (timp / 3600);
        float mph = (distanta / 1609) / (timp / 3600);

        System.out.println(("metrii pe secunda ") + mps);
        System.out.println(("kilometrii pe ora ") + kmph);
        System.out.println(("mile pe ora ") + mph);


    }


}
