package lab5;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOp {


    public void printarray(int[] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
        }
    }

    public void arrayTo100(int[] myarray) {
        for (int i = 0; i <= 100; i++) {
            myarray[i] = i + 1;
        }
    }


    public int pararray(int[] myarray) {

        int k = 0;

        for (int i = 1; i < 100; i++) {

            if (i % 2 == 0) {
                myarray[k] = i;
                k++;
            }
        }
        return k;
    }

    public float mediaArray(int[] array2) {
        int summ = 0;
        float media = 0;
        for (int i = 0; i < 100; i++) {
            array2[i] = i + 1;
            summ = summ + array2[i];
        }
        media = summ / (float) array2.length;

        return media;

    }

    public Boolean trueOrfalse(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == text) {
                return true;
            }
        }
        return false;
    }

    public int returnNumberex6(int[] returnumber, int number) {
        returnumber[0]=90;
        returnumber[1]=54;
        returnumber[2]=23;
        returnumber[3]=54;
        returnumber[4]=34;
        returnumber[5]=53;
        returnumber[6]=87;
        int acelnumar=0;
        for (int i = 0; i < 7; i++) {
            if(returnumber[i]==number){
                acelnumar=i;}

        }
        return acelnumar;
    }
    public void chestiute(String[] liniuta){
      for(int i=0;i<10;i++) {
          liniuta[i] = "- - - - - - - - - -";

          System.out.println(liniuta[i]);
      }
    }


    public void  nonumber(int[] arrayex8, int number){
        arrayex8[0]=1;
        arrayex8[1]=2;
        arrayex8[2]=5;
        arrayex8[3]=6;
        arrayex8[4]=25;
        int test = 0;
        for (int i=0; i<5; i++) {
            if (arrayex8[i]==number) {
                test=i;
            }
        }
            for (int x=0; x<5; x++) {
             if (x==test){

                 x++;
            }

                System.out.println(arrayex8[x]);
        }

    }

}