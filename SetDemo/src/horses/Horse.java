/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

import java.util.Objects;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Horse {
    private String name;
    private String breed;
    private int yearOfBirth;

    public Horse(String name, String breed, int yearOfBirth) {
        this.name = name;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", breed=" + breed + ", yearOfBirth=" + yearOfBirth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.breed);
        hash = 97 * hash + this.yearOfBirth;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horse other = (Horse) obj;
        if (this.yearOfBirth != other.yearOfBirth) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        return true;
    }

      
    
}
