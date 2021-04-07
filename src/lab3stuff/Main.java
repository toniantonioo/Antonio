package lab3stuff;

public class Main {
    //3
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2, 3);

        System.out.println("The bigger number is: " + biggest);
        System.out.println(op.ex4("FastTrackIt"));
        System.out.println(op.ex5("notFastTrackIt", 4));
        System.out.println(op.ex6(7) + " cm");
        System.out.println(op.ex7(4));
        System.out.println(op.ex8(5));
        System.out.println(op.isNumberEven(7));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.ex11(4, 6, 7));
    }


}