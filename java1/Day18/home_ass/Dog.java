package Day18;

class Animal {
 String name;


 Animal(String name) {
     this.name = name;
     System.out.println("Animal constructor called. Name: " + name);
 }
}


class Dog extends Animal {
 String breed;

 
 Dog(String name, String breed) {
     super(name); 
     this.breed = breed;
     System.out.println("Dog constructor called. Breed: " + breed);
 }
 public static void main(String[] args) {
     Dog myDog = new Dog("Buddy", "Golden Retriever");
 }
}


