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
        return"";

    }

   public String ex8(int number){

        switch(number){
           case 4: System.out.println("the number is 4");break;
           case 5: System.out.println("the number is 5");break;
           case 6: System.out.println("the number is 6");break;

    }
return "";


}
public String isNumberEven(int number){
        if(number %2==0){
            System.out.println("true");
        }
        return "false";
    }

    public String isEligibleToVote(int number){
        if(number > 18){
            System.out.println("true");
        }
       else if (number<18){
            System.out.println("false");
        }
       return "";


    }
    public int ex11(int first, int second, int third){
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
    }
}
}




