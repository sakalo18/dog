public class Cat extends AAnimal {
    public Cat( String name) {
        super(name,200,0);
    }

    @Override
    public String getKind() {
        return "cat";
    }
}