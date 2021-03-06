/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.MaximumItemsReachedException;
import exceptions.UnderAgeException;
import java.util.Random;

/**
 * Member represents a library member
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public abstract class Member implements Comparable<Member> {

    private static int _919_counter = 900000;
    private int age;
    private Item[] items;
    private int itemsCount;
    private String memberID;
    private String name;

    /**
     * Initializes itemsCount to 0.
     *
     * @param name
     * @param age
     */
    public Member(String name, int age) {
        this.age = age;
        this.name = name;
        itemsCount = 0;
        memberID = generateMemberID();
    }

    /**
     * Returns age of the member
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age of the member
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Return an item array
     *
     * @return items
     */
    public Item[] getItems() {
        return items;
    }

    /**
     * Sets an item array
     *
     * @param items
     */
    public void setItems(Item[] items) {
        this.items = items;
    }

    /**
     * Returns MemberID of member
     *
     * @return memberId
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * This method returns a unique ID.
     *
     * @return memberId
     */
    public String generateMemberID() {
        Random r = new Random(20L);
        int c = r.nextInt(_919_counter);
        _919_counter++;
        return "919" + c;
    }

    /**
     * This method add items to items array.
     *
     * @param item
     * @throws MaximumItemsReachedException
     * @throws UnderAgeException
     */
    public void addItems(Item item)
            throws MaximumItemsReachedException,
            UnderAgeException {
        if (itemsCount >= items.length) {
            throw new MaximumItemsReachedException("exceptions.MaximumItemsReachedException: "
                    + getMemberID() + ": You have reached your maximum limit");
        } else {
            if (item instanceof Book) {
                if (age >= ((Book) item).getGenre().getAge()) {
                    item.setTitle(item.getTitle().toUpperCase());
                    item.setAvailable(false);
                    items[itemsCount] = item;
                    itemsCount++;
                } else {
                    throw new UnderAgeException("exceptions.UnderAgeException: "
                            + getMemberID() + ": Not allowed to "
                            + "check out this book");
                }
            } else {
                if (item instanceof DVD) {
                    if (age > ((DVD) item).getRating().getAge()) {
                        item.setTitle(item.getTitle().toLowerCase());
                        item.setAvailable(false);
                        items[itemsCount] = item;
                        itemsCount++;
                    } else {
                        throw new UnderAgeException("exceptions.UnderAgeException: "
                                + getMemberID() + ": The DVD has a "
                                + ((DVD) item).getRating().getDescription()
                                + " rating, Your are not allowed to check out this item");
                    }

                } else if (item instanceof Device) {
                    item.setTitle(item.getTitle().toLowerCase());
                    item.setAvailable(false);
                    items[itemsCount] = item;
                    itemsCount++;

                }
            }

        }
    }

    /**
     * String representation of Member in given format.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        String itemList = "";
        for (Item i : items) {
            if (i != null) {
                itemList += "\n"
                        + i.toString();
            }
        }
        return "MemberID: " + getMemberID() + "\nName: " + name + "\nAge: " + age
                + itemList;
    }

    /**
     * Returns name of the member
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of the member
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * to sort memberId and name
     *
     * @param o
     * @return boolean
     */
    @Override
    public int compareTo(Member o) {
        if (o instanceof Student) {
            return memberID.compareTo(o.getMemberID());
        } else {
            return name.compareTo(o.getName());
        }
    }

}
