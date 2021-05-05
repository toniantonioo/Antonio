package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainLab7 {
    public static void main(String[] args) {


        Read rd = new Read();
//        System.out.println(rd.numerFromKeyboard());
//        System.out.println(rd.floatFromKeyboard());
//        System.out.println(rd.doubleFromKeyboard());
//        System.out.println(rd.longFromKeyboard());
        // System.out.println(rd.returnAray(7));
        List<Integer> list2 = new ArrayList<>();
        System.out.println(rd.numbersInAList(list2));
    }
}

