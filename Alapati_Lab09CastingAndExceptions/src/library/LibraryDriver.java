/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Genre;
import enums.MPAA_Rating;
import exceptions.MaximumItemsReachedException;
import exceptions.UnderAgeException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Vineeth Agarwal
 */
public class LibraryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc=new Scanner(new File("library.txt"));
        LibraryManagement lmList=new LibraryManagement();
        while(sc.hasNext())
        {
            String memberType=sc.next();
            if(memberType.equals("Student"))
            {
                String courses=sc.next();
                int age=sc.nextInt();
                int testcount=0;
                sc.nextLine();
                String name=sc.nextLine();
                Student student=new Student(courses,name,age);
                while(sc.hasNext())
                {
                    String itemType=sc.next();
                    if(itemType.equals("Book"))
                    {
                        sc.nextLine();
                        String[] authors=sc.nextLine().split(",");
                        Author[] authorArray=new Author[authors.length];
                        for(int i=0;i<authors.length;i++)
                        {
                            String[] fullName=authors[i].split(" ");
                            if(fullName.length==2)
                            {
                            authorArray[i]=new Author(fullName[0],fullName[1]);
                            }
                            else{
                            authorArray[i]=new Author(fullName[0],fullName[1],fullName[2]);
                            }
                        }

                              
                        int copyrightYear=sc.nextInt();
                        double edition=sc.nextDouble();
                        Genre genre=Genre.valueOf(sc.next());
                        sc.nextLine();
                        String title=sc.nextLine();
                        Book book =new Book(authorArray, copyrightYear, edition, genre, title);
                        try{
                            student.addItems(book);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                        
                    }
                     else if(itemType.equals("DVD"))
                    {
                        MPAA_Rating rating=MPAA_Rating.valueOf(sc.next());
                        double storageCapacity=sc.nextDouble();
                        sc.nextLine();
                        String title=sc.nextLine();
                        DVD dvd=new DVD(rating, storageCapacity, title);
                        try{
                            student.addItems(dvd);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                    
                    }
                   else if(itemType.equals("Device"))
                    {
                        sc.nextLine();
                        String title=sc.nextLine();
                        Device device=new Device(title);
                        try{
                            student.addItems(device);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    else if(itemType.equals("Dates"))
                        
                    {
                        sc.nextLine();
                        LibraryManagement lm1= new LibraryManagement(student, sc.nextLine(), sc.nextLine());
                        System.out.println("\n**********************************"
                                + "\n"+lm1.toString()+
                                "\n**********************************\n");
                        lmList.addMembers(student);
                        break;                        
                    }
                    

                
                }
            }
            else if(memberType.equals("Faculty"))
            {
                String department=sc.next();
                sc.nextLine();
                String name=sc.nextLine();
                int age=sc.nextInt();
                Faculty faculty=new Faculty(department, name, age);
                while(sc.hasNext())
                {
                  String itemType=sc.next();
                    if(itemType.equals("Book"))
                    {
                        sc.nextLine();
                        String[] authors=sc.nextLine().split(",");
                        Author[] authorArray=new Author[authors.length];
                        for(int i=0;i<authors.length;i++)
                        {
                            String[] fullName=authors[i].split(" ");
                            if(fullName.length==2)
                            {
                            authorArray[i]=new Author(fullName[0],fullName[1]);
                            }
                            else{
                            authorArray[i]=new Author(fullName[0],fullName[1],fullName[2]);
                            }
                        }

                              
                        int copyrightYear=sc.nextInt();
                        double edition=sc.nextDouble();
                        Genre genre=Genre.valueOf(sc.next());
                        sc.nextLine();
                        String title=sc.nextLine();
                        Book book =new Book(authorArray, copyrightYear, edition, genre, title);
                        try{
                            faculty.addItems(book);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                        
                    }
                    else if(itemType.equals("DVD"))
                    {
                        MPAA_Rating rating=MPAA_Rating.valueOf(sc.next());
                        double storageCapacity=sc.nextDouble();
                        sc.nextLine();
                        String title=sc.nextLine();
                        DVD dvd=new DVD(rating, storageCapacity, title);
                        try{
                            faculty.addItems(dvd);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                    
                    }
                    else if(itemType.equals("Device"))
                    {
                        sc.nextLine();
                        String title=sc.nextLine();
                        Device device=new Device(title);
                        try{
                            faculty.addItems(device);
                        } catch (MaximumItemsReachedException | UnderAgeException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    else if(itemType.equals("Dates"))
                    {
                        sc.nextLine();
                        LibraryManagement lm2= new LibraryManagement(faculty, sc.nextLine(), sc.nextLine());
                        System.out.println("\n**********************************"
                                + "\n"+lm2.toString()+
                                "\n**********************************\n");
                        lmList.addMembers(faculty);
                        break;                        
                    }
                    

                
                }
            }
            
        }
    }
    
}
