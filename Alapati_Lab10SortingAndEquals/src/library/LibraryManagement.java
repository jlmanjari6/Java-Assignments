/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import java.util.ArrayList;
import java.util.List;

/**
 * Library Management represents check-in and check-out dates of items by a
 * member
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017
 */
public class LibraryManagement {

    private String actualReturnDate;
    private String dueDate;
    private Member member;
    private List<Member> memberList;

    /**
     * Initializes the variables of this class and initializes the memberList
     * with ArrayList.
     *
     * @param member
     * @param dueDate
     * @param actualReturnDate
     */
    public LibraryManagement(Member member, String dueDate, String actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
        this.dueDate = dueDate;
        this.member = member;
        this.memberList = new ArrayList<>();
    }

    /**
     * Initializes the memberList with ArrayList
     */
    public LibraryManagement() {
        this.memberList = new ArrayList<>();
    }

    /**
     * This method returns the total fine by calculating individual fine for
     * each item checked out by library member.
     *
     * @return totalFine
     * @throws NoFineException
     */
    public double totalFine() throws NoFineException {
        double totalFine = 0;
        for (Item item : member.getItems()) {
            if (item != null) {
                totalFine += item.calculateFine(dueDate, actualReturnDate);
            }
        }
        return totalFine;
    }

    /**
     * This method add members to the memberList
     *
     * @param member
     */
    public void addMembers(Member member) {
        memberList.add(member);
    }

    /**
     * Returns the members list of library
     *
     * @return memberList
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /**
     * Returns all the private instance variables and total fine.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        try {
            return member.toString() + " Due Date: " + dueDate + " Return Date: "
                    + actualReturnDate + " Fine Amount: " + totalFine();
        } catch (NoFineException ex) {
            return ex.getMessage();
        }
    }
}
