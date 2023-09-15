package com.seriaization.deserialization;


import java.io.*;

class Person implements Serializable {
 private static final long serialVersionUID = 1L; // Serialization version UID
 private String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

  @Override
 public String toString() {
     return "Person [name=" + name + ", age=" + age + "]";
 }
}

public class SerializationDeserialization {
 public static void main(String[] args) {
     Person person = new Person("Alice", 30);

     
     try (FileOutputStream fileOut = new FileOutputStream("person.ser");
          ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

         objectOut.writeObject(person);

         System.out.println("Person object has been serialized and saved to person.ser");
     } catch (IOException e) {
         e.printStackTrace();
     }

     try (FileInputStream fileIn = new FileInputStream("person.ser");
          ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

         Person deserializedPerson = (Person) objectIn.readObject();

         System.out.println("Deserialized Person object: " + deserializedPerson);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}