package practice.classesandobjectprograms;

public class CreateClassAndObject {
    public static class Dog {
        String name, breed, color;
        int age;

        public Dog(String name, String breed, String color, int age) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        public String getColor() {
            return color;
        }

        public int getAge() {
            return age;
        }
        @Override
        //customizing the string representation of the object
        // rather than just printing the default implementation
        public String toString() {
            return("My name is " +this.getName() +" and my breed is " + this.getBreed() + "."+ " I'm " +this.getColor() +
                    " and I'm "+ this.getAge() + " years old.");
        }


        public static void main(String[] args) {
            Dog Laddu = new Dog("Chinnu", "Pomeranian", "White", 14);
            System.out.println(Laddu.toString());
            System.out.println(Laddu.getAge());
        }
    }
}

