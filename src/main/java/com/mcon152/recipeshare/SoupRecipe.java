package com.mcon152.recipeshare;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SOUP")
public class SoupRecipe extends Recipe {


    private Integer spiceLevel;

    public SoupRecipe() { super(); }

    public SoupRecipe(Long id, String title, String description, String ingredients, String instructions, Integer servings, Integer spiceLevel) {
        super(id, title, description, ingredients, instructions, servings);
        this.spiceLevel = spiceLevel;
    }

    public Integer getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(Integer spiceLevel) {
        this.spiceLevel = spiceLevel;
    }
}
