/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Store {
    private String storeName;
    private int storeID;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    
    /**
     * 
     * @param storeName
     * @param storeID
     * @param phoneNumber
     * @param street
     * @param city
     * @param state
     * @param zipCode 
     */
    public Store(String storeName, int storeID, String phoneNumber, String street, String city
                            , String state, int zipCode)
    {
        this.storeName = storeName;
        this.storeID = storeID;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;  
    }       
    
    /**
     * default constructor
     */
    public Store()
    {        
    
    }
    
    /**
     * 
     * @return storeName
     */
    public String getStoreName()
    {
        return storeName;
    }
    
    /**
     * 
     * @param storeName 
     */
    public void setStoreName(String storeName)
    {
        this.storeName = storeName;
    }
    
    /**
     * 
     * @return storeID
     */
    public int getStoreID() 
    {
        return storeID;
    }

    /**
     * 
     * @param storeID 
     */
    public void setStoreID(int storeID)
    {
        this.storeID = storeID;
    }

    /**
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return street
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * 
     * @param street 
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * 
     * @return city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * 
     * @param city 
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * 
     * @return state
     */
    public String getState() 
    {
        return state;
    }

    /**
     * 
     * @param state 
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * 
     * @return zipCode
     */
    public int getZipCode() 
    {
        return zipCode;
    }

    /**
     * 
     * @param zipCode 
     */
    public void setZipCode(int zipCode) 
    {
        this.zipCode = zipCode;
    }
    
    /**
     * 
     * @return formatted address
     */
    public String getFormattedAddress()
    {
        return getStreet() + "\n" + getCity() + ", " + getState() + "-" + getZipCode();
    }
    
    /**
     * 
     * @return formatted phone number
     */
    public String getFormattedPhoneNumber()
    {
        return "(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10);
    }
    
    /**
     * 
     * @param oldName
     * @param newName 
     */
    public void replaceStoreName(String oldName, String newName)
    {
        storeName = storeName.replace(oldName, newName);
    }
    
    /**
     * 
     * @return first word of store name
     */
    public String getFirstWordOfStoreName()
    {
        return storeName.substring(0, storeName.indexOf(" "));
    }
    
    /**
     * 
     * @return middle word of store name
     */
    public String getMiddleWordOfStoreName()
    {
        return storeName.substring(storeName.indexOf(" ")+1, storeName.lastIndexOf(" "));
    }
    
    /**
     * 
     * @return last word of store name
     */
    public String getLatsWordOfStoreName()
    {
      return storeName.substring(storeName.lastIndexOf(" ") + 1, storeName.length());
    }    
   
    /**
     * 
     * @return to string result of formatted output
     */
    public String toString()
    {
        return storeName + " (" + storeID + ")\n" + getFormattedAddress() + "\n" + getFormattedPhoneNumber();
    }    
}
