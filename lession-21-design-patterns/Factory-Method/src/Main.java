public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("feline");
        System.out.println("animal1's sound is: " + animal1.makeSound());

        Animal animal2 = factoryAnimal.getAnimal("canine");
        System.out.println("animal2's sound is: " + animal2.makeSound());
    }
}