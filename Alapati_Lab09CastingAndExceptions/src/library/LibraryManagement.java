/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vineeth Agarwal
 */
public class LibraryManagement {
    private java.lang.String	actualReturnDate;
    private java.lang.String	dueDate;
    private Member	member;
    private java.util.List<Member>	memberList;

    public LibraryManagement() {
        this.memberList = new ArrayList<>();
    }

    public LibraryManagement(Member member, String dueDate,String actualReturnDate ) {
        this.actualReturnDate = actualReturnDate;
        this.dueDate = dueDate;
        this.member = member;
        this.memberList = new ArrayList<>();        
    }
    
    public void addMembers(Member member)
    {
        memberList.add(member);
    }

    public List<Member> getMemberList() {
        return memberList;
    }
    
    public double totalFine() throws NoFineException
    {
        double totalFine=0;

        for(Item item :member.getItems())
        {
             if(item!=null){
            totalFine+=item.calculateFine(dueDate, actualReturnDate);
                    }
        }
        return totalFine;
    }

    
    @Override
    public String toString() {
        try {
            return member.toString()+"\n Due Date: " + dueDate + " Return Date: "
                    + actualReturnDate +" Fine Amount: "+totalFine();
        } catch (NoFineException ex) {
            return ex.getMessage();
        }
    }
    
    
}
