/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This enumerator contains number of items student or faculty can check out
 *
 * @author Lakshmi Manjari Alapati
 */
public enum Limit {
    FACULTY(4), STUDENT(3);

    private final int itemLimit;

    /**
     * This getter method is used to access the item limit
     *
     * @return itemLimit
     */
    public int getItemLimit() {
        return itemLimit;
    }

    private Limit(int itemLimit) {
        this.itemLimit = itemLimit;
    }
}
