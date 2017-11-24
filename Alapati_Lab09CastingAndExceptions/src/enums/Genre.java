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
public enum Genre {
    BIOGRAPHY(3),DRAMA(5),
    FANTASY(3),HORROR(17),MYSTERY(10),POETRY(1),ROMANCE(12),
    SCIENCE_FICTION(8);
private final int age;

    private Genre(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }    
}
