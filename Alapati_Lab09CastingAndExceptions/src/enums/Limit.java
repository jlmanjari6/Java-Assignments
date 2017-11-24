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
public enum Limit {
    FACULTY(4),STUDENT(3);
    private final int itemLimit;

    private Limit(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public int getItemLimit() {
        return itemLimit;
    }
    
    
}
