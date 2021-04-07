package animalrescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setHeightInCm(145);


        System.out.println("Pe catelul meu il cheama " + rex.getName() + " si are " + rex
                .getHeightInCm() + " cm inaltime.");

        Dog tom = new Dog();
        tom.setName("Tom");
        tom.setHeightInCm(20);
        System.out.println("Pe catelul meu il cheama " + tom.getName() + " si are " + tom
                .getHeightInCm() + " cm inaltime.");
        Dogfood pedigree = new Dogfood();
        pedigree.setPret(10);
        pedigree.setCantitate(10.5);
        System.out.println("in stoc exista la acest moment " + pedigree.getCantitate()
                + "kg si pretul este de " + pedigree.getPret());

        Girl anna = new Girl();
        anna.setName("anna");
        anna.setYears(20);
        anna.setSumaDeBaniDisponibila(600);
        System.out.println("Ma cheama " + anna.getName() + " si am " + anna.getyears() + " de ani si am o suma de "
                + anna.getSumaDeBaniDisponibila()+ " pentru a cumpara pe " + rex.getName());
    }
}
