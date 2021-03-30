package com.company;

public class Main {

    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setColor(Color.BLACK);
    Shelter shelter = new Shelter("Shelter №1"," Togolok Moldo 12");
    dog.setShelter(shelter);
    dog.setBreed("Doberman");
    dog.setName("Mike");
    dog.setCommands(new String[]{"run","sit"});
        System.out.println(dog.getInfo());


       Dog dog1 = new Dog("Levi","Haski",Color.GRAY,new Shelter("Shelter №2","Chapaeva 1/2"));
        System.out.println(dog1.getInfo());

        Dog dog2 = new Dog("Charly","Bulldog",Color.GRAY,new Shelter("Shelter №3","Alma 5/2"), new String[]{"Jump","Give hand"});
        System.out.println(dog2.getInfo());
    }


}

