package com.example.test;

import javax.persistence.*;

@Entity
@Table(name = "species")
public class Species {
    //initiate Variables
    private int SpecID;
    private String Species;
    private String FeedingType;
    private int quantity;
    private String Description;
    private int LocationID;


    protected Species(int SpecID, String Species, String FeedingType, int quantity, String Description, int LocationID) {
        super();
        this.SpecID = SpecID;
        this.Species = Species;
        this.FeedingType = FeedingType;
        this.quantity = quantity;
        this.Description = Description;
        this.LocationID = LocationID;
    }

    protected Species() {

    }

    // GETTERS AND SETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSpecID() {
        return SpecID;
    }

    public void setSpecID(int SpecID) {
        this.SpecID = SpecID;
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
}
