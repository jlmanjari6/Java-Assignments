/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This enumerator contains the genre of a book with age assigned to it.
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public enum Genre {
    BIOGRAPHY(3), DRAMA(5), FANTASY(3), HORROR(17), MYSTERY(10), POETRY(1), ROMANCE(12), SCIENCE_FICTION(8);

    private final int age;

    /**
     * This getter method is used to access the age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    private Genre(int age) {
        this.age = age;
    }
}
