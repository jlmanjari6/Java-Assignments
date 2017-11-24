/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Vineeth Agarwal
 */
public enum MPAA_Rating {
    G("General Audiences",0),NC_17("Adults Only",18),
    PG("Parental Guidance Suggested",12),
    PG_13("Parents Strongly Cautioned",13),R("Restricted",17);

 private final String description;
 private final int age;

    private MPAA_Rating(String description, int age) {
        this.description = description;
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public int getAge() {
        return age;
    }
 
}
