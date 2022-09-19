package pl.camp.it.immutable;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "3", 2000);

        System.out.println(car1);
        Car car2 = car1.setYear(2010);

        System.out.println(car1);
        System.out.println(car2);

        Cat.CatBuilder catBuilder = new Cat.CatBuilder();

        Cat cat = catBuilder.setName("Janusz").setRace("Kundel").build();
    }
}
