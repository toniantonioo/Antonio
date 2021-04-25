package lab6;

import java.util.List;

public class LogicalOp {
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, fiecare pe rand nou.

    public void listEx1(List<String> listex1, int index) {
        System.out.println("ex1");
        for (int i = index; i < listex1.size(); i++) {

            System.out.println(listex1.get(i));
        }


    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void listEx2(List<Integer> listex2, int numar) {

        listex2.add(numar);
        System.out.println("ex2");
        System.out.println(listex2);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru.

    public void listaEx3(List listex3, int index) {
        System.out.println("ex3");
        for (int i = index; i < listex3.size(); i++) {
            System.out.println(listex3.get(i));
        }

    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, dar invers(de la capat la inceput).

    public void listaEx4(List<String> listex4, int index) {
        System.out.println("ex4");
        for (int i = index; i >= 0; i--) {
            System.out.print((listex4.get(i)));
        }

    }

    //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void listEx5(List<String> listex5, int index, String newVariable) {
        listex5.add(index, newVariable);
        System.out.println("ex5");
        System.out.println(listex5);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void listaEx6(List<Integer> listex6, int newParametru) {
        listex6.add(0, newParametru);
        System.out.println("ex6");
        System.out.println(listex6);
    }

    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void listaEx7(List<Integer> listex7) {
        System.out.println("ex7");
        for (int i = 0; i <= listex7.size(); i++) {
            System.out.println("Pe pozitia " + (i) + " valoarea este " + listex7.get(i));
        }
    }
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public void listaEx8(List<Integer> listex8) {
        System.out.println("ex8");


        int a = listex8.get(1);
        int max ;
        for (int i = 2; i <= listex8.size(); i++) {
            int b =listex8.get(i);
            if (a>=b){
                max=a;
            }
            else{
                max=b;
            a=max;}
            System.out.println(max);
        }


    }
    }



