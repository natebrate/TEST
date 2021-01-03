package com.example.test;

import javax.persistence.*;

/*
  this the class for the animalInfo Table
 */
@Entity
@Table(name = "animal") //Table name
public class Animal {
    // initiate variables

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalID; //primary key

    private String name;
    private int trainerID;
    private int speciesID;
    private int age;
    private String sex;
    private float weight;


    protected Animal() {
        /*empty constructor*/
    }

    protected Animal(long animalID, String name, int trainerID, int speciesID, int age, String sex, float weight) {
        super();
        this.animalID = animalID;
        this.name = name;
        this.trainerID = trainerID;
        this.speciesID = speciesID;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }


    /*
    GETTERS AND SETTERS FOR THE ANIMAL INFO TABLE
     */
    public long getAnimalID() {
        return animalID;
    }

    public void setAnimalID(long animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public int getSpeciesID() {
        return speciesID;
    }

    public void setSpeciesID(int speciesID) {
        this.speciesID = speciesID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Animal ID: " + this.animalID
                + ". Name:" + this.name
                + ". Trainer ID:" + this.trainerID
                + ". Species ID" + this.speciesID
                + ". Age" + this.age
                + ". Sex" + this.sex
                + ". Weight" + this.weight;
    } //example
}


