package com.example.codeclan.DwarvesOfKurak.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private Double itemStrength;

    @Column
    private Double buyCost;

    @Column
    private Double sellCost;

    @JsonIgnoreProperties(value="character")
    @ManyToOne
    @JoinColumn(name="held_by",referencedColumnName = "id")
    private Character character;

    @JsonIgnoreProperties(value="Encounter")
    @ManyToOne
    @JoinColumn(name="dropped_in",referencedColumnName = "id")
    private Encounter encounter;

    @Column
    private String image;

    public Item(String name, String type, Double itemStrength, Double buyCost, Double sellCost, String image) {
        this.name = name;
        this.type = type;
        this.itemStrength = itemStrength;
        this.buyCost = buyCost;
        this.sellCost = sellCost;
        this.character = null;
        this.encounter = null;
        this.image = image;
    }

    public Item (){

    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getItemStrength() {
        return itemStrength;
    }

    public void setItemStrength(Double itemStrength) {
        this.itemStrength = itemStrength;
    }

    public Double getBuyCost() {
        return buyCost;
    }

    public void setBuyCost(Double buyCost) {
        this.buyCost = buyCost;
    }

    public Double getSellCost() {
        return sellCost;
    }

    public void setSellCost(Double sellCost) {
        this.sellCost = sellCost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

