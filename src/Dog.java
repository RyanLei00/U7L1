public class Dog {

    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void bark(){
        System.out.println("WooF!");
    }

    public String toString(){
        return "Dog : " + name;
    }
}
