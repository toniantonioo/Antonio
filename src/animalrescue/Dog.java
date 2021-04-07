package animalrescue;

public class Dog {
    private  String name ;
    private String breed ;
    private int age ;
    private String color;
    private float weight ;
    private int heightInCm ;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;
    }

    public int getHeightInCm(){
        return heightInCm;
    }


}


