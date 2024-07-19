package com.example;

public class Character {
    private String name;
    private int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
Employee.java
java
Copy code
package com.example;

public class Employee extends Character {
    private String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work as a " + role + ".");
    }
}
