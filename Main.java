//ABSTRACT CLASS (format):
// Abstract class
//abstract class Animal {
//    abstract void makeSound();
//    void eat() {
//        System.out.println("This animal eats food.");
//    }
//}
//class Dog extends Animal {
//    void makeSound() {
//        System.out.println("Bark");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.makeSound();
//        d.eat();
//    }
//}

//INTERFACE FORMAT :
interface Animal {
    void makeSound();
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}