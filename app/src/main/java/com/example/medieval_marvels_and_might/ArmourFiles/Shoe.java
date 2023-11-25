package com.example.medieval_marvels_and_might.ArmourFiles;

import com.example.medieval_marvels_and_might.ArmourFiles.Armour;

import java.io.Serializable;

public class Shoe extends Armour implements Serializable {

    /* Class Variables */
    private static final long serialVersionUID = 1L;

    /* Constructors */
    public Shoe(String name, int durability, int defenseRating) {
        super(name, durability, defenseRating);
    }
}