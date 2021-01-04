package com.example.test;

import javax.persistence.*;

/*
  this is the class for the Species Table
 */
@Entity
@Table(name = "species") //Table name
public class Species {

    //initiate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int specID; //Primary Key

    //rest of attributes
    private String Species;
    private String FeedingType;
    private int quantity;
    private String Description;
    private int LocationID;

    protected Species() {
        /*
        Empty Constructor
         */
    }

    protected Species(int specID, String Species, String FeedingType, int quantity, String Description, int LocationID) {
        super();
        this.specID = specID;
        this.Species = Species;
        this.FeedingType = FeedingType;
        this.quantity = quantity;
        this.Description = Description;
        this.LocationID = LocationID;
    }


    // GETTERS AND SETTERS
    public int getSpecID() {
        return specID;
    }

    public void setSpecID(int specID) {
        this.specID = specID;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String getFeedingType() {
        return FeedingType;
    }

    public void setFeedingType(String FeedingType) {
        this.FeedingType = FeedingType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public String toString() {
        return "Specie ID: " + this.specID
                + ". Species:" + this.Species
                + ". Feeding Type:" + this.FeedingType
                + ". Quantity" + this.quantity
                + ". Description" + this.Description
                + ". Location" + this.LocationID;
    } //example
}
