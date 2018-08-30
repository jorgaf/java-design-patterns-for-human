package com.j4loxa.j4edu.designpatterns.creational.prototype;

public class Sheep implements Cloneable{
    private String name;
    private String category;

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Sheep(String name) {
        this.name = name;
        this.category = "Mountain Sheep";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
