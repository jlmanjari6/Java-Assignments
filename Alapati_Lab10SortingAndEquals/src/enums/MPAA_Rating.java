/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This enumerator contains Motion Picture Association of America(MPAA) rating description and age restriction for DVD
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public enum MPAA_Rating {
    G(0, "General Audiences"),
    NC_17(18, "Adults Only"),
    PG(12, "Parental Guidance Suggested"),
    PG_13(13, "Parents Strongly Cautioned"),
    R(17, "Restricted");

    private final int age;
    private final String description;

    /**
     * This getter method is used to access the age restriction
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * This getter method is used to access the rating description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    private MPAA_Rating(int age, String description) {
        this.age = age;
        this.description = description;
    }
}
