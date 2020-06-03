package com.revature.tourofheroes.models;

import com.revature.tourofheroes.exceptions.InvalidHealthValueException;

import java.util.Arrays;
import java.util.Objects;

//POJO - Plain old java object
public class Hero {
    //Class scope
    //attributes or fields
    //private access modifier, encapsulates my data
    //uses camelCase
    private String name;
    private String[] specialMove;
    private int healthLevel;
    private boolean isAlive;
    //static variable, then this variable would be class scope
    static {
        System.out.println("Hello World!");
    }

    //constructor
    // You can set default values for hero class
    // no args constructor
    public Hero() {

    }

    // parameterized with params
    public Hero(String name, String [] specialMove) {
        //calls the parent constructor
        super();
        this.name = name;
        this.specialMove = specialMove;

    }
    //method overloading, polymorphism, compile time
    public Hero(String name, String[] specialMove, int healthLevel, boolean isAlive) throws Exception {
        //used in constructor chaining
        this(name, specialMove);
        this.setHealthLevel(healthLevel);
        this.isAlive = isAlive;
    }

    public String getName() {
        //add logic on the data that's gonna be returned
        return name;
    }

    public void setName(String name) {
        // add some validation / logic in processing data per instance
        // check if name is numbers, recommend looking into Regex
        if(name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }

    public String [] getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String[] specialMove) {
        this.specialMove = specialMove;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) throws Exception {
        // this keeps it so that we dont have health levels that dont make sense
        // validation logic
        if(healthLevel < 0) {
            // throw exception
            throw new InvalidHealthValueException("Health level should not be negative");
        } else {
            this.healthLevel = healthLevel;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //annotation
    // this method overrides another method
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", specialMove=" + Arrays.toString(specialMove) +
                ", healthLevel=" + healthLevel +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return isAlive == hero.isAlive &&
                Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isAlive);
    }
}
