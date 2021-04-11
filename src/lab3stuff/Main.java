package lab3stuff;

import java.util.Enumeration;

public class Main {
    //3
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2, 3);

        // System.out.println("The bigger number is: " + biggest);
        // System.out.println(op.ex4("FastTrackIt"));
        // System.out.println(op.ex5("notFastTrackIt", 4));
        // System.out.println(op.ex6(7) + " cm");
        //  System.out.println(op.ex7(4));
        // System.out.println(op.ex8(5));
        // System.out.println(op.isNumberEven(7));
        // System.out.println(op.isEligibleToVote(19));
        // System.out.println(op.ex11(4, 6, 7));
        //tema lab4 *forloops*

        op.print100();
        op.printMinus100();
        op.numberToNumber();
        op.biggerNumer();
        op.nrPar();
        op.nrImpar();
        System.out.println(op.sumaNumere(50));
        System.out.println(op.mediaNumere(77));
        op.stelutee();
        //tema while do thingi
        op.printTo100W();
        op.printMinus100w();
        op.xToyW();
        op.biggernumberMinusW();
        op.nrParw();
        op.nrImparw();
        op.sumAndMediaw();
        op.betweenNumbersW();
        op.fibonaci();
        op.cozaLozaWoza();
    }


}