package com.example.test;

import javax.persistence.*;

/*
  this is the class for the Species Table
 */
@Entity
@Table(name = "species") //Table name
//entity class named Species maps with table species
public class Species {

    //initiate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int specID; //Primary Key

    //rest of attributes
    private String species;
    private String feeding_type;
    private int quantity;
    private String description;
    private int locationID;

    protected Species() {
        /*
        Empty Constructor
         */
    }

    protected Species(int specID, String species, String feeding_type, int quantity, String description, int locationID) {
        super();
        this.specID = specID;
        this.species = species;
        this.feeding_type = feeding_type;
        this.quantity = quantity;
        this.description = description;
        this.locationID = locationID;
    }


    // GETTERS AND SETTERS
    public int getSpecID() {
        return specID;
    }

    public void setSpecID(int specID) {
        this.specID = specID;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String Species) {
        this.species = species;
    }

    public String getFeedingType() {
        return feeding_type;
    }

    public void setFeedingType(String feeding_type) {
        this.feeding_type = feeding_type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String toString() {
        return "Specie ID: " + this.specID
                + ". Species:" + this.species
                + ". Feeding Type:" + this.feeding_type
                + ". Quantity" + this.quantity
                + ". Description" + this.description
                + ". Location" + this.locationID;
    } //example
}
