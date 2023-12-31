package com.example.medieval_marvels_and_might.Enemies;

import java.io.Serializable;

public class Enemy implements Serializable {

    private final String name;
    private final int damage;
    private final int health;


    public Enemy(String name, int health, int damage){

        this.name = name;
        this.damage = damage;
        this.health = health;


    }

    public String getEnemyName(){
        return this.name;
    }

    public int getEnemyDamage(){
        return this.damage;

    }

    public int getEnemyHealth(){
        return this.health;

    }

}
