package pl.camp.it.immutable;

public class Cat {
    private String name;
    private String race;

    private Cat() {
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public static class CatBuilder {
        Cat object = new Cat();

        public CatBuilder setName(String name) {
            this.object.name = name;
            return this;
        }

        public CatBuilder setRace(String race) {
            this.object.race = race;
            return this;
        }

        public Cat build() {
            Cat temp = this.object;
            this.object = new Cat();
            return temp;
        }
    }
}
