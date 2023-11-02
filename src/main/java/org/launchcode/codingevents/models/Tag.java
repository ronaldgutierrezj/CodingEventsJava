package org.launchcode.codingevents.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;


@Entity
public class Tag extends AbstractEntity {

    @Size(min=1, max = 25, message="Name must be at least 1 characters long")
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public Tag() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName(){ return "#" + name + " ";}

    @Override
    public String toString(){
        return name;
    }
}
