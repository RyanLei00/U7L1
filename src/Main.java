import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}

    /*
    ArrayList<String> trees = new ArrayList<String>();
    trees.add("pine");
    trees.add("maple");
    trees.add("frasier fir");
    System.out.println(trees);
    System.out.println(trees.size());
    System.out.println(trees.get(3));

    ArrayList<String> names = new ArrayList<String>();
    names.add("Benji");
    names.add("Andy");
    int lengths = names.size() + moreNames.length + moreNames[0].length() + names.get(0).length();
    System.out.println(lengths);

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Tails"));
    cats.add(new Cat("Legs"));
    cats.add(new Cat("Kitten"));
    cats.add(new Cat("Tails2"));

    Cat newCat = new Cat("Cathy");
    cats.set(2, newCat);
    System.out.println(cats);

    cats.get(1).setName("Archie");
    System.out.println(cats);
     */
