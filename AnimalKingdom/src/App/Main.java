package App;

import java.util.*;


public class Main
{
    public static void printAnimals(List<Animals> animals, Test tester)
    {
        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName());
            }
        }
    }


    public static void main(String[] args)
    {
        ArrayList<Animals> animals = new ArrayList<Animals>();

        //ArrayList<Birds> birds = new ArrayList<Birds>();
        //ArrayList<Fish> fish = new ArrayList<Fish>();


        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoom = new Mammals("Raccoom", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock      = new Birds("Peacock", 1821);
        Birds toucan  = new Birds("Toucan", 1758);
        Birds parrot      = new Birds("Parrot", 1824);
        Birds swan    = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);


        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoom);
        animals.add(bigfoot);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);


        //animals.sort(Comparator.comparing(a -> a.getYear()).reversed()); 
        //animals.sort(Comparator.reverseOrder()); 

        //Arrays.sort(animals, Collections.reverseOrder());



        animals.sort(Comparator.comparing(Animals::getYear).reversed());


            System.out.println("******************");


//        for (Animals a : animals)
//        {
//            System.out.println(a.getYear());
//
//        }


    }
}
