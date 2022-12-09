public class Dog extends AAnimal {


    public Dog(String name) {
        super(name,500,10);
    }

    @Override
    public String getKind() {
        return "dog";
    }
}