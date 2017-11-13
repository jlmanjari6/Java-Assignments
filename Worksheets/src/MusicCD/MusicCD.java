/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicCD;

/**
 *
 * @author S530719
 */

public class MusicCD {
    
    private String title;
    private String artist;
    
    /**
     * 
     * @param titleIn
     * @param artistIn 
     */    
     
    public MusicCD(String titleIn,String artistIn)
    {
        title = titleIn;
        artist = artistIn;
    }
    
    /**
     * default constructor
     */
    public MusicCD()
    {
        title = "default title";
        artist = "default artist";
    }
    
    /**
     * 
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * 
     * @return artist
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * 
     * @param title 
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * 
     * @param artist 
     */
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    
}