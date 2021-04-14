package lab5;

public class Main {


    public static void main(String[] args) {
        Calculator cu =new Calculator();
LogicalOp op =new LogicalOp();
//
//        System.out.println(cu.calc(1,3) );
//        System.out.println(cu.calc(1,4,6));
//        System.out.println(cu.calc(2f, 30.0F));
//        System.out.println(cu.calc(3.5f,5.6f,5.3f));

        int [] myarray= new int[100];

       // op.arrayTo100(myarray);
       // op.printarray(myarray);

int[]arraypar = new int[49];
     //  System.out.println(op.pararray(arraypar));
     //op.printarray(arraypar);
        //op.mediaArray(myarray);


int[] array2= new int[103];


        String[] warray=new String[5];
        warray[0] = "ziua";
        warray[1] = "maine";
        warray[2] = "ieri";
        warray[3] = "poimaine";
        warray[4] = "acuma";

        System.out.println(op.trueOrfalse(warray, "text"));

            int[] returnumber=new int [7];


       System.out.println(op.returnNumberex6(array2, 23));
String[] chestiutearrray= new String[10];
       //op.chestiute(chestiutearrray);

       int[]arrayex8 = new int [5];


      op.nonumber(arrayex8,5);






}


}

