package Queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AnimalShelter {

    private int id;
    private Queue<Animal> animalQueue;

    public AnimalShelter(int id) {
        this.id = id;
        this.animalQueue = new LinkedList<>();
    }


    public Queue<Animal> getAnimalQueue() {
        return animalQueue;
    }

    public void setAnimalQueue(Queue<Animal> animalQueue) {
        this.animalQueue = animalQueue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void printAllAnimalsInQueue() {

        if (animalQueue.isEmpty()) {
            System.out.println("No animals are in the queue.");
        }

        for (Animal animal : animalQueue) {
            System.out.println(animal);
        }
    }


    public void addAnimal(Animal newAnimal) {
        try {
            animalQueue.add(newAnimal);
            System.out.println(newAnimal.getName() + " added to the queue." );
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
    }
    }


    public Animal deleteAnimal(Animal animalToDelete) {
        try {
            animalQueue.remove(animalToDelete);
            return animalToDelete;

        } catch (ClassCastException | NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }


    public Animal adoptCat() {
        Queue<Animal> catQueue = new LinkedList<>();
        for (Animal animal : animalQueue) {
            if (animal.getCat()) {
                catQueue.add(animal);
            }
        }

        try {
            Animal adoptedCat = catQueue.peek();
            if (!checkIfQueueIsNull(adoptedCat, "cats")) {
                return null;
            }
            animalQueue.remove(adoptedCat);
            System.out.println(adoptedCat.getName() + " has been adopted.");
            return adoptedCat;

        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Animal adoptDog() {
        Queue<Animal> dogQueue = new LinkedList<>();
        for(Animal animal : animalQueue) {
            if (!animal.getCat()) {
                dogQueue.add(animal);
            }
        }

        try {
            Animal adoptedDog = dogQueue.peek();
            if (!checkIfQueueIsNull(adoptedDog, "dogs")) {
                return null;
            }
            animalQueue.remove(adoptedDog);
            System.out.println(adoptedDog.getName() + " has been adopted.");
            return adoptedDog;

        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Animal adoptEitherPet() {
        try {
            Animal adoptedAnimal = animalQueue.peek();
            if (!checkIfQueueIsNull(adoptedAnimal, "animals")) {
                return null;
            }
            animalQueue.remove();
            System.out.println(adoptedAnimal.getName() + " has been adopted.");
            return adoptedAnimal;

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return null;
        }

    }


    @Override
    public String toString() {
        return "Animal Shelter " + this.getId();
    }


    public Boolean checkIfQueueIsNull(Animal adoptedAnimal, String animalType) {
        if (adoptedAnimal == null) {
            System.out.println("Error - no " + animalType + " are in the shelter.");
            return false;
        }
        return true;
    }



    public static void main(String[] args) {

        AnimalShelter shelter1 = new AnimalShelter(1);
        System.out.println(shelter1);


        shelter1.addAnimal(new Animal("Doug", false));
        shelter1.addAnimal(new Animal("Meow", true));
        shelter1.addAnimal(new Animal("Cat", true));
        shelter1.addAnimal(new Animal("Max", false));

        shelter1.adoptCat();
        shelter1.printAllAnimalsInQueue();






    }


}


