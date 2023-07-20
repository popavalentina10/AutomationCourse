package ro.sit.homework;

import java.util.*;

public class PetHotel {
    public static void main(String[] args) {
        Map<String, Dog> dogs = new HashMap<String, Dog>();

        Dog dog1 = new Dog();
        dog1.setName("Ursi");

        Dog dog2 = new Dog();
        dog2.setName("Leo");

        Dog dog3 = new Dog();
        dog3.setName("Bobita");

        Dog dog4 = new Dog();
        dog4.setName("Rex");

        addDog(dog1, dogs);
        addDog(dog2, dogs);
        addDog(dog3, dogs);
        addDog(dog4, dogs);

        displayDogs(dogs);
        removeDog(dogs);
        displayDogs(dogs);
        sortDogsByName(dogs);
    }

    public static void displayDogs(Map<String, Dog> dogs) {
        System.out.println("=====================");
        System.out.println("List of dogs is: ");

        for (String key : dogs.keySet()) {
            System.out.println(dogs.get(key).getName());
        }
    }

    public static void addDog(Dog dog, Map<String, Dog> dogs) {
        Iterator iterator = dogs.keySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(dog.getName())) {
                return;
            }
        }

        dogs.put(dog.getName(), dog);
    }

    public static void removeDog(Map<String, Dog> dogs) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Removing dog by his name...");
        System.out.println("Enter the dog name:");
        String name = keyboard.nextLine();

        Iterator iterator = dogs.keySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(name)) {
                dogs.remove(name);
                return;
            }
        }

        System.out.println("I did not find the dog " + name);
    }

    public static void sortDogsByName(Map<String, Dog> dogs) {
        System.out.println("=====================");
        System.out.println("Sorting dogs by name...");

        TreeMap<String, Dog> sorted = new TreeMap<>();

        sorted.putAll(dogs);

        for (Map.Entry<String, Dog> entry : sorted.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
