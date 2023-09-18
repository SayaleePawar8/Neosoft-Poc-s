package com.collections;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student otherStudent) {
        
        return Integer.compare(this.age, otherStudent.age);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class SortDemo{
    public static void main(String[] args) {
       
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sayalee", 20));
        students.add(new Student("Sanjay", 22));
        students.add(new Student("Renuka", 19));

        
        Collections.sort(students);
        System.out.println("Students sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }

        
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Collections.sort(students, nameComparator);
        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}