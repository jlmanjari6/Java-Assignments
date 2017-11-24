    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws4;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Dog implements Comparable<Dog>{
    private String breed;
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return breed + " " + name + " " + age;
    }

    @Override
    public int compareTo(Dog o) {
      if(breed.equals(o.breed)){
          return name.compareTo(o.name);
      }
      return breed.compareTo(o.breed);
    }
    
    
}
