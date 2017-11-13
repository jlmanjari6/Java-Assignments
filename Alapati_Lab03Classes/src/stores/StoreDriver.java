/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class StoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**********************Testing the Store Class**********************");
        Store store1 = new Store("Timmy Tommy Enterprises", 1000, "3127869900", "311 Jarvis Square", "Chicago", "Illinois", 60018);
        System.out.println("******************************************************\n" +
"Testing the Getter methods or Accessors of Store Class\n" +
"******************************************************");
        System.out.println("Store Name: " + store1.getStoreName());
        System.out.println("Store ID: " + store1.getStoreID());
        System.out.println("Street of the Store: "+ store1.getStreet());
        System.out.println("City of the Store: " + store1.getCity());
        System.out.println("State of the Store: " + store1.getState());
        System.out.println("Zip code of the Store: " + store1.getZipCode());
        System.out.println("Phone number of the Store: " + store1.getPhoneNumber());
        System.out.println("\n*****************************************\n" +
"Testing the toString method\n" +
"*****************************************");
        System.out.println(store1.toString());
        System.out.println("\n*****************************************\n" +
"Testing the user defined methods\n" +
"*****************************************");
        System.out.println("First word of store name: " + store1.getFirstWordOfStoreName());
        System.out.println("Middle word of the store name: " + store1.getMiddleWordOfStoreName());
        System.out.println("Last word of the store name: " + store1.getLatsWordOfStoreName());
        System.out.println("\nPrinting the store1 object after invoking the replace method");
        store1.replaceStoreName(store1.getStoreName(), "JC Penny Store");
        System.out.println(store1.toString());
        
        Store store2 = new Store();
        System.out.println("\n*********************************************************************\n" +
"Testing the Getter methods or Accessors of Store Class with no-arg constructor\n" +
"*********************************************************************");
        System.out.println("Store Name: " + store2.getStoreName());
        System.out.println("Store ID: " + store2.getStoreID());
        System.out.println("Street of the Store: "+ store2.getStreet());
        System.out.println("City of the Store : " + store2.getCity());
        System.out.println("State of the Store: " + store2.getState());
        System.out.println("Zip code of the Store: " + store2.getZipCode());
        System.out.println("Phone number of the Store: " + store2.getPhoneNumber());
        store2.setStoreName("KC India Mart");
        store2.setStoreID(1001);
        store2.setPhoneNumber("9136818080");
        store2.setStreet("8542 w 133rd Street");
        store2.setCity("Overland Park");
        store2.setState("Kansas");
        store2.setZipCode(66213);
        System.out.println("\n*********************************************************************\n" +
"Testing the store class using toString after invoking the Setter methods or Mutators\n" +
"*********************************************************************");
        System.out.println(store2.toString());
        
        System.out.println("\n********************************************************\n" +
"Testing the scanner class to take input from the console\n" +
"********************************************************");
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the store details\n" +
"Enter the store name:");
        String storeName = scannerObject.nextLine();
        System.out.println("Enter the store ID:");
        int storeId = scannerObject.nextInt();
        System.out.println("Enter the store phone number:");
        scannerObject.nextLine();
        String phone = scannerObject.nextLine();
        System.out.println("Enter the street name of the store:");
        String street = scannerObject.nextLine();
        System.out.println("Enter the city name, state name, zip code of the store in one\n" +
"   line without any commas: ");
        String cityStateZip = scannerObject.nextLine();
        Store store3 = new Store(storeName,storeId, phone, street, cityStateZip.substring(0, cityStateZip.indexOf(" ")),
                cityStateZip.substring(cityStateZip.indexOf(" ")+1, cityStateZip.lastIndexOf(" ")),
        Integer.parseInt(cityStateZip.substring(cityStateZip.lastIndexOf(" ") + 1, cityStateZip.length()))
        );

        System.out.println("****************************************************\n" +
"Testing the toString method without invoking the method\n" +
"****************************************************");
        System.out.println(store3);  
        System.out.println(storeName + " (" + store3.getStoreID() + ")\n" 
                + store3.getFormattedAddress() + "\n" + store3.getFormattedPhoneNumber());
    }
}
