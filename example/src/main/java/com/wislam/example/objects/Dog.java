package com.wislam.example.objects;

// Khai_báo class

public class Dog extends Animal {
    // Biến Thể_hiện
    String name;
    String breed;
    int age;
    String color;

    // Khai_báo Constructor
    public Dog(String name, String breed, int age,
               String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Dog() {}

    // method 1
    public String getName() { return name; }

    // method 2
    public String getBreed() { return breed; }

    // method 3
    public int getAge() { return age; }

    // method 4
    public String getColor() { return color; }

    @Override public String toString()
    {
        return ("Chào tên của tôi là " + this.getName()
                + ".\nGiống_loài(breed), tuổi và màu sắc là  "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
}
