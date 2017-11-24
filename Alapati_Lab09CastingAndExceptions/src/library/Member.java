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
 *
 * @author Vineeth Agarwal
 */
public class Member {

    private static int _919_counter = 900000;
    private int age;
    private Item[] items;
    private int itemsCount;
    private String memberID;
    private String name;

    public Member(String name, int age) {
        this.age = age;
        this.name = name;
        itemsCount = 0;
        memberID=generateMemberID();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItems(Item item) throws MaximumItemsReachedException, UnderAgeException {
        if (itemsCount >= items.length) {
            throw new MaximumItemsReachedException(getMemberID()
                    + ": You have reached your maximum limit");
        } else {
            if (item instanceof Book) {
                if (age >= ((Book) item).getGenre().getAge()) {
                    item.setTitle(item.getTitle().toUpperCase());
                    item.setAvailable(false);
                    items[itemsCount] = item;
                    itemsCount++;
                } else {
                    throw new UnderAgeException("exceptions.UnderAgeException: "
                            +getMemberID()+ ": Not allowed to "
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
                                +getMemberID() + ": The DVD has a "
                                + ((DVD) item).getRating().getDescription()
                                + " rating, Your are not allowed to check out this item");
                    }

                } 
                else if (item instanceof Device) {
                        item.setTitle(item.getTitle().toLowerCase());
                        item.setAvailable(false);
                        items[itemsCount] = item;
                        itemsCount++;

                }
            }

        }
    }

    public String generateMemberID() {
        Random r2 = new Random(20L);
        int x = r2.nextInt(_919_counter);
        _919_counter++;
        return "919" + x;
    }

    @Override
    public String toString() {
        String itemList = "";
        for (Item i : items) {
            if(i!=null){
            itemList += "\n" + 
                    i.toString();}
        }
        return "MemberID: " + getMemberID()+ "\nName: " + name + "\nAge: " + age
                + itemList;
    }

}
