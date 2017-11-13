package library;

import enums.Genre;
import enums.MPAA_Rating;
import exceptions.MaximumItemsReachedException;
import exceptions.UnderAgeException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class LibraryDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("*******Lab09: Casting & Exceptions lab - Output*********");
        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(new File("library.txt"));
        LibraryManagement lmList = new LibraryManagement();
        FacultyList fList = new FacultyList();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Device> deviceList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();

        while (sc.hasNext()) {
            String memberType = sc.next();
            if (memberType.equals("Student")) {
                String courses = sc.next();
                int age = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                Student student = new Student(courses, age, name);
                while (sc.hasNext()) {
                    String type = sc.next();
                    if (type.toLowerCase().equals("book")) {
                        sc.nextLine();
                        String[] authors = sc.nextLine().split(",");
                        Author[] authorArray = new Author[authors.length];
                        for (int i = 0; i < authors.length; i++) {
                            String[] fullName = authors[i].split(" ");
                            if (fullName.length == 2) {
                                authorArray[i] = new Author(fullName[0], fullName[1]);
                            } else {
                                authorArray[i] = new Author(fullName[0], fullName[1], fullName[2]);
                            }
                        }
                        int copyrightYear = Integer.parseInt(sc.next());
                        double edition = Double.parseDouble(sc.next());
                        String genre = sc.next();
                        sc.nextLine();
                        String title = sc.nextLine();
                        Book book = new Book(authorArray, copyrightYear, edition, Genre.valueOf(genre), title);
                        try {
                            student.addItems(book);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                        bookList.add(book);
                    } else if (type.toLowerCase().equals("dvd")) {
                        MPAA_Rating rating = MPAA_Rating.valueOf(sc.next());
                        double storageCapacity = sc.nextDouble();
                        sc.nextLine();
                        String title = sc.nextLine();
                        DVD dvd = new DVD(rating, storageCapacity, title);
                        try {
                            student.addItems(dvd);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (type.toLowerCase().equals("device")) {
                        sc.nextLine();
                        String title = sc.nextLine();
                        Device device = new Device(title);
                        try {
                            student.addItems(device);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                        deviceList.add(device);
                    } else if (type.toLowerCase().equals("dates")) {
                        sc.nextLine();
                        LibraryManagement lm1 = new LibraryManagement(student, sc.nextLine(), sc.nextLine());
                        System.out.println("\n**********************************"
                                + "\n" + lm1.toString()
                                + "\n**********************************\n");
                        lmList.addMembers(student);
                        break;
                    }
                }
                studentList.add(student);
            } else if (memberType.equals("Faculty")) {
                String department = sc.next();
                sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt();
                Faculty faculty = new Faculty(department, name, age);
                while (sc.hasNext()) {
                    String type = sc.next();
                    if (type.toLowerCase().equals("book")) {
                        sc.nextLine();
                        String[] authors = sc.nextLine().split(",");
                        Author[] authorArray = new Author[authors.length];
                        for (int i = 0; i < authors.length; i++) {
                            String[] fullName = authors[i].split(" ");
                            if (fullName.length == 2) {
                                authorArray[i] = new Author(fullName[0], fullName[1]);
                            } else {
                                authorArray[i] = new Author(fullName[0], fullName[1], fullName[2]);
                            }
                        }
                        int copyrightYear = Integer.parseInt(sc.next());
                        double edition = Double.parseDouble(sc.next());
                        String genre = sc.next();
                        sc.nextLine();
                        String title = sc.nextLine();
                        Book book = new Book(authorArray, copyrightYear, edition, Genre.valueOf(genre), title);
                        try {
                            faculty.addItems(book);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                        bookList.add(book);
                    } else if (type.toLowerCase().equals("dvd")) {
                        MPAA_Rating rating = MPAA_Rating.valueOf(sc.next());
                        double storageCapacity = sc.nextDouble();
                        sc.nextLine();
                        String title = sc.nextLine();
                        DVD dvd = new DVD(rating, storageCapacity, title);
                        try {
                            faculty.addItems(dvd);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (type.toLowerCase().equals("device")) {
                        sc.nextLine();
                        String title = sc.nextLine();
                        Device device = new Device(title);
                        try {
                            faculty.addItems(device);
                        } catch (MaximumItemsReachedException | UnderAgeException e) {
                            System.out.println(e.getMessage());
                        }
                        deviceList.add(device);
                    } else if (type.toLowerCase().equals("dates")) {
                        sc.nextLine();
                        LibraryManagement lm1 = new LibraryManagement(faculty, sc.nextLine(), sc.nextLine());
                        System.out.println("\n**********************************"
                                + "\n" + lm1.toString()
                                + "\n**********************************\n");
                        lmList.addMembers(faculty);
                        break;
                    }
                }
                fList.addFaculty(faculty);
                fList.addFacultyNames(name);
            }

        }
        System.out.println("--------------------------------------\n"
                + "Printing Student details\n"
                + "--------------------------------------");
        for (Member s : lmList.getMemberList()) {
            if (s instanceof Student) {
                System.out.println(s.toString());
            }
        }

        System.out.println("--------------------------------------\n"
                + "Printing Faculty details\n"
                + "--------------------------------------");
        for (Member s : lmList.getMemberList()) {
            if (s instanceof Faculty) {
                System.out.println(s.toString());
            }
        }
        System.out.println("*******Lab10SortingAndEquals - Output*********");
        System.out.println("---------------------------------------------------------");
        Collections.sort(studentList);
        System.out.println("----------Checking Comparable Interface Implementation---------\n"
                + "-------------------------------------------------------------\n"
                + "Printing Student details sorting in natural order by their ID\n"
                + "-------------------------------------------------------------");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        Collections.sort(fList.getFacultyList());
        System.out.println("---------------------------------------------------------------\n"
                + "Printing Faculty details sorting in natural order by their name\n"
                + "---------------------------------------------------------------");
        for (Faculty f : fList.getFacultyList()) {
            System.out.println(f.toString());
        }

        Collections.sort(bookList, new BookComparator());
        System.out.println("--------Checking the Comparator Interface Implementation-------\n"
                + "------------------------------------------------------------\n"
                + "Printing List of Books by descending order of their edition\n"
                + "------------------------------------------------------------");
        for (Book b : bookList) {
            System.out.println(b.toString());
        }

        AnonymousDeviceList anonymousDList = new AnonymousDeviceList() {
            @Override
            public String deviceList() {
                String listOfDevices = "";
                for (Device d : deviceList) {
                    listOfDevices += d.getTitle() + "\n";
                }
                return listOfDevices;
            }
        };
        System.out.println("----------------Anonymous Class Implementation-----------------\n"
                + "------------------------------------------------------\n"
                + "Devices that are issued\n"
                + "------------------------------------------------------");
        System.out.println(anonymousDList.deviceList());

        System.out.println("-------Checking the overrided equals and hashCode methods------");
        System.out.println("Answer for: Your inference from test cases for equals()\n" + " Equals compare contents of the objects");
        System.out.println("Answer for: Your inference from test cases for hashcode()\n" + " Hashcode is same when contents of the objects are same");
        System.out.println("Answer for: Is all your test cases for equals() passed the tests or not. If not why???\n"
                + " NO, equalsTest2 method failed because the contents of the arrays are same and so, equals method should return true");
        System.out.println("Answer for: Is all your test cases for hashcode() passed the tests or not. If not why???\n"
                + " NO, hashCodeTest1 method failed because the contents of the arrays are different from each other.");

    }

}
