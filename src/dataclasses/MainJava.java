package dataclasses;

public class MainJava {

    public static void main(String[] args) {
        Person person1 = new Person("Andrii", "Krenevych", 20);
        Person person2 = new Person("Andrii", "Krenevych", 20);

        System.out.println(person1 == person2);  // порівняння посилань
        System.out.println(person1.equals( person2));  // порівняння контенту
    }


}
