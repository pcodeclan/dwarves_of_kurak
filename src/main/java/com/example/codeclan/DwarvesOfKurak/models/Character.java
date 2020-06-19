package com.example.codeclan.DwarvesOfKurak.models;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "gender")
    private String gender;

    @Column(name = "backStory")
    private String backStory;

    @Column(name = "weapon")
    private String weapon;

    @Column(name = "armour")
    private String armour;

    @Column(name = "hitPoints")
    private int hitPoints;

    @Column(name = "manaPoints")
    private int manaPoints;

    @Column(name = "strength")
    private int strength;

    @Column(name = "intelligence")
    private int intelligence;

//    @Column(name = "inventory")
//    private List<Item> inventory;
//
//    @Column(name = "skills")
//    private List<Skill> skills;

    @Column(name = "coinPurse")
    private int coinPurse;

//    @Column(name = "jobClass")
//    private Job job;

    public Character(String name, String race, String gender, String backStory) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.backStory = backStory;
        this.weapon = null;
        this.armour = null;
        this.hitPoints = 100;
        this.manaPoints = 50;
        this.strength = 5;
        this.intelligence = 5;
//        this.inventory = new ArrayList<Item>();
//        this.skills = new ArrayList<Skill>();
        this.coinPurse = 1000;
//        this.job = job;
    }

    public Character(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmour() {
        return armour;
    }

    public void setArmour(String armour) {
        this.armour = armour;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCoinPurse() {
        return coinPurse;
    }

    public void setCoinPurse(int coinPurse) {
        this.coinPurse = coinPurse;
    }

    public Long getId() {
        return id;
    }
}


//        attack(Enemy)
//        defend()
//        useItem(Item, Target)
//        useAbility(Skill, Target)
//        tradeItem(Item,Target)
//        sellItem(Item,Target)
//        buyItem(Item,Target)
//        addSkill(Skill)
//        removeSkill(Skill)
//        Equip(item)
//        Unequip(item)